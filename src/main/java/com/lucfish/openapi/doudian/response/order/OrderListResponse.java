package com.lucfish.openapi.doudian.response.order;

import com.alibaba.fastjson.annotation.JSONField;
import com.lucfish.openapi.doudian.response.PageList;
import com.lucfish.openapi.doudian.response.TiktokOpenResponse;
import com.lucfish.openapi.doudian.domain.Order;

import java.util.ArrayList;
import java.util.List;

public class OrderListResponse extends TiktokOpenResponse<PageList<Order>> {

    @JSONField(serialize = false,deserialize = false)
    public List<Order> getContents() {
        if (getData() != null)
            return getData().getList();
        return new ArrayList<>();
    }

}
