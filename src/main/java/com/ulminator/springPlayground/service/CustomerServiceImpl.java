package com.ulminator.springPlayground.service;

import com.ulminator.springPlayground.model.Customer;
import com.ulminator.springPlayground.repository.CustomerRepository;
import com.ulminator.springPlayground.repository.HibernateCustomerRepositoryImpl;

import java.util.List;

public class CustomerServiceImpl implements CustomerService {

    // Hard coded reference to customer repository
    private CustomerRepository customerRepository = new HibernateCustomerRepositoryImpl();

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }
}
