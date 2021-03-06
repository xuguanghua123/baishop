package com.baishop.entity.goods;

import java.io.Serializable;

public class Brands implements Serializable {

	private static final long serialVersionUID = -4201949973757611472L;

	/**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column bai_brands.brand_id
     *
     * @ibatorgenerated Mon Oct 10 17:03:01 CST 2011
     */
    private Integer brandId;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column bai_brands.brand_name
     *
     * @ibatorgenerated Mon Oct 10 17:03:01 CST 2011
     */
    private String brandName;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column bai_brands.brand_logo
     *
     * @ibatorgenerated Mon Oct 10 17:03:01 CST 2011
     */
    private String brandLogo;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column bai_brands.brand_desc
     *
     * @ibatorgenerated Mon Oct 10 17:03:01 CST 2011
     */
    private String brandDesc;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column bai_brands.sort
     *
     * @ibatorgenerated Mon Oct 10 17:03:01 CST 2011
     */
    private Integer sort;

    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database column bai_brands.is_show
     *
     * @ibatorgenerated Mon Oct 10 17:03:01 CST 2011
     */
    private Byte isShow;

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column bai_brands.brand_id
     *
     * @return the value of bai_brands.brand_id
     *
     * @ibatorgenerated Mon Oct 10 17:03:01 CST 2011
     */
    public Integer getBrandId() {
        return brandId;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column bai_brands.brand_id
     *
     * @param brandId the value for bai_brands.brand_id
     *
     * @ibatorgenerated Mon Oct 10 17:03:01 CST 2011
     */
    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column bai_brands.brand_name
     *
     * @return the value of bai_brands.brand_name
     *
     * @ibatorgenerated Mon Oct 10 17:03:01 CST 2011
     */
    public String getBrandName() {
        return brandName;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column bai_brands.brand_name
     *
     * @param brandName the value for bai_brands.brand_name
     *
     * @ibatorgenerated Mon Oct 10 17:03:01 CST 2011
     */
    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column bai_brands.brand_logo
     *
     * @return the value of bai_brands.brand_logo
     *
     * @ibatorgenerated Mon Oct 10 17:03:01 CST 2011
     */
    public String getBrandLogo() {
        return brandLogo;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column bai_brands.brand_logo
     *
     * @param brandLogo the value for bai_brands.brand_logo
     *
     * @ibatorgenerated Mon Oct 10 17:03:01 CST 2011
     */
    public void setBrandLogo(String brandLogo) {
        this.brandLogo = brandLogo;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column bai_brands.brand_desc
     *
     * @return the value of bai_brands.brand_desc
     *
     * @ibatorgenerated Mon Oct 10 17:03:01 CST 2011
     */
    public String getBrandDesc() {
        return brandDesc;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column bai_brands.brand_desc
     *
     * @param brandDesc the value for bai_brands.brand_desc
     *
     * @ibatorgenerated Mon Oct 10 17:03:01 CST 2011
     */
    public void setBrandDesc(String brandDesc) {
        this.brandDesc = brandDesc;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column bai_brands.sort
     *
     * @return the value of bai_brands.sort
     *
     * @ibatorgenerated Mon Oct 10 17:03:01 CST 2011
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column bai_brands.sort
     *
     * @param sort the value for bai_brands.sort
     *
     * @ibatorgenerated Mon Oct 10 17:03:01 CST 2011
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method returns the value of the database column bai_brands.is_show
     *
     * @return the value of bai_brands.is_show
     *
     * @ibatorgenerated Mon Oct 10 17:03:01 CST 2011
     */
    public Byte getIsShow() {
        return isShow;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method sets the value of the database column bai_brands.is_show
     *
     * @param isShow the value for bai_brands.is_show
     *
     * @ibatorgenerated Mon Oct 10 17:03:01 CST 2011
     */
    public void setIsShow(Byte isShow) {
        this.isShow = isShow;
    }
}