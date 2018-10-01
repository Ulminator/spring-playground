package com.ulminator.springPlayground.nonSpring;

import com.ulminator.springPlayground.nonSpring.service.CustomerService;
import com.ulminator.springPlayground.nonSpring.service.CustomerServiceImpl;

public class Application {

    public static void main(String[] args) {

        CustomerService service = new CustomerServiceImpl();

        System.out.println(service.findAll().get(0).getFirstName());

    }
}
