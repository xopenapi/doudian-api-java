package io.github.xopenapi.doudian.request.parameters;

import java.util.Objects;

public class ProductListParameters {

    private Integer page;

    private Integer size;
    /**
     * 可选 0上架 1下架
     */
    private String status;

    /**
     * 指定审核状态返回商品列表：1未提审 2审核中 3审核通过 4审核驳回 5封禁 7审核通过，待上架状态
     */
    private String check_status;

    public ProductListParameters(Integer page, Integer size, String status, String check_status) {
        this.page = page;
        this.size = size;
        this.status = status;
        this.check_status = check_status;
    }

    public ProductListParameters(Integer page, Integer size) {
        this.page = page;
        this.size = size;
    }

    public String getPage() {
        return page.toString();
    }

    public String getSize() {
        return size.toString();
    }

    public String getStatus() {
        return Objects.toString(status, null);
    }

    public String getCheck_status() {
        return check_status;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setCheck_status(String check_status) {
        this.check_status = check_status;
    }
}
