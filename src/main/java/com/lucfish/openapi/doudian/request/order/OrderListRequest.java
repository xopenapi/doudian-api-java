package com.lucfish.openapi.doudian.request.order;

import com.lucfish.openapi.doudian.request.parameters.OrderListParameters;
import com.lucfish.openapi.doudian.response.order.OrderListResponse;
import com.lucfish.openapi.doudian.request.TiktokOpenRequest;

public class OrderListRequest extends TiktokOpenRequest<OrderListParameters, OrderListResponse> {

    public OrderListRequest(OrderListParameters parameter) {
        super(parameter);
    }

    @Override
    public Class<OrderListResponse> getResponseType() {
        return OrderListResponse.class;
    }

    @Override
    public String getContentPath() {
        return "/order/list";
    }
}
