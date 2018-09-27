package com.ulminator.springPlayground;

import com.ulminator.springPlayground.service.CustomerService;
import com.ulminator.springPlayground.service.CustomerServiceImpl;

public class Application {

    public static void main(String[] args) {

        CustomerService service = new CustomerServiceImpl();

        System.out.println(service.findAll().get(0));

    }
}
