package controller;

import models.Guest;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@WebServlet(name = "controller.JSTLServlet", urlPatterns = "/output")
public class JSTLServlet extends HttpServlet {
    public static List<Guest> guestList = new ArrayList<>();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        
        Guest guest = new Guest();
        String name = request.getParameter("name");
        guest.setName(name);
//        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        String birthday_AtString = request.getParameter("birthday");
        String address = request.getParameter("address");
        String urlImg = request.getParameter("image_src");
        guest.setAddress(address);
        guest.setBirthday(birthday_AtString);
        guest.setImgsrc(urlImg);
        guestList.add(guest);
        request.setAttribute("guestList",guestList);
        request.getRequestDispatcher("jsp/output_guest.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("jsp/input_guest.jsp").forward(request,response);
    }


}
