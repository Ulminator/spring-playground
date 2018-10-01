package com.ulminator.springPlayground.spring.repository;

import com.ulminator.springPlayground.spring.model.Customer;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

//@Repository("customerRepository")
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
