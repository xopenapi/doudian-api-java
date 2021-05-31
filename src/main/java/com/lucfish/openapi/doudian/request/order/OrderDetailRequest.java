package com.lucfish.openapi.doudian.request.order;

import com.lucfish.openapi.doudian.request.parameters.OrderIdParameter;
import com.lucfish.openapi.doudian.response.order.OrderDetailResponse;
import com.lucfish.openapi.doudian.request.TiktokOpenRequest;

public class OrderDetailRequest extends TiktokOpenRequest<OrderIdParameter, OrderDetailResponse> {

    public OrderDetailRequest(OrderIdParameter parameter) {
        super(parameter);
    }

    @Override
    public Class<OrderDetailResponse> getResponseType() {
        return OrderDetailResponse.class;
    }

    @Override
    public String getContentPath() {
        return "/order/detail";
    }
}
