package com.scorsaro.shophorae.dao;


import com.scorsaro.shophorae.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
