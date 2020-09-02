package com.javatar.firstproject.controller;

import com.javatar.firstproject.model.Customer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController // 1
@RequestMapping("/customers")
public class HomeController {

    @GetMapping // 2
    public List<Customer> customerList(){
        List<Customer> customers = new ArrayList<>();
        Customer customer1 =  new Customer();
        customer1.setId(1);
        customer1.setFirstName("ali");
        customer1.setLastName("sadeghi");

        Customer customer2 =  new Customer();
        customer2.setId(2);
        customer2.setFirstName("hasan");
        customer2.setLastName("sadeghi");

        customers.add(customer1);
        customers.add(customer2);
        return customers;
    }

}
