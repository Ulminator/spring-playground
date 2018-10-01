package com.ulminator.springPlayground.spring.service;

import com.ulminator.springPlayground.spring.model.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> findAll();
}
