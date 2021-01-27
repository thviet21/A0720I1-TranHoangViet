package controller;

import model.Customer;
import model.Service;
import service.IServiceService;
import service.impl.ServiceOfServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ServiceServlet",urlPatterns = "/services")
public class ServiceServlet extends HttpServlet {
    IServiceService serviceOfService = new ServiceOfServiceImpl();
    private void createService(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
    private void showCreateService(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
    private void showListService(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Service> serviceList = this.serviceOfService.findAll();
        request.setAttribute("serviceList", serviceList);
        request.getRequestDispatcher("jsp/list_services.jsp").forward(request, response);
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
//                editService(request,response);
                break;
            case "delete":
//                deleteService(request,response);
                break;
            default:
//                showListServices(request, response);
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
//                showEditService(request,response);
                break;
            case "delete":
//                deleteService(request,response);
                break;
            default:
                showListService(request, response);
                break;
        }
    }
}
