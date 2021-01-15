package com.example.dubbo.demo.order.aggregate.service.impl;

import com.alibaba.fastjson.JSON;
import com.example.dubbo.demo.common.model.FunctionResult;
import com.example.dubbo.demo.order.aggregate.service.DubboDemoOrderAggregateServiceApplication;
import com.example.dubbo.demo.order.aggregate.service.OrderAggregateService;
import org.apache.dubbo.config.annotation.Reference;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = DubboDemoOrderAggregateServiceApplication.class)
public class TestOrderAggregateServiceImpl {
    @Reference
    private OrderAggregateService orderAggregateService;

    @Test
    public void testQueryItem() {
        FunctionResult result = orderAggregateService.queryItem("123456");
        System.out.println(JSON.toJSONString(result));
    }
}
