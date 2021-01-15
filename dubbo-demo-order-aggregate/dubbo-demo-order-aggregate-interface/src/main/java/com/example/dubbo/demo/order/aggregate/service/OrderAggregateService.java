package com.example.dubbo.demo.order.aggregate.service;

import com.example.dubbo.demo.common.model.FunctionResult;

public interface OrderAggregateService {
    FunctionResult queryItem(String id);
}
