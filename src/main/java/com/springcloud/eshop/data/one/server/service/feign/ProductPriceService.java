package com.springcloud.eshop.data.one.server.service.feign;

import com.springcloud.eshop.common.server.support.utils.ServerResponse;
import com.springcloud.eshop.data.one.server.service.feign.impl.ProductPriceServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "product-price-server", fallback = ProductPriceServiceImpl.class)
public interface ProductPriceService {

    @GetMapping("/product-price/findProductPriceByProductId")
    ServerResponse findProductPriceByProductId(@RequestParam("productId") String productId);
}
