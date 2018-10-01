package com.ulminator.springPlayground.spring.repository;

import com.ulminator.springPlayground.spring.model.Customer;

import java.util.List;

public interface CustomerRepository {

    List<Customer> findAll();

}
