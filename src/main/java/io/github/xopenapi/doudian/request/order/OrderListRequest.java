package io.github.xopenapi.doudian.request.order;

import io.github.xopenapi.doudian.request.parameters.OrderListParameters;
import io.github.xopenapi.doudian.response.order.OrderListResponse;
import io.github.xopenapi.doudian.request.TiktokOpenRequest;

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
