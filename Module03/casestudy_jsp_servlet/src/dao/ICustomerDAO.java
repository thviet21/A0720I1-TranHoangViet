package dao;

import model.Customer;

import java.sql.SQLException;
import java.util.List;

public interface ICustomerDAO {
    void insertCustomer(Customer customer) throws SQLException;

    Customer getCustomer(int id) throws SQLException;

    List<Customer> getAllCustomer() throws SQLException;

    boolean deleteCustomer(int id) throws SQLException;

    boolean updateCustomer(Customer customer) throws SQLException;

    List<Customer> findByName(String name) throws SQLException;
}
