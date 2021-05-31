package io.github.xopenapi.doudian;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import io.github.xopenapi.doudian.request.parameters.OrderIdParameter;
import io.github.xopenapi.doudian.request.parameters.OrderListParameters;
import io.github.xopenapi.doudian.domain.enums.OrderStatusDouDian;
import io.github.xopenapi.doudian.request.order.OrderDetailRequest;
import io.github.xopenapi.doudian.request.order.OrderListRequest;
import org.junit.Before;
import org.junit.Test;
import io.github.xopenapi.doudian.response.order.OrderDetailResponse;
import io.github.xopenapi.doudian.response.order.OrderListResponse;

public class OrderTests {

    private TiktokOpen client;

    private String accessToken;

    @Before
    public void before() {

        TiktokOpenConfig config = new TiktokOpenConfig();
        config.setAppsercet(AppInfo.appSecret);
        config.setAppKey(AppInfo.appKey);
        TiktokOpen open = new TiktokOpen(config);
        this.client = open;
        this.accessToken = AppInfo.accessToken;
    }

    @Test
    public void orderList() {

        OrderStatusDouDian orderStatusDouDian = OrderStatusDouDian.Done;
        OrderListParameters parameters = new OrderListParameters();
        parameters.setOrder_status(orderStatusDouDian);
//        parameters.setStart_time(LocalDateTime.now().minusDays(30));
        parameters.start_time = "2020/11/21 12:14:22";
        parameters.setSize(100);
        for(int i=0; i<10; i++){
            parameters.setPage(i);
            OrderListRequest request = new OrderListRequest(parameters);
            OrderListResponse response = client.getTiktokResponse(request, accessToken);

            System.out.println(JSON.toJSONString(response, SerializerFeature.PrettyFormat));
        }


    }

    @Test
    public void orderDetail() {
        OrderIdParameter parameter = new OrderIdParameter("4688001900746693110A");
        OrderDetailRequest request = new OrderDetailRequest(parameter);
        OrderDetailResponse res = client.getTiktokResponse(request, accessToken);
        System.out.println(JSON.toJSONString(res, SerializerFeature.PrettyFormat));
    }

}
