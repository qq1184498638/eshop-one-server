package com.springcloud.eshop.data.one.server.service.feign.impl;

import com.springcloud.eshop.common.server.support.utils.ServerResponse;
import com.springcloud.eshop.data.one.server.service.feign.ProductInventoryService;
import org.springframework.stereotype.Component;

@Component
public class ProductInventoryServiceImpl implements ProductInventoryService {
    @Override
    public ServerResponse findProductInventoryByProductId(String productId) {
        return ServerResponse.createByErrorMessage("服务降级方法");
    }
}
