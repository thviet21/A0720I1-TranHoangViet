package controller;

import model.Customer;
import service.CustomerService;
import service.impl.CustomerServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "SearchServlet", urlPatterns = "/search")
public class SearchServlet extends HttpServlet {
    private CustomerService service = new CustomerServiceImpl();
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String country = request.getParameter("country").trim();

        List<Customer> customerList = country == null ? service.findAll() : service.findByCountry(country);
//        response.setContentType("text/plain");
//        response.getWriter().write(customerList.toString());
        if (customerList.isEmpty()){
            response.getWriter().append("Not found");
            return;
        }
        request.setAttribute("customers", customerList);
        request.getRequestDispatcher("jsp/customer/result.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("jsp/customer/search.jsp").forward(request, response);
    }
}
