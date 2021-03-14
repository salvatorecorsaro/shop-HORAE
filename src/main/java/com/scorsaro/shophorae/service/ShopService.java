package com.scorsaro.shophorae.service;


import com.scorsaro.shophorae.dto.Purchase;
import com.scorsaro.shophorae.dto.PurchaseResponse;

public interface ShopService {
    PurchaseResponse placeOrder(Purchase purchase);
}
