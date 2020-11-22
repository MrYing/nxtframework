package com.newxton.nxtframework.entity;

import java.io.Serializable;

/**
 * (NxtProduct)实体类
 *
 * @author makejava
 * @since 2020-11-19 13:58:10
 */
public class NxtProduct implements Serializable {
    private static final long serialVersionUID = -79299512784945929L;
    
    private Long id;
    
    private Long categoryId;
    
    private Long brandId;
    /**
    * 产品名称
    */
    private String productName;
    /**
    * 副标题（营销使用）
    */
    private String productSubtitle;
    /**
    * 单次最少购买
    */
    private Long dealQuantityMin;
    /**
    * 单次最多购买
    */
    private Long dealQuantityMax;
    /**
    * 包邮
    */
    private Integer freeShipping;
    /**
    * 运费模版
    */
    private Long deliveryConfigId;
    /**
    * 货号
    */
    private String itemNo;
    /**
    * 重量（单位：千克）
    */
    private Long unitWeight;
    /**
    * 体积（单位：立方米）
    */
    private Long unitVolume;
    /**
    * 是否附带sku
    */
    private Integer withSku;
    /**
    * 价格（单位：分）
    */
    private Long price;
    /**
    * 折扣：100表示不打折，95是95折，以此类推
    */
    private Long priceDiscount;
    
    private Long inventoryQuantity;
    /**
    * 产品介绍
    */
    private String productDescription;
    /**
    * 创建时间（精确到毫秒）
    */
    private Long datelineCreate;
    /**
    * 更新时间（精确到毫秒）
    */
    private Long datelineUpdated;
    /**
    * 是否推荐
    */
    private Integer isRecommend;
    /**
    * 热卖
    */
    private Integer isHot;
    /**
    * 新品
    */
    private Integer isNew;
    /**
    * 上架
    */
    private Integer isSelling;
    /**
    * 排序，大的在前面
    */
    private Long sortId;
    /**
    * 放入回收站
    */
    private Integer isTrash;
    /**
    * 产品佣金百分比（放大100倍）
    */
    private Long commissionRate;
    /**
    * 销量
    */
    private Long salsCount;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public Long getBrandId() {
        return brandId;
    }

    public void setBrandId(Long brandId) {
        this.brandId = brandId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductSubtitle() {
        return productSubtitle;
    }

    public void setProductSubtitle(String productSubtitle) {
        this.productSubtitle = productSubtitle;
    }

    public Long getDealQuantityMin() {
        return dealQuantityMin;
    }

    public void setDealQuantityMin(Long dealQuantityMin) {
        this.dealQuantityMin = dealQuantityMin;
    }

    public Long getDealQuantityMax() {
        return dealQuantityMax;
    }

    public void setDealQuantityMax(Long dealQuantityMax) {
        this.dealQuantityMax = dealQuantityMax;
    }

    public Integer getFreeShipping() {
        return freeShipping;
    }

    public void setFreeShipping(Integer freeShipping) {
        this.freeShipping = freeShipping;
    }

    public Long getDeliveryConfigId() {
        return deliveryConfigId;
    }

    public void setDeliveryConfigId(Long deliveryConfigId) {
        this.deliveryConfigId = deliveryConfigId;
    }

    public String getItemNo() {
        return itemNo;
    }

    public void setItemNo(String itemNo) {
        this.itemNo = itemNo;
    }

    public Long getUnitWeight() {
        return unitWeight;
    }

    public void setUnitWeight(Long unitWeight) {
        this.unitWeight = unitWeight;
    }

    public Long getUnitVolume() {
        return unitVolume;
    }

    public void setUnitVolume(Long unitVolume) {
        this.unitVolume = unitVolume;
    }

    public Integer getWithSku() {
        return withSku;
    }

    public void setWithSku(Integer withSku) {
        this.withSku = withSku;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Long getPriceDiscount() {
        return priceDiscount;
    }

    public void setPriceDiscount(Long priceDiscount) {
        this.priceDiscount = priceDiscount;
    }

    public Long getInventoryQuantity() {
        return inventoryQuantity;
    }

    public void setInventoryQuantity(Long inventoryQuantity) {
        this.inventoryQuantity = inventoryQuantity;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public Long getDatelineCreate() {
        return datelineCreate;
    }

    public void setDatelineCreate(Long datelineCreate) {
        this.datelineCreate = datelineCreate;
    }

    public Long getDatelineUpdated() {
        return datelineUpdated;
    }

    public void setDatelineUpdated(Long datelineUpdated) {
        this.datelineUpdated = datelineUpdated;
    }

    public Integer getIsRecommend() {
        return isRecommend;
    }

    public void setIsRecommend(Integer isRecommend) {
        this.isRecommend = isRecommend;
    }

    public Integer getIsHot() {
        return isHot;
    }

    public void setIsHot(Integer isHot) {
        this.isHot = isHot;
    }

    public Integer getIsNew() {
        return isNew;
    }

    public void setIsNew(Integer isNew) {
        this.isNew = isNew;
    }

    public Integer getIsSelling() {
        return isSelling;
    }

    public void setIsSelling(Integer isSelling) {
        this.isSelling = isSelling;
    }

    public Long getSortId() {
        return sortId;
    }

    public void setSortId(Long sortId) {
        this.sortId = sortId;
    }

    public Integer getIsTrash() {
        return isTrash;
    }

    public void setIsTrash(Integer isTrash) {
        this.isTrash = isTrash;
    }

    public Long getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(Long commissionRate) {
        this.commissionRate = commissionRate;
    }

    public Long getSalsCount() {
        return salsCount;
    }

    public void setSalsCount(Long salsCount) {
        this.salsCount = salsCount;
    }

}