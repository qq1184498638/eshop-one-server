package com.springcloud.eshop.data.one.server.service.feign;

import com.springcloud.eshop.common.server.support.utils.ServerResponse;
import com.springcloud.eshop.data.one.server.service.feign.impl.ProductInventoryServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "product-inventories-server", fallback = ProductInventoryServiceImpl.class)
public interface ProductInventoryService {

    @GetMapping("/product-inventory/findProductInventoryByProductId")
    ServerResponse findProductInventoryByProductId(@RequestParam("productId") String productId);

}
