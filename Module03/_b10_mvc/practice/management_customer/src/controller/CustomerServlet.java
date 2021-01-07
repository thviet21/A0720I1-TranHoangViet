package controller;

import model.Customer;
import service.CustomerService;
import service.CustomerServiceImp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "CustomerServlet", urlPatterns = "/customers")
public class CustomerServlet extends HttpServlet {
    private CustomerService customerService = new CustomerServiceImp();

    private void listCustomer(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException {
        List<Customer> customersList = this.customerService.findAll();
        req.setAttribute("customers",customersList);
        req.getRequestDispatcher("jsp/list.jsp").forward(req,res);
    }
    private void showFormCreateCustomer(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException {
        req.getRequestDispatcher("jsp/create.jsp").forward(req,res);
    }
    private void createCustomer(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id").trim());
        String name = req.getParameter("name");
        String email = req.getParameter("email");
        String address = req.getParameter("address");
        this.customerService.save(new Customer(id,name,email,address));
        listCustomer(req,res);
    }
    private void viewCustomer(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Customer customer = this.customerService.findById(id);
        request.setAttribute("customer", customer);
        request.getRequestDispatcher("jsp/view.jsp").forward(request,response);
    }
    private void deleteCustomer(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        this.customerService.remove(id);
        listCustomer(req,res);
    }

    private void showEditCustomer(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        Customer customer = this.customerService.findById(id);
        req.setAttribute("customer",customer);
        req.getRequestDispatcher("jsp/edit.jsp").forward(req,res);
    }

    private void editCustomer(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        String name = req.getParameter("name");
        String email = req.getParameter("email");
        String address = req.getParameter("address");
        this.customerService.update(id,new Customer(id,name,email,address));
        listCustomer(req,res);
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if(action == null){
            action = "";
        }
        switch (action){
            case "create":
                createCustomer(request, response);
                break;
            case "edit":
                editCustomer(request,response);
                break;
            case "delete":
                deleteCustomer(request,response);
                break;
            default:
                listCustomer(request,response);
                break;
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if(action == null){
            action = "";
        }
        switch (action){
            case "create":
                showFormCreateCustomer(request,response);
                break;
            case "edit":
                showEditCustomer(request,response);
                break;
            case "delete":
                deleteCustomer(request,response);
                break;
            case "view":
                viewCustomer(request,response);
                break;
            default:
                listCustomer(request,response);
                break;
        }
    }
}
