package service;

import model.Service;

import java.util.List;

public interface IServiceService {
    List<Service> findAll();

    void save(Service service);

    Service findById(int id);

    void update( Service service);

    void remove(int id);

    List<Service> findByName(String name);
}
