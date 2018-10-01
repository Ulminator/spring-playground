package com.ulminator.springPlayground.nonSpring.repository;

import com.ulminator.springPlayground.nonSpring.model.Customer;

import java.util.List;

public interface CustomerRepository {

    List<Customer> findAll();

}
