package com.xiepanpan.ecps.controller;

import com.xiepanpan.ecps.model.EbBrand;
import com.xiepanpan.ecps.model.EbFeature;
import com.xiepanpan.ecps.model.EbItem;
import com.xiepanpan.ecps.service.EbBrandService;
import com.xiepanpan.ecps.service.EbFeatureService;
import com.xiepanpan.ecps.service.EbItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * describe:
 *
 * @author xiepanpan
 * @date 2018/11/12
 */
@Controller
@RequestMapping("/item")
public class EbItemController {

    @Autowired
    private EbBrandService ebBrandService;
    @Autowired
    private EbFeatureService ebFeatureService;
    @Autowired
    private EbItemService ebItemService;

    /**
     * 跳转到首页
     * @return
     */
    @RequestMapping("/toIndex.do")
    public String toIndex(Model model) {
        //查询品牌
        List<EbBrand> brandList = ebBrandService.selectBrandAll();
        model.addAttribute("brandList",brandList);
        //查询筛选属性
        List<EbFeature> featureList = ebFeatureService.selectIsSelectFeature();
        model.addAttribute("featureList",featureList);
        return "index";
    }

    /**
     * 首页的搜索结果页面
     * @param price 价格
     * @param brandId 品牌Id
     * @param keyWords 关键词搜索结果
     * @param paraVals 参数值
     * @return
     */
    @RequestMapping("/listItem.do")
    public String listItem(String price,Long brandId,String keyWords,String paraVals,Model model) throws Exception {
        List<EbItem> ebItemList = ebItemService.listItemByIndex(price, brandId, keyWords, paraVals);
        model.addAttribute("ebItemList",ebItemList);
        return "phoneClassification";
    }
}