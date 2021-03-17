package com.codegym.customer_update.services;


import com.codegym.customer_update.models.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public interface CustomerService  {
    Page<Customer> findAll(Pageable pageable);

    Customer findById(int id);

    void save(Customer customer);

    void remove(int id);
}
