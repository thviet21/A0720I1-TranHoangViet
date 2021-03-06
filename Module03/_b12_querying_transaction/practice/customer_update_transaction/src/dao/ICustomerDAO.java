package dao;

import model.Customer;

import java.sql.SQLException;
import java.util.List;

public interface ICustomerDAO {
    public void insertCustomer(Customer customer) throws SQLException;

    public Customer getCustomer(int id) throws SQLException;

    public List<Customer> getAllCustomer() throws SQLException;

    public boolean deleteCustomer(int id) throws SQLException;

    public boolean updateCustomer(Customer customer) throws SQLException;

    public List<Customer> findByCountry(String country) throws SQLException;

    public List<Customer> getAllCustomerSorted() throws SQLException;

    public Customer getUserById(int id) ;

    public void insertUserStore(Customer customer) throws SQLException;

    public  void addUserTransaction(Customer customer, int[] permision);

    public void insertUpdateWithoutTransaction();
    public void insertUpdateUseTransaction();
}
