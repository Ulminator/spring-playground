package com.ulminator.springPlayground.nonSpring.repository;

import com.ulminator.springPlayground.nonSpring.model.Customer;

import java.util.ArrayList;
import java.util.List;

public class HibernateCustomerRepositoryImpl implements CustomerRepository {

    @Override
    public List<Customer> findAll() {
        List<Customer> customers = new ArrayList<>();

        Customer customer = new Customer();
        customer.setFirstName("Matt");
        customer.setLastName("Ulmer");

        customers.add(customer);

        return customers;
    }
}
