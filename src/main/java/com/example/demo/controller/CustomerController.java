package com.example.demo.controller;

import com.example.demo.dto.Customer;
import com.example.demo.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    private CustomerRepository customerRepository;

    @GetMapping("/all")
    public List<Customer> getAll(){
        return customerRepository.findAll();
    }

    @PostMapping("/add")
    public Customer add(@RequestBody Customer customer){
        return customerRepository.save(customer);
    }
}
