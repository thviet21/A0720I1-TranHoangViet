package service;

import model.KieuThue;
import model.Service;

import java.sql.SQLException;
import java.util.List;

public interface IServiceService {
    List<Service> findAll();

    void save(Service service);

    Service findById(int id);

    void update( Service service);

    void remove(int id);

    List<Service> findByName(String name);

    List<KieuThue> getAllKieuThue();
}
