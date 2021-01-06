package controller;

import model.Person;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet(name = "ShowInformationServlet", urlPatterns = "/information")
public class ShowInformationServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String fullname = request.getParameter("fullname");
        String address = request.getParameter("address");
        String birthdayAsString =request.getParameter("birthday");
        Person person = new Person(fullname,address);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date birthday = simpleDateFormat.parse(birthdayAsString);
            person.setBirthday(birthday);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        request.setAttribute("person",person);

        request.getRequestDispatcher("jsp/output-information.jsp").forward(request,response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("jsp/input-information.jsp").forward(request,response);
    }
}
