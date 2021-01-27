package dao.impl;

import dao.ICustomerDAO;
import model.Customer;
import utils.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerDAOImpl implements ICustomerDAO {
    private static final String INSERT_CUSTOMER_SQL = "Insert into khachhang(idloaikhach, hoten, ngaysinh, socmnd, sdt, email, diachi,gioitinh) values (?, ?, ?, ?, ?, ?, ?, ?)";
    private static final String SELECT_CUSTOMER_BY_ID = "Select * from khachhang where idkhachhang = ?";
    private static final String SELECT_ALL_CUSTOMER = "Select * from khachhang order by idkhachhang";
    private static final String DELETE_USER_BY_ID = "Delete from khachhang where idkhachhang = ?";
    private static final String UPDATE_USER = "Update khachhang set idloaikhach = ?, hoten = ?, ngaysinh = ?,socmnd = ?,sdt = ?, email = ?,diachi = ?, gioitinh = ?   where idkhachhang = ?";
    private static final String SELECT_USER_BY_NAME = "Select * from khachhang where hoten = ?";

    @Override
    public void insertCustomer(Customer customer) throws SQLException {
        Connection connection = DBConnection.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(INSERT_CUSTOMER_SQL);
        preparedStatement.setInt(1, Integer.parseInt(customer.getTypeCus()));
        preparedStatement.setString(2, customer.getNameCus());
        preparedStatement.setString(3, customer.getBirthDay());
        preparedStatement.setString(4, customer.getPassPort());
        preparedStatement.setString(5, customer.getTelephoneNumber());
        preparedStatement.setString(6, customer.getEmailCus());
        preparedStatement.setString(7, customer.getAddressCus());
        preparedStatement.setString(8, customer.getGender());

        preparedStatement.executeUpdate();
    }

    @Override
    public Customer getCustomer(int id) throws SQLException {
        Customer customer = null;
        Connection connection = DBConnection.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(SELECT_CUSTOMER_BY_ID);
        preparedStatement.setInt(1, id);

        ResultSet resultSet = preparedStatement.executeQuery();

        if (resultSet.next()) {
            String idkhachhang = String.valueOf(resultSet.getInt("idkhachhang"));
            String idloaikhach = String.valueOf(resultSet.getInt("idloaikhach"));
            String hoten = resultSet.getString("hoten");
            String ngaysinh = resultSet.getString("ngaysinh");
            String socmnd = resultSet.getString("socmnd");
            String sdt = resultSet.getString("sdt");
            String email = resultSet.getString("email");
            String diachi = resultSet.getString("diachi");
            String gioitinh = resultSet.getString("gioitinh");
            customer = new Customer();
            customer.setIdCus(idkhachhang);
            customer.setTypeCus(idloaikhach);
            customer.setNameCus(hoten);
            customer.setPassPort(socmnd);
            customer.setTelephoneNumber(sdt);
            customer.setEmailCus(email);
            customer.setAddressCus(diachi);
            customer.setGender(gioitinh);
            customer.setBirthDay(ngaysinh);


        }
        return customer;
    }

    @Override
    public List<Customer> getAllCustomer() throws SQLException {
        List<Customer> customerList = new ArrayList<>();
        Customer customer = null;
        Connection connection = DBConnection.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_CUSTOMER);

        ResultSet resultSet = preparedStatement.executeQuery();

        while (resultSet.next()) {
            String idkhachhang = String.valueOf(resultSet.getInt("idkhachhang"));
            String idloaikhach = String.valueOf(resultSet.getInt("idloaikhach"));
            String hoten = resultSet.getString("hoten");
            String ngaysinh = resultSet.getString("ngaysinh");
            String socmnd = resultSet.getString("socmnd");
            String gioitinh = resultSet.getString("gioitinh");
            String sdt = resultSet.getString("sdt");
            String email = resultSet.getString("email");
            String diachi = resultSet.getString("diachi");
            customer = new Customer();
            customer.setIdCus(idkhachhang);
            customer.setTypeCus(idloaikhach);
            customer.setNameCus(hoten);
            customer.setPassPort(socmnd);
            customer.setTelephoneNumber(sdt);
            customer.setEmailCus(email);
            customer.setAddressCus(diachi);
            customer.setGender(gioitinh);
            customer.setBirthDay(ngaysinh);

            customerList.add(customer);
        }

        return customerList;
    }

    @Override
    public boolean deleteCustomer(int id) throws SQLException {
        Connection connection = DBConnection.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(DELETE_USER_BY_ID);
        preparedStatement.setInt(1, id);
        return preparedStatement.executeUpdate() > 0;
    }

    @Override
    public boolean updateCustomer(Customer customer) throws SQLException {
        Connection connection = DBConnection.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_USER);
        preparedStatement.setInt(1, Integer.parseInt(customer.getTypeCus()));
        preparedStatement.setString(2, customer.getNameCus());
        preparedStatement.setString(3, customer.getBirthDay());
        preparedStatement.setString(4, customer.getPassPort());
        preparedStatement.setString(5, customer.getTelephoneNumber());
        preparedStatement.setString(6, customer.getEmailCus());
        preparedStatement.setString(7, customer.getAddressCus());
        preparedStatement.setString(8, customer.getGender());
        preparedStatement.setInt(9, Integer.parseInt(customer.getIdCus()));

        return preparedStatement.executeUpdate() > 0;
    }

    @Override
    public List<Customer> findByName(String name) throws SQLException {
        List<Customer> customerList = new ArrayList<>();
        Customer customer = null;
        Connection connection = DBConnection.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(SELECT_USER_BY_NAME);
        preparedStatement.setString(1, "%" + name + "%");
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            String idkhachhang = String.valueOf(resultSet.getInt("idkhachhang"));
            String idloaikhach = String.valueOf(resultSet.getInt("idloaikhach"));
            String hoten = resultSet.getString("hoten");
            String ngaysinh = resultSet.getString("ngaysinh");
            String socmnd = resultSet.getString("socmnd");
            String gioitinh = resultSet.getString("gioitinh");
            String sdt = resultSet.getString("sdt");
            String email = resultSet.getString("email");
            String diachi = resultSet.getString("diachi");
            customer = new Customer();
            customer.setIdCus(idkhachhang);
            customer.setTypeCus(idloaikhach);
            customer.setNameCus(hoten);
            customer.setPassPort(socmnd);
            customer.setTelephoneNumber(sdt);
            customer.setEmailCus(email);
            customer.setAddressCus(diachi);
            customer.setGender(gioitinh);
            customer.setBirthDay(ngaysinh);

            customerList.add(customer);
        }

        return customerList;
    }

}
