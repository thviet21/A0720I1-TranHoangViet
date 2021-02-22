package controller;

import model.Customer;
import model.KieuThue;
import model.Service;
import service.IServiceService;
import service.impl.ServiceOfServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "ServiceServlet", urlPatterns = "/services")
public class ServiceServlet extends HttpServlet {
    IServiceService serviceOfService = new ServiceOfServiceImpl();

    private void createService(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nameService = request.getParameter("nameService");
        double areaUse = Double.parseDouble(request.getParameter("areaUse"));
        int floorTotal = Integer.parseInt(request.getParameter("floorTotal"));
        int maximumGuest = Integer.parseInt(request.getParameter("maximumGuest"));
        double priceRent = Double.parseDouble(request.getParameter("priceRent"));
        int typeRent = Integer.parseInt(request.getParameter("typeRent"));
        int typeService = Integer.parseInt(request.getParameter("typeService"));
        String statusService = request.getParameter("statusService");
        Service service = new Service();
        service.setNameService(nameService);
        service.setAreaUse(areaUse);
        service.setFloorTotal(floorTotal);
        service.setMaximumGuest(maximumGuest);
        service.setPriceRent(priceRent);
        service.setTypeRent(typeRent);
        service.setTypeService(typeService);
        service.setStatusService(statusService);
        this.serviceOfService.save(service);
        showListServices(request, response);
    }


    private void showCreateService(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("jsp/add_service.jsp").forward(request, response);
    }

    private void showListServices(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Service> serviceList = this.serviceOfService.findAll();
        request.setAttribute("serviceList", serviceList);
        request.getRequestDispatcher("jsp/list_services.jsp").forward(request, response);
    }

    private void showEditService(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int idService = Integer.parseInt(request.getParameter("idService"));
        Service service = this.serviceOfService.findById(idService);
        List<KieuThue> kieuThueList = this.serviceOfService.getAllKieuThue();
        request.setAttribute("service", service);
        request.setAttribute("kieuThueList", kieuThueList);
        request.getRequestDispatcher("jsp/edit_service.jsp").forward(request, response);
    }

    private void editService(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String idService = request.getParameter("idService");
        String nameService = request.getParameter("nameService");
        double areaUse = Double.parseDouble(request.getParameter("areaUse"));
        int floorTotal = Integer.parseInt(request.getParameter("floorTotal"));
        int maximumGuest = Integer.parseInt(request.getParameter("maximumGuest"));
        double priceRent = Double.parseDouble(request.getParameter("priceRent"));
        int typeRent = Integer.parseInt(request.getParameter("typeRent"));
        int typeService = Integer.parseInt(request.getParameter("typeService"));
        String statusService = request.getParameter("statusService");
        Service service = this.serviceOfService.findById(Integer.parseInt(idService));
        service.setNameService(nameService);
        service.setAreaUse(areaUse);
        service.setFloorTotal(floorTotal);
        service.setMaximumGuest(maximumGuest);
        service.setPriceRent(priceRent);
        service.setTypeRent(typeRent);
        service.setTypeService(typeService);
        service.setStatusService(statusService);
        this.serviceOfService.update(service);
        showListServices(request, response);
    }

    private void deleteService(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int idService = Integer.parseInt(request.getParameter("idService"));
        this.serviceOfService.remove(idService);
        showListServices(request,response);
    }


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                createService(request, response);
                break;
            case "edit":
                editService(request, response);
                break;
            case "delete":
                deleteService(request,response);
                break;
                case "search":
                deleteService(request,response);
                break;
            default:
                showListServices(request, response);
                break;
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                showCreateService(request, response);
                break;
            case "view":
//                viewService(request, response);
                break;
            case "edit":
                showEditService(request, response);
                break;
            case "delete":
                deleteService(request,response);
                break;
            default:
                showListServices(request, response);
                break;
        }
    }
}
