package dao.impl;

import dao.IServiceDAO;
import model.Customer;
import model.KieuThue;
import model.Service;
import utils.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ServiceDAOImpl implements IServiceDAO {
    private static final String INSERT_SERVICE_SQL = "INSERT INTO dichvu (tendichvu, dientich, sotang, songuoitoida, chiphithue, idkieuthue, idloaidichvu, trangthai) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
    private static final String SELECT_SERVICE_BY_ID = "Select * from dichvu where iddichvu = ?";
    private static final String SELECT_ALL_SERVICE = "Select * from dichvu order by iddichvu";
    private static final String SELECT_ALL_KIEU_THUE = "Select * from kieuthue";
    private static final String DELETE_SERVICE_BY_ID = "Delete from dichvu where iddichvu = ?";
    private static final String UPDATE_SERVICE = "Update dichvu set tendichvu = ?, dientich = ?, sotang = ?, songuoitoida = ?, chiphithue = ?,idkieuthue = ?, idloaidichvu = ?,trangthai = ?   where iddichvu = ?";
    private static final String SELECT_SERVICE_BY_NAME = "Select * from dichvu where tendichvu = ?";


    @Override
    public void insertService(Service service) throws SQLException {
        Connection connection = DBConnection.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(INSERT_SERVICE_SQL);
        preparedStatement.setString(1, service.getNameService());
        preparedStatement.setDouble(2, service.getAreaUse());
        preparedStatement.setInt(3, service.getFloorTotal());
        preparedStatement.setInt(4, service.getMaximumGuest());
        preparedStatement.setDouble(5, service.getPriceRent());
        preparedStatement.setInt(6, service.getTypeRent());
        preparedStatement.setInt(7, service.getTypeService());
        preparedStatement.setString(8, service.getStatusService());

        preparedStatement.executeUpdate();
    }

    @Override
    public Service getService(int id) throws SQLException {
        Service service = null;
        Connection connection = DBConnection.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(SELECT_SERVICE_BY_ID);
        preparedStatement.setInt(1, id);
        ResultSet resultSet = preparedStatement.executeQuery();

        if (resultSet.next()) {
            int idService = resultSet.getInt("iddichvu");
            String nameService = resultSet.getString("tendichvu");
            double areaUse = resultSet.getDouble("dientich");
            int floorTotal = resultSet.getInt("sotang");
            int maxGuest = resultSet.getInt("songuoitoida");
            double priceRent = resultSet.getDouble("chiphithue");
            int typeRent = resultSet.getInt("idkieuthue");
            int typeService = resultSet.getInt("idloaidichvu");
            String statusService = resultSet.getString("trangthai");
            service = new Service(idService, nameService, areaUse, floorTotal, maxGuest, priceRent, typeRent, typeService, statusService);
        }
        return service;
    }

    @Override
    public List<Service> getAllService() throws SQLException {
        List<Service> serviceList = new ArrayList<>();
        Connection connection = DBConnection.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_SERVICE);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            int idService = resultSet.getInt("iddichvu");
            String nameService = resultSet.getString("tendichvu");
            double areaUse = resultSet.getDouble("dientich");
            int floorTotal = resultSet.getInt("sotang");
            int maxGuest = resultSet.getInt("songuoitoida");
            double priceRent = resultSet.getDouble("chiphithue");
            int typeRent = resultSet.getInt("idkieuthue");
            int typeService = resultSet.getInt("idloaidichvu");
            String statusService = resultSet.getString("trangthai");
            serviceList.add(new Service(idService, nameService, areaUse, floorTotal, maxGuest, priceRent, typeRent, typeService, statusService));
        }
        return serviceList;

    }

    @Override
    public boolean deleteService(int id) throws SQLException {
        Connection connection = DBConnection.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(DELETE_SERVICE_BY_ID);
        preparedStatement.setInt(1, id);
        return preparedStatement.executeUpdate() > 0;
    }

    @Override
    public boolean updateService(Service service) throws SQLException {
        Connection connection = DBConnection.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_SERVICE);
        preparedStatement.setString(1, service.getNameService());
        preparedStatement.setDouble(2, service.getAreaUse());
        preparedStatement.setInt(3, service.getFloorTotal());
        preparedStatement.setInt(4, service.getMaximumGuest());
        preparedStatement.setDouble(5, service.getPriceRent());
        preparedStatement.setInt(6, service.getTypeRent());
        preparedStatement.setInt(7, service.getTypeService());
        preparedStatement.setString(8, service.getStatusService());
        preparedStatement.setInt(9, service.getIdService());
        return preparedStatement.executeUpdate() > 0;
    }

    @Override
    public List<Service> findByName(String name) throws SQLException {
        List<Service> serviceList = new ArrayList<>();
        Connection connection = DBConnection.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(SELECT_SERVICE_BY_NAME);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            int idService = resultSet.getInt("iddichvu");
            String nameService = resultSet.getString("tendichvu");
            double areaUse = resultSet.getDouble("dientich");
            int floorTotal = resultSet.getInt("sotang");
            int maxGuest = resultSet.getInt("songuoitoida");
            double priceRent = resultSet.getDouble("chiphithue");
            int typeRent = resultSet.getInt("idkieuthue");
            int typeService = resultSet.getInt("idloaidichvu");
            String statusService = resultSet.getString("trangthai");
            serviceList.add(new Service(idService,nameService,areaUse,floorTotal,maxGuest,priceRent,typeRent,typeService,statusService));
        }
        return serviceList;
    }

    @Override
    public List<KieuThue> getAllKieuThue() throws SQLException {
        List<KieuThue> kieuThues = new ArrayList<>();
        Connection connection = DBConnection.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_KIEU_THUE);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            int id = resultSet.getInt("idkieuthue");
            String name = resultSet.getString("tenkieuthue");
            kieuThues.add(new KieuThue(id, name));
        }
        return kieuThues;
    }
}
