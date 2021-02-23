package controller;

import commons.validate.Validate;
import model.Room;
import service.IServiceRoom;
import service.impl.ServiceRoomImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "RoomServlet", urlPatterns = "/rooms")
public class RoomServlet extends HttpServlet {
    private IServiceRoom serviceRoom = new ServiceRoomImpl();

    private void showListRooms(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Room> roomLists = serviceRoom.findAll();
        request.setAttribute("roomLists", roomLists);
        request.getRequestDispatcher("jsp/showListRooms.jsp").forward(request,response);
    }
    private void showCreateRoom(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("jsp/createRoom.jsp").forward(request,response);
    }
    private void deleteRoom(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int idRoom = Integer.parseInt(request.getParameter("idRoom"));
        this.serviceRoom.remove(idRoom);
        showListRooms(request,response);
    }
    private void searchRoom(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String search = request.getParameter("search");

        List<Room> roomLists = this.serviceRoom.findByName(search);
        request.setAttribute("roomLists",roomLists);
        request.getRequestDispatcher("jsp/showListRooms.jsp").forward(request,response);
    }
    private void createRoom(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String messageName = null;
        String messageTelephone = null;
        String messageDesc = null;
        String nameCustomer = request.getParameter("nameCustomer");
        if (!Validate.checkNameCustomer(nameCustomer)){
            messageName = "Name sai cú pháp, không chứa số hoặc dài hơn 45 chữ cái!";
            request.setAttribute("validName",messageName);
        }
        String telephoneNumberCustomer = request.getParameter("telephoneNumberCustomer");
        if (!Validate.checkPhoneNumber(telephoneNumberCustomer)){
            messageTelephone = "Sai định dạng sđt, 10 số!";
            request.setAttribute("validName",messageTelephone);
        }
        String startDayRent = request.getParameter("startDayRent");
        int typePay = Integer.parseInt(request.getParameter("typePay"));
        String description = request.getParameter("description");
        if (!Validate.checkDescription(description)){
            messageDesc = "Lớn hơn 0 nhỏ hơn 200 kí tự";
            request.setAttribute("validName",messageDesc);
        }

        this.serviceRoom.save(new Room(nameCustomer,telephoneNumberCustomer,startDayRent,typePay,description));
        showListRooms(request,response);
    }


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                createRoom(request, response);
                break;
            case "edit":
//                editRoom(request, response);
                break;
            case "delete":
                deleteRoom(request,response);
                break;
            case "search":
                searchRoom(request,response);
                break;
            default:
                showListRooms(request, response);
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
                showCreateRoom(request, response);
                break;
            case "view":
//                viewRoom(request, response);
                break;
            case "edit":
//                showEditRoom(request, response);
                break;
            case "delete":
                deleteRoom(request,response);
                break;
            default:
                showListRooms(request, response);
                break;
        }
    }
}
