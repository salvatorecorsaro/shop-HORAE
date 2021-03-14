package com.scorsaro.shophorae.controller;

import com.scorsaro.shophorae.dto.Message;
import com.scorsaro.shophorae.dto.Purchase;
import com.scorsaro.shophorae.dto.PurchaseResponse;
import com.scorsaro.shophorae.service.ShopService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/checkout")
public class ShopController {
    private ShopService shopService;

    public ShopController(ShopService shopService){
        this.shopService = shopService;
    }

    @PostMapping("/purchase")
    public PurchaseResponse placeOrder(@RequestBody Purchase purchase){
        PurchaseResponse purchaseResponse = shopService.placeOrder(purchase);
        return purchaseResponse;
    }

    @PostMapping("/hello")
    public Message hello(@RequestBody String hello){
        var message = new Message();
        message.message = "hello!";
        return message;
    }
}
