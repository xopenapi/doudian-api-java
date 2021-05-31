package com.lucfish.openapi.doudian.domain;

import java.util.List;
import java.util.Map;

public class Sku {

    // 即skuId
    private Long id;
    // app_key
    private Long open_user_id;
    // 外部的skuId
    private Long out_sku_id;
    // product_id
    private Long product_id;
    // 第一级子规格
    private Long spec_detail_id1;
    // 第二级子规格
    private Long spec_detail_id2;
    // 第三级子规格
    private Long spec_detail_id3;
    // 第一级子规格名
    private String spec_detail_name1;
    // 第二级子规格名
    private String spec_detail_name2;
    // 第三级子规格名
    private String spec_detail_name3;
    // sku_type=0时，表示库存数量;sku_type=1时，使用stock_map
    private Long stock_num;
    // sku_type=0时，表示预占库存数量; sku_type=1时，使用prehold_stock_map
    private Long prehold_stock_num;
    // 阶梯库存
    private Long step_stock_num;
    // 预占阶梯库存
    private Long prehold_step_stock_num;
    // 活动阶梯库存
    private Long prom_step_stock_num;
    // 价格
    private Long price;
    // 规格ID
    private Long spec_id;
    // 创建时间
    private Long create_time;
    // sku的商家外部编码
    private String code;
    // 0-普通 1-区域库存
    private Long sku_type;
    // 供应商ID
    private String supplier_id;
    // sku_type=0时，为空，库存见stock_num; sku_type=1时，表示库存map，key为out_warehouse_id，value是库存
    private Map<String, Long> stock_map;
    // 区域库存预占数据，sku_type=0时，为空，库存见stock_num; sku_type=1时，表示库存map，key为out_warehouse_id，value是库存
    private Map<String, Long> prehold_stock_map;

    private Long settlement_price;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getOpen_user_id() {
        return open_user_id;
    }

    public void setOpen_user_id(Long open_user_id) {
        this.open_user_id = open_user_id;
    }

    public Long getOut_sku_id() {
        return out_sku_id;
    }

    public void setOut_sku_id(Long out_sku_id) {
        this.out_sku_id = out_sku_id;
    }

    public Long getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Long product_id) {
        this.product_id = product_id;
    }

    public Long getSpec_detail_id1() {
        return spec_detail_id1;
    }

    public void setSpec_detail_id1(Long spec_detail_id1) {
        this.spec_detail_id1 = spec_detail_id1;
    }

    public Long getSpec_detail_id2() {
        return spec_detail_id2;
    }

    public void setSpec_detail_id2(Long spec_detail_id2) {
        this.spec_detail_id2 = spec_detail_id2;
    }

    public Long getSpec_detail_id3() {
        return spec_detail_id3;
    }

    public void setSpec_detail_id3(Long spec_detail_id3) {
        this.spec_detail_id3 = spec_detail_id3;
    }

    public String getSpec_detail_name1() {
        return spec_detail_name1;
    }

    public void setSpec_detail_name1(String spec_detail_name1) {
        this.spec_detail_name1 = spec_detail_name1;
    }

    public String getSpec_detail_name2() {
        return spec_detail_name2;
    }

    public void setSpec_detail_name2(String spec_detail_name2) {
        this.spec_detail_name2 = spec_detail_name2;
    }

    public String getSpec_detail_name3() {
        return spec_detail_name3;
    }

    public void setSpec_detail_name3(String spec_detail_name3) {
        this.spec_detail_name3 = spec_detail_name3;
    }

    public Long getStock_num() {
        return stock_num;
    }

    public void setStock_num(Long stock_num) {
        this.stock_num = stock_num;
    }

    public Long getPrehold_stock_num() {
        return prehold_stock_num;
    }

    public void setPrehold_stock_num(Long prehold_stock_num) {
        this.prehold_stock_num = prehold_stock_num;
    }

    public Long getStep_stock_num() {
        return step_stock_num;
    }

    public void setStep_stock_num(Long step_stock_num) {
        this.step_stock_num = step_stock_num;
    }

    public Long getPrehold_step_stock_num() {
        return prehold_step_stock_num;
    }

    public void setPrehold_step_stock_num(Long prehold_step_stock_num) {
        this.prehold_step_stock_num = prehold_step_stock_num;
    }

    public Long getProm_step_stock_num() {
        return prom_step_stock_num;
    }

    public void setProm_step_stock_num(Long prom_step_stock_num) {
        this.prom_step_stock_num = prom_step_stock_num;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Long getSpec_id() {
        return spec_id;
    }

    public void setSpec_id(Long spec_id) {
        this.spec_id = spec_id;
    }

    public Long getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Long create_time) {
        this.create_time = create_time;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Long getSku_type() {
        return sku_type;
    }

    public void setSku_type(Long sku_type) {
        this.sku_type = sku_type;
    }

    public String getSupplier_id() {
        return supplier_id;
    }

    public void setSupplier_id(String supplier_id) {
        this.supplier_id = supplier_id;
    }

    public Map<String, Long> getStock_map() {
        return stock_map;
    }

    public void setStock_map(Map<String, Long> stock_map) {
        this.stock_map = stock_map;
    }

    public Map<String, Long> getPrehold_stock_map() {
        return prehold_stock_map;
    }

    public void setPrehold_stock_map(Map<String, Long> prehold_stock_map) {
        this.prehold_stock_map = prehold_stock_map;
    }

    public Long getSettlement_price() {
        return settlement_price;
    }

    public void setSettlement_price(Long settlement_price) {
        this.settlement_price = settlement_price;
    }
}
