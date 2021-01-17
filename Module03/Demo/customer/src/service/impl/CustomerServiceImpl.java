package service.impl;

import dao.ICustomerDAO;
import dao.impl.CustomerDAOImpl;
import model.Customer;
import service.CustomerService;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CustomerServiceImpl implements CustomerService {

//    public static Map<Integer,Customer> customerMap;
    private ICustomerDAO customerDAO = new CustomerDAOImpl();

//    static {
//        customerMap =new HashMap<>();
//        customerMap.put(1,new Customer(1,"Dat","datmaster@codegym","Dalat"));
//        customerMap.put(2,new Customer(2,"Nam","Nam2000@codegym","Dalat"));
//        customerMap.put(3,new Customer(3,"Sang","ChayDoAn@codegym","Dalat"));
//    }
    @Override
    public List<Customer> findAll() {
        List<Customer> customerList = new ArrayList<>();
        try {
            customerList = customerDAO.getAllCustomerSorted();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return customerList;
    }

    @Override
    public void save(Customer customer) {
        try {
            customerDAO.insertCustomer(customer);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Customer findById(int id) {
        try {
            return customerDAO.getCustomer(id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void update(int id, Customer customer) {
        try {
            customerDAO.updateCustomer(customer);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void remove(int id) {
        try {
            customerDAO.deleteCustomer(id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Customer> findByCountry(String country) {
        try {
            return customerDAO.findByCountry(country);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
