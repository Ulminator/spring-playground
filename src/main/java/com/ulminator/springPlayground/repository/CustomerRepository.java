package com.ulminator.springPlayground.repository;

import com.ulminator.springPlayground.model.Customer;

import java.util.List;

public interface CustomerRepository {

    List<Customer> findAll();

}
