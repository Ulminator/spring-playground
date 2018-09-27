package com.ulminator.springPlayground.service;

import com.ulminator.springPlayground.model.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> findAll();
}
