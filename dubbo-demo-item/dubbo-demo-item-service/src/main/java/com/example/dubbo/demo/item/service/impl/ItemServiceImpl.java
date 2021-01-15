package com.example.dubbo.demo.item.service.impl;

import com.example.dubbo.demo.common.model.FunctionResult;
import com.example.dubbo.demo.item.service.ItemService;
import org.apache.dubbo.config.annotation.Service;

@Service
public class ItemServiceImpl implements ItemService {
    @Override
    public FunctionResult queryItemById(String id) {
        FunctionResult result = new FunctionResult();
        result.setCode("200");
        result.setMsg(String.format("商品%s的信息", id));
        return result;
    }
}
