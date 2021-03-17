package com.codegym.practice_customer.services;

import com.codegym.practice_customer.models.Customer;

import java.util.List;

public interface CustomerService  {
    List<Customer> findAll();

    Customer findById(int id);

    void save(Customer customer);

    void remove(int id);
}
