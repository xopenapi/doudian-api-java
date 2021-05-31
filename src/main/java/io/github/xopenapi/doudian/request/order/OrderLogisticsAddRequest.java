package io.github.xopenapi.doudian.request.order;

import io.github.xopenapi.doudian.request.parameters.OrderLogisticsAddParameters;
import io.github.xopenapi.doudian.response.order.OrderLogisticsAddResponse;
import io.github.xopenapi.doudian.request.TiktokOpenRequest;

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
