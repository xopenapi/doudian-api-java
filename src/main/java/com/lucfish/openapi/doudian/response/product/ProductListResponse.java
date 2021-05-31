package com.lucfish.openapi.doudian.response.product;

import com.alibaba.fastjson.annotation.JSONField;
import com.lucfish.openapi.doudian.response.PageData;
import com.lucfish.openapi.doudian.response.TiktokOpenResponse;
import com.lucfish.openapi.doudian.domain.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductListResponse extends TiktokOpenResponse<PageData<Product>> {

    @JSONField(serialize = false,deserialize = false)
    public List<Product> getContents() {
        if (getData() != null)
            return getData().getData();
        return new ArrayList<>();
    }

}
