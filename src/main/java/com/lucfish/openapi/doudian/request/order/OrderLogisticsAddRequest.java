package com.lucfish.openapi.doudian.request.order;

import com.lucfish.openapi.doudian.request.parameters.OrderLogisticsAddParameters;
import com.lucfish.openapi.doudian.response.order.OrderLogisticsAddResponse;
import com.lucfish.openapi.doudian.request.TiktokOpenRequest;

public class OrderLogisticsAddRequest extends TiktokOpenRequest<OrderLogisticsAddParameters, OrderLogisticsAddResponse> {

    public OrderLogisticsAddRequest(OrderLogisticsAddParameters parameter) {
        super(parameter);
    }

    @Override
    public Class<OrderLogisticsAddResponse> getResponseType() {
        return OrderLogisticsAddResponse.class;
    }

    @Override
    public String getContentPath() {
        return "/order/logisticsAdd";
    }
}
