package com.ulminator.springPlayground.nonSpring.service;

import com.ulminator.springPlayground.nonSpring.model.Customer;
import com.ulminator.springPlayground.nonSpring.repository.CustomerRepository;
import com.ulminator.springPlayground.nonSpring.repository.HibernateCustomerRepositoryImpl;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {

    // Hard coded reference to customer repository
    private CustomerRepository customerRepository = new HibernateCustomerRepositoryImpl();

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }
}
