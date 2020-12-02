package controllers;

import commons.FileCSV;
import models.Customer;
import models.House;
import models.Room;
import models.Villa;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class BookingController {
    static Scanner scanner = new Scanner(System.in);
    static List<Customer> listBookingCustomer;
    ;

    public static void addNewBooking() {
        int numberCus = 1;
        try {
            System.out.println("Bạn muốn booking cho khách nào?: ");
            for (Customer customer : MainController.customerList) {
                System.out.println(numberCus + ". " + customer.getNameCus());
                numberCus++;
            }
            System.out.println("-------");
            int choice = Integer.parseInt(scanner.nextLine());
            Customer customer = MainController.customerList.get(choice-1);
            System.out.println("Bạn muốn booking loại dịch vụ nào?\n" +
                    "1.\tBooking Villa\n" +
                    "2.\tBooking House\n" +
                    "3.\tBooking Room\n");
            int choiceService = Integer.parseInt(scanner.nextLine());
            switch (choiceService) {
                case 1:
                    Villa villa = bookingVilla();
//                Thêm khách hàng vào list booking
                    customer.setServices(villa);
                    listBookingCustomer.add(customer);
//                Ghi khách hàng vào danh sách booking
                    FileCSV.writeBookingToCSV(listBookingCustomer);
                    break;
                case 2:
                    House house = bookingHouse();
//                Thêm khách hàng vào list booking
                    customer.setServices(house);
                    listBookingCustomer.add(customer);
//                Ghi khách hàng vào danh sách booking
                    FileCSV.writeBookingToCSV(listBookingCustomer);
                    break;
                case 3:
                    Room room = bookingRoom();
//                Thêm khách hàng vào list booking
                    customer.setServices(room);
                    listBookingCustomer.add(customer);
//                Ghi khách hàng vào danh sách booking
                    FileCSV.writeBookingToCSV(listBookingCustomer);
                    break;
                default:
                    System.out.println("Nhập vào số từ 1-3!");
                    System.out.println("Enter để quay về main menu");
                    scanner.nextLine();
                    addNewBooking();
            }
        } catch (InputMismatchException e) {
            e.printStackTrace();
            System.out.println("Input nhập vào xảy ra lỗi! vui lòng thực hiện lại");
            MainController.displayMainMenu();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Input nhập vào xảy ra lỗi! vui lòng thực hiện lại");
            MainController.displayMainMenu();
        }
    }

    private static Villa bookingVilla() {
        System.out.println("Danh sách các villa có trong hệ thống");
        for (int i = 1; i < MainController.villaList.size(); i++) {
            System.out.println(i + ". " + MainController.villaList.get(i).getNameService());
        }
        System.out.println("Bạn muốn chọn căn villa nào");
        int choiceVilla = Integer.parseInt(scanner.nextLine());
        return (Villa) MainController.villaList.get(choiceVilla-1);
    }

    //    Hàm booking house
    private static House bookingHouse() {
        System.out.println("Danh sách các house có trong hệ thống");
        for (int i = 0; i < MainController.houseList.size(); i++) {
            System.out.println(i + ". " + MainController.houseList.get(i).getNameService());
        }
        System.out.println("Bạn muốn chọn căn house nào");
        int choiceHouse = Integer.parseInt(scanner.nextLine());
        return (House) MainController.houseList.get(choiceHouse-1);
    }

    //    Hàm booking room
    private static Room bookingRoom() {
        System.out.println("Danh sách các room có trong hệ thống");
        for (int i = 0; i < MainController.roomList.size(); i++) {
            System.out.println(i + ". " + MainController.roomList.get(i).getNameService());
        }
        System.out.println("Bạn muốn chọn căn villa nào");
        int choiceRoom = Integer.parseInt(scanner.nextLine());
        return (Room) MainController.roomList.get(choiceRoom-1);
    }
}
