package com.xiepanpan.ecps.model;

public class EbParaValue {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EB_PARA_VALUE.PARA_ID
     *
     * @mbggenerated Thu Nov 08 23:32:17 SGT 2018
     */
    private Long paraId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EB_PARA_VALUE.ITEM_ID
     *
     * @mbggenerated Thu Nov 08 23:32:17 SGT 2018
     */
    private Long itemId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EB_PARA_VALUE.FEATURE_ID
     *
     * @mbggenerated Thu Nov 08 23:32:17 SGT 2018
     */
    private Long featureId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column EB_PARA_VALUE.PARA_VALUE
     *
     * @mbggenerated Thu Nov 08 23:32:17 SGT 2018
     */
    private String paraValue;


    private String featureName;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EB_PARA_VALUE.PARA_ID
     *
     * @return the value of EB_PARA_VALUE.PARA_ID
     *
     * @mbggenerated Thu Nov 08 23:32:17 SGT 2018
     */
    public Long getParaId() {
        return paraId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EB_PARA_VALUE.PARA_ID
     *
     * @param paraId the value for EB_PARA_VALUE.PARA_ID
     *
     * @mbggenerated Thu Nov 08 23:32:17 SGT 2018
     */
    public void setParaId(Long paraId) {
        this.paraId = paraId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EB_PARA_VALUE.ITEM_ID
     *
     * @return the value of EB_PARA_VALUE.ITEM_ID
     *
     * @mbggenerated Thu Nov 08 23:32:17 SGT 2018
     */
    public Long getItemId() {
        return itemId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EB_PARA_VALUE.ITEM_ID
     *
     * @param itemId the value for EB_PARA_VALUE.ITEM_ID
     *
     * @mbggenerated Thu Nov 08 23:32:17 SGT 2018
     */
    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EB_PARA_VALUE.FEATURE_ID
     *
     * @return the value of EB_PARA_VALUE.FEATURE_ID
     *
     * @mbggenerated Thu Nov 08 23:32:17 SGT 2018
     */
    public Long getFeatureId() {
        return featureId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EB_PARA_VALUE.FEATURE_ID
     *
     * @param featureId the value for EB_PARA_VALUE.FEATURE_ID
     *
     * @mbggenerated Thu Nov 08 23:32:17 SGT 2018
     */
    public void setFeatureId(Long featureId) {
        this.featureId = featureId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column EB_PARA_VALUE.PARA_VALUE
     *
     * @return the value of EB_PARA_VALUE.PARA_VALUE
     *
     * @mbggenerated Thu Nov 08 23:32:17 SGT 2018
     */
    public String getParaValue() {
        return paraValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column EB_PARA_VALUE.PARA_VALUE
     *
     * @param paraValue the value for EB_PARA_VALUE.PARA_VALUE
     *
     * @mbggenerated Thu Nov 08 23:32:17 SGT 2018
     */
    public void setParaValue(String paraValue) {
        this.paraValue = paraValue;
    }

    public String getFeatureName() {
        return featureName;
    }

    public void setFeatureName(String featureName) {
        this.featureName = featureName;
    }
}