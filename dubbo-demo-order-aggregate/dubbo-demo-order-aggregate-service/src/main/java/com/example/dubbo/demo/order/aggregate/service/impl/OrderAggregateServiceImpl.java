
package com.example.dubbo.demo.order.aggregate.service.impl;

import com.example.dubbo.demo.common.model.FunctionResult;
import com.example.dubbo.demo.item.service.ItemService;
import com.example.dubbo.demo.order.aggregate.service.OrderAggregateService;
import org.apache.dubbo.config.annotation.Reference;
import org.apache.dubbo.config.annotation.Service;

@Service
public class OrderAggregateServiceImpl implements OrderAggregateService {

    @Reference
    private ItemService itemService;

    @Override
    public FunctionResult queryItem(String id) {
        return itemService.queryItemById(id);
    }
}
