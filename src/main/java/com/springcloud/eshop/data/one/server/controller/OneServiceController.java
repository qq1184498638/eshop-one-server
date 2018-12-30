package com.springcloud.eshop.data.one.server.controller;

import com.springcloud.eshop.common.server.support.utils.ServerResponse;
import com.springcloud.eshop.data.one.server.service.feign.ProductInventoryService;
import com.springcloud.eshop.data.one.server.service.feign.ProductPriceService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(description = "商品价格和库存相关的接口调用")
@RequestMapping("one")
public class OneServiceController {
    @Autowired
    private ProductPriceService productPriceService;

    @Autowired
    private ProductInventoryService productInventoryService;

    @ApiOperation("根据商品id查询出对应的商品价格信息")
    @GetMapping("/findProductPriceByProductId")
    private ServerResponse findPriceByPrdocutId(@RequestParam("productId") String productId) {
        return ServerResponse.createBySuccess(productPriceService.findProductPriceByProductId(productId));
    }

    @ApiOperation("根据商品id查询出对应的商品价格信息")
    @GetMapping("/findProductInventoryByProductId")
    private ServerResponse findInventoryByPrdocutId(@RequestParam("productId") String productId) {
        return ServerResponse.createBySuccess(productInventoryService.findProductInventoryByProductId(productId));
    }

}
