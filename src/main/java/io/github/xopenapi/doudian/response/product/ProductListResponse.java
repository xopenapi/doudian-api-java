package io.github.xopenapi.doudian.response.product;

import com.alibaba.fastjson.annotation.JSONField;
import io.github.xopenapi.doudian.response.PageData;
import io.github.xopenapi.doudian.response.TiktokOpenResponse;
import io.github.xopenapi.doudian.domain.Product;

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
