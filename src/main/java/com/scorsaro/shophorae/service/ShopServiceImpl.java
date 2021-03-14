package com.scorsaro.shophorae.service;


import com.scorsaro.shophorae.dao.CustomerRepository;
import com.scorsaro.shophorae.dto.Purchase;
import com.scorsaro.shophorae.dto.PurchaseResponse;
import com.scorsaro.shophorae.entity.Customer;
import com.scorsaro.shophorae.entity.Order;
import com.scorsaro.shophorae.entity.OrderItem;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Set;
import java.util.UUID;

@Service
public class ShopServiceImpl implements ShopService {

    private CustomerRepository customerRepository;

    public ShopServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    @Transactional
    public PurchaseResponse placeOrder(Purchase purchase) {

        Order order = purchase.getOrder();

        String orderTrackingNumber = generateOrderTrackingNumber();
        order.setOrderTrackingNumber(orderTrackingNumber);

        Set<OrderItem> orderItems = purchase.getOrderItems();
        for (OrderItem orderItem : orderItems) {
            order.add(orderItem);
        }

        order.setShippingAddress(purchase.getShippingAddress());
        order.setBillingAddress(purchase.getBillingAddress());

        Customer customer = purchase.getCustomer();
        customer.add(order);
        customerRepository.save(customer);

        return new PurchaseResponse(orderTrackingNumber);
    }

    private String generateOrderTrackingNumber() {
        return UUID.randomUUID().toString();
    }
}
