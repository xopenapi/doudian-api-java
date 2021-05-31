package io.github.xopenapi.doudian.request.order;

import io.github.xopenapi.doudian.request.parameters.OrderIdParameter;
import io.github.xopenapi.doudian.response.order.OrderDetailResponse;
import io.github.xopenapi.doudian.request.TiktokOpenRequest;

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
