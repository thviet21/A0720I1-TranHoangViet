package dao;

import model.Customer;
import model.Service;

import java.sql.SQLException;
import java.util.List;

public interface IServiceDAO {
    void insertService(Service service) throws SQLException;

    Service getService(int id) throws SQLException;

    List<Service> getAllService() throws SQLException;

    boolean deleteService(int id) throws SQLException;

    boolean updateService(Service service) throws SQLException;

    List<Service> findByName(String name) throws SQLException;
}
