package controller;

import model.Customer;
import service.ICustomerService;
import service.impl.CustomerServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "CustomerServlet", urlPatterns = "/customers")
public class CustomerServlet extends HttpServlet {
    private ICustomerService customerService = new CustomerServiceImpl();


    private void showListCustomers(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        List<Customer> customersList = this.customerService.findAll();
        request.setAttribute("customersList", customersList);
        request.getRequestDispatcher("jsp/list_customers.jsp").forward(request, response);
    }

    private void createCustomer(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        Customer customer = new Customer();
        String idTypeCus = request.getParameter("idTypeCus");
        String nameCus = request.getParameter("nameCus");
        String birthdayCus = request.getParameter("birthdayCus");
        String gender = request.getParameter("gender");
        String passport = request.getParameter("passport");
        String telephoneNumber = request.getParameter("telephoneNumber");
        String emailCus = request.getParameter("emailCus");
        String addressCus = request.getParameter("addressCus");
        customer.setTypeCus(idTypeCus);
        customer.setNameCus(nameCus);
        customer.setBirthDay(birthdayCus);
        customer.setGender(gender);
        customer.setPassPort(passport);
        customer.setTelephoneNumber(telephoneNumber);
        customer.setEmailCus(emailCus);
        customer.setAddressCus(addressCus);
        customerService.save(customer);
        showListCustomers(request, response);

    }

    private void showCreateCustomer(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        request.getRequestDispatcher("jsp/add_customer.jsp").forward(request, response);
    }

    private void viewCustomer(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        int idCus = Integer.parseInt(request.getParameter("idCus"));
        Customer customer = customerService.findById(idCus);
        request.setAttribute("customer", customer);
        request.getRequestDispatcher("jsp/view_customer.jsp").forward(request, response);
    }

    private void showEditCustomer(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        int id = Integer.parseInt(request.getParameter("id"));
        Customer customer = customerService.findById(id);
        request.setAttribute("customer", customer);
        request.getRequestDispatcher("jsp/edit_customer.jsp").forward(request,response);
    }

    private void editCustomer(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String id = request.getParameter("idCus");
        Customer customer = this.customerService.findById(Integer.parseInt(id));
        String idTypeCus = request.getParameter("idTypeCus");
        String nameCus = request.getParameter("nameCus");
        String birthdayCus = request.getParameter("birthdayCus");
        String gender = request.getParameter("gender");
        String passport = request.getParameter("passport");
        String telephoneNumber = request.getParameter("telephoneNumber");
        String emailCus = request.getParameter("emailCus");
        String addressCus = request.getParameter("addressCus");
        customer.setTypeCus(idTypeCus);
        customer.setNameCus(nameCus);
        customer.setBirthDay(birthdayCus);
        customer.setGender(gender);
        customer.setPassPort(passport);
        customer.setTelephoneNumber(telephoneNumber);
        customer.setEmailCus(emailCus);
        customer.setAddressCus(addressCus);
        customerService.update(customer);
        showListCustomers(request, response);
    }

    private void deleteCustomer(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        int id = Integer.parseInt(request.getParameter("idCus"));
        this.customerService.remove(id);
        showListCustomers(request,response);
    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
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
                showListCustomers(request, response);
                break;
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                showCreateCustomer(request, response);
                break;
            case "view":
                viewCustomer(request, response);
                break;
            case "edit":
                showEditCustomer(request,response);
                break;
            case "delete":
                deleteCustomer(request,response);
                break;
            default:
                showListCustomers(request, response);
                break;
        }
    }
}
