package com.lucfish.openapi.doudian.request.parameters;

import com.lucfish.openapi.doudian.utils.AssertUtils;

public class OrderIdParameter {

    private String order_id;

    public OrderIdParameter(String order_id) {
        AssertUtils.isTrue(order_id != null
        && order_id.endsWith("A"), "请传入父订单ID");
        this.order_id = order_id;
    }

    public String getOrder_id() {
        return order_id;
    }
}
