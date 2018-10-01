package com.ulminator.springPlayground.spring;

import com.ulminator.springPlayground.spring.repository.CustomerRepository;
import com.ulminator.springPlayground.spring.repository.HibernateCustomerRepositoryImpl;
import com.ulminator.springPlayground.spring.service.CustomerService;
import com.ulminator.springPlayground.spring.service.CustomerServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration // used to define files that contain configuration code
@ComponentScan({ "com.ulminator.springPlayground.spring" })  // allows the use Autowired
public class AppConfig {

    @Bean(name = "customerService")
    public CustomerService getCustomerService() {
//        Setter injection
        CustomerServiceImpl customerService = new CustomerServiceImpl();
        customerService.setCustomerRepository(getCustomerRepository());

        // Constructor injection
//        CustomerServiceImpl customerService = new CustomerServiceImpl(getCustomerRepository());

        return customerService;
    }

    @Bean(name = "customerRepository")
    public CustomerRepository getCustomerRepository() {
        return new HibernateCustomerRepositoryImpl();
    }
}
