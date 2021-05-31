package io.github.xopenapi.doudian.response.order;

import com.alibaba.fastjson.annotation.JSONField;
import io.github.xopenapi.doudian.response.PageList;
import io.github.xopenapi.doudian.response.TiktokOpenResponse;
import io.github.xopenapi.doudian.domain.Order;

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
