package com.xiepanpan.ecps.dao.impl;

import com.xiepanpan.ecps.dao.EbParaValueDao;
import com.xiepanpan.ecps.dao.EbSkuDao;
import com.xiepanpan.ecps.model.EbParaValue;
import com.xiepanpan.ecps.model.EbSku;
import com.xiepanpan.ecps.model.EbSpecValue;
import com.xiepanpan.ecps.utils.ECPSUtils;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.stereotype.Repository;
import redis.clients.jedis.Jedis;

import java.util.List;
import java.util.Map;

/**
 * describe:
 *
 * @author xiepanpan
 * @date 2018/10/31
 */
@Repository
public class EbSkuDaoImpl extends SqlSessionDaoSupport implements EbSkuDao {

    String ns="com.xiepanpan.ecps.mapper.EbSkuMapper.";
    String ns1="com.xiepanpan.ecps.mapper.EbSpecValueMapper.";

    @Override
    public void saveSku(List<EbSku> ebSkuList, Long itemId) {
        SqlSession sqlSession = this.getSqlSession();
        for (EbSku ebSku :ebSkuList) {
            ebSku.setItemId(itemId);
            //插入数据 并返回主键
            sqlSession.insert(ns+"insert",ebSku);
            List<EbSpecValue> ebSpecValueList = ebSku.getEbSpecValueList();
            for (EbSpecValue ebSpecValue :ebSpecValueList) {
                ebSpecValue.setSkuId(ebSku.getSkuId());
                sqlSession.insert(ns1+"insert",ebSpecValue);
            }

        }
    }

    @Override
    public EbSku getSkuById(Long skuId) {
        return this.getSqlSession().selectOne(ns+"selectByPrimaryKey",skuId);
    }

    @Override
    public List<EbSku> selectSkuList() {
        return this.getSqlSession().selectList(ns+"selectSkuList");
    }

    @Override
    public List<EbSku> selectSkuDetailList() {

        return this.getSqlSession().selectList(ns+"selectSkuDetailList");
    }

    @Override
    public int updateStock(Map<String, Object> map) {
        return this.getSqlSession().update(ns+"updateStock",map);
    }

    @Override
    public void updateStockRedis(Map<String, Object> map) {
        Jedis jedis = new Jedis(ECPSUtils.readProp("redis_ip"), Integer.parseInt(ECPSUtils.readProp("redis_port")),100000);
        Long skuId = (Long) map.get("skuId");
        Integer quantity = (Integer) map.get("quantity");
        jedis.hset("ebSku:"+skuId,"stockInventory",new Integer(jedis.hget("ebSku:"+skuId,"stockInventory"))-quantity+"");
    }
}
