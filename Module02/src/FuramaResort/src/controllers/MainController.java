package controllers;

import models.House;
import models.Room;
import models.Villa;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class MainController {
    public static List<Villa> villaList = new ArrayList<>();
    public static List<House> houseList = new ArrayList<>();
    public static List<Room> roomList = new ArrayList<>();
    static int choice;
    static Scanner scanner = new Scanner(System.in);

    public static void displayMainMenu() {
        try {
            while (true) {
                System.out.println("1. Add New Services\n" +
                        "2.Show Services\n" +
                        "3.Add New Customer\n" +
                        "4.Show Information of Customer\n" +
                        "5.Add New Booking\n" +
                        "6.Show Information of Employee\n" +
                        "7.Exit\n");

                System.out.println("Nhập vào lựa chọn của bạn: ");
                choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        addNewServices();
                        break;
                    case 2:
//                        showServices();
                        break;
                    case 7:
                        System.exit(0);
                    default:
                        System.out.println("Nhập vào số từ 1~7! Enter để quay về main menu");
                        scanner.nextLine();
                        displayMainMenu();

                }

            }
        } catch (InputMismatchException e) {
            e.getMessage();
            displayMainMenu();
        } catch (Exception e) {
            e.getMessage();
        }

    }

    public static void addNewServices() {
        System.out.println("------------------");
        try {
            while (true) {
                System.out.println("1.Add New Villa\n" +
                        "2.Add New House\n" +
                        "3.Add New Room\n" +
                        "4.Back to menu\n" +
                        "5.Exit\n ----------------\n Nhập lựa chọn: ");

                int choiceNewService = scanner.nextInt();
                switch (choiceNewService) {
                    case 1:
                        Villa villa = InputData.villaInput();
                        villaList.add(villa);
                        FileCSV.writeFileCSV(villaList);
                        System.out.println("--------------");
                        System.out.println("Add " + villa.showInfo() + " \nthành công!");
                        System.out.println("Nhấn Enter để tiếp tục...");
                        scanner.skip("\n");
                        scanner.nextLine();
                        addNewServices();

                        break;
                    case 2:
                        House house = InputData.houseInput();
                        houseList.add(house);
                        FileCSV.writeHouseFileCSV(houseList);
                        System.out.println("--------------");
                        System.out.println("Add " + house.showInfo() + "\n thành công!");
                        System.out.println("Nhấn Enter để tiếp tục...");
                        scanner.skip("\n");
                        scanner.nextLine();
                        addNewServices();
                        break;
                    case 3:
                        Room room = InputData.roomInput();
                        roomList.add(room);
                        FileCSV.writeRoomFileCSV(roomList);
                        System.out.println("-------------");
                        System.out.println("Add " + room.showInfo() + ".\n thành công!");
                        System.out.println("Nhấn Enter để tiếp tục...");
                        scanner.skip("\n");
                        scanner.nextLine();
                        addNewServices();
                        break;
                    case 4:
                        displayMainMenu();
                        break;
                    case 5:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Nhập vào số từ 1-5! Nhấn enter để thực hiện lại tác vụ!");
                        scanner.nextLine();
                        addNewServices();

                }
            }
        } catch (InputMismatchException ipe) {
            System.out.println("Yêu cầu nhập vào số");
            addNewServices();
        }
    }

    public static void showServices() {

    }

    public static void main(String[] args) {
        displayMainMenu();
    }
}
