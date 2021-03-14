package com.scorsaro.shophorae.dto;

import com.scorsaro.shophorae.entity.Address;
import com.scorsaro.shophorae.entity.Customer;
import com.scorsaro.shophorae.entity.Order;
import com.scorsaro.shophorae.entity.OrderItem;
import lombok.Data;

import java.util.Set;

@Data
public class Purchase {

    private Customer customer;
    private Address shippingAddress;
    private Address billingAddress;
    private Order order;
    private Set<OrderItem> orderItems;
}
