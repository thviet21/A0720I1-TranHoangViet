package controller;

import dao.ICustomerDAO;
import dao.impl.CustomerDAOImpl;
import model.Customer;
import service.CustomerService;
import service.impl.CustomerServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "CustomerServlet", urlPatterns = "/customers")
public class CustomerServlet extends HttpServlet {
    private CustomerService customerService = new CustomerServiceImpl();
    private ICustomerDAO customerDAO = new  CustomerDAOImpl();
    private void listCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Customer> customers = this.customerService.findAll();
        request.setAttribute("customers", customers);

        request.getRequestDispatcher("jsp/customer/list.jsp").forward(request,response);
    }

    private void viewCustomers(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        Customer customer = this.customerService.findById(id);
        request.setAttribute("customer", customer);

        request.getRequestDispatcher("jsp/customer/view.jsp").forward(request,response);
    }

    private void deleteCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        this.customerService.remove(id);
        listCustomer(request,response);
    }

    private void viewCreateCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("jsp/customer/create.jsp").forward(request,response);
    }

    private void createCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String address = request.getParameter("address");
        Customer customer = new Customer(id, name, email, address);
        this.customerService.insertUserStore(customer);
        listCustomer(request, response);
    }

    private void viewUpdateCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
        int id = Integer.parseInt(request.getParameter("id"));
        Customer customer = this.customerService.getUserById(id);
        request.setAttribute("customer", customer);
        request.getRequestDispatcher("jsp/customer/edit.jsp").forward(request,response);
    }

    private void updateCustomer(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String address = request.getParameter("address");
        Customer customer = new Customer(id, name, email, address);
        this.customerService.update(id,customer);
        listCustomer(request, response);
    }
    private void addUserPermision(HttpServletRequest request, HttpServletResponse response) {
        Customer customer = new Customer(5,"kien", "kienhoang@gmail.com", "vn");
        int[] permision = {1, 2, 4};
        customerDAO.addUserTransaction(customer, permision);

    }
    private void testWithoutTran(HttpServletRequest request, HttpServletResponse response) {
        customerDAO.insertUpdateWithoutTransaction();

    }
    private void testUseTran(HttpServletRequest request, HttpServletResponse response) {

        customerDAO.insertUpdateUseTransaction();

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                try {
                    createCustomer(request, response);
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                break;
            case "edit":
                updateCustomer(request,response);
                break;
            default:
                listCustomer(request,response);
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
                viewCreateCustomer(request, response);
                break;
            case "edit":
                try {
                    viewUpdateCustomer(request,response);
                } catch (SQLException e) {
                        e.printStackTrace();
                }
                break;
            case "delete":
                deleteCustomer(request,response);
                break;
            case "view":
                viewCustomers(request,response);
                break;
            case "permision":

                addUserPermision(request, response);
                break;
            case "test-without-tran":
                testWithoutTran(request, response);
                break;
            case "test-use-tran":

                testUseTran(request, response);
                break;
            default:
                listCustomer(request,response);
                break;
        }
    }
}
