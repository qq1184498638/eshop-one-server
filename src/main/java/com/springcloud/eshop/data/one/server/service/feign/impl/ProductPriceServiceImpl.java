package com.springcloud.eshop.data.one.server.service.feign.impl;

import com.springcloud.eshop.common.server.support.utils.ServerResponse;
import com.springcloud.eshop.data.one.server.service.feign.ProductPriceService;
import org.springframework.stereotype.Component;

@Component
public class ProductPriceServiceImpl implements ProductPriceService {
    @Override
    public ServerResponse findProductPriceByProductId(String productId) {
        return ServerResponse.createByErrorMessage("服务降级方法");
    }
}
