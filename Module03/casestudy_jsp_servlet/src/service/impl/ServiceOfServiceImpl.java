package service.impl;

import dao.IServiceDAO;
import dao.impl.ServiceDAOImpl;
import model.KieuThue;
import model.Service;
import service.IServiceService;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ServiceOfServiceImpl implements IServiceService {
    private IServiceDAO serviceDAO = new ServiceDAOImpl();

    @Override
    public List<Service> findAll() {
        List<Service> serviceList = new ArrayList<>();
        try {
            serviceList = this.serviceDAO.getAllService();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return serviceList;
    }

    @Override
    public void save(Service service) {
        try {
            this.serviceDAO.insertService(service);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public Service findById(int id) {
        Service service = null;
        try {
            service = this.serviceDAO.getService(id);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return service;
    }

    @Override
    public void update(Service service) {
        try {
            this.serviceDAO.updateService(service);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void remove(int id) {
        try {
            this.serviceDAO.deleteService(id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Service> findByName(String name) {
        List<Service> serviceList = new ArrayList<>();
        try {
            serviceList = this.serviceDAO.findByName(name);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return serviceList;
    }

    @Override
    public List<KieuThue> getAllKieuThue(){
        List<KieuThue> kieuThues = new ArrayList<>();
        try {
            kieuThues = this.serviceDAO.getAllKieuThue();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return kieuThues;
    }
}
