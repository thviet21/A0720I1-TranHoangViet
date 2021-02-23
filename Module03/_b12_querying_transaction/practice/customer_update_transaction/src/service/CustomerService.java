package service;

import model.Customer;

import java.sql.SQLException;
import java.util.List;

public interface CustomerService {
    List<Customer> findAll();

    void save(Customer customer);

    Customer findById(int id);

    void update(int id, Customer customer);

    void remove(int id);

    List<Customer> findByCountry(String country);

    public Customer getUserById(int id) throws SQLException;

    public void insertUserStore(Customer customer) throws SQLException;


}
