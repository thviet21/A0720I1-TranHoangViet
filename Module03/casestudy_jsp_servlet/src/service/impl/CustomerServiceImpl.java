package service.impl;

import dao.ICustomerDAO;
import dao.impl.CustomerDAOImpl;
import model.Customer;
import service.ICustomerService;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerServiceImpl implements ICustomerService {
    private static final String INSERT_CUSTOMER_SQL = "Insert into khachhang(idloaikhach, hoten, ngaysinh, socmnd, sdt, email, diachi,gioitinh) values (?, ?, ?, ?, ?, ?, ?, ?)";
    private static final String SELECT_CUSTOMER_BY_ID = "Select * from khachhang where idkhachhang = ?";
    private static final String SELECT_ALL_CUSTOMER = "Select * from khachhang order by idkhachhang";
    private static final String DELETE_USER_BY_ID = "Delete from khachhang where idkhachhang = ?";
    private static final String UPDATE_USER = "Update khachhang set idloaikhach = ?, hoten = ?, ngaysinh = ?,socmnd = ?,sdt = ?, email = ?,diachi = ?, gioitinh = ?   where idkhachhang = ?";
    private static final String SELECT_USER_BY_NAME = "Select * from khachhang where hoten = ?";

    ICustomerDAO customerDAO = new CustomerDAOImpl();
    @Override
    public List<Customer> findAll() {
        List<Customer> customerList = new ArrayList<>();
        try {
            customerList = customerDAO.getAllCustomer();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return customerList;
    }

    @Override
    public void save(Customer customer) {
        try {
            customerDAO.insertCustomer(customer);
        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    @Override
    public Customer findById(int id) {
        Customer customer = null;
        try {
            customer = customerDAO.getCustomer(id);
        }catch (SQLException e){
            e.printStackTrace();
        }
        return customer;
    }

    @Override
    public void update(Customer customer) {
        try {
            customerDAO.updateCustomer(customer);
        }catch (SQLException e){
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
    public List<Customer> findByName(String name) {
        try {
            return customerDAO.findByName(name);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
