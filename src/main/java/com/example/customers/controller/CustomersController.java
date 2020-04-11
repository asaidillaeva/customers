package com.example.customers.controller;


import com.example.customers.model.Customers;
import com.example.customers.repository.CustomersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

@Controller
@EnableWebMvc
public class CustomersController implements WebMvcConfigurer {

    private CustomersRepository customersRepository;
    Model model;

    @Autowired
    public CustomersController(CustomersRepository customersRepository) {
        this.customersRepository = customersRepository;
    }


    @RequestMapping(value = "/customers", method = RequestMethod.GET)
    public String customers(Model model) {
        this.model = model;
        List<Customers> customersList = customersRepository.findAll();
        if (customersList != null) {
            model.addAttribute("customers", customersList);
        }
        return "customers";
    }


    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String showAddPage() {
        return "add";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String submitCustomers(Customers customer) {
        customersRepository.save(customer);
        return "redirect:/customers";
    }
}
