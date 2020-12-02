package controllers;

import commons.FileCSV;
import models.*;

import javax.xml.ws.Service;
import java.util.*;

import static controllers.BookingController.addNewBooking;
import static controllers.HouseController.showHouseServiceNameNotDupicate;
import static controllers.RoomController.showRoomServiceNameNotDupicate;
import static controllers.VillaController.showVillaServiceNameNotDupicate;

public class MainController {
    public static List<Services> villaList = new ArrayList<>();
    public static List<Services> houseList = new ArrayList<>();
    public static List<Services> roomList = new ArrayList<>();
    public static List<Customer> customerList = new ArrayList<>();
    public static List<Customer> bookingList = new ArrayList<>();
    static String choice;
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
                choice = scanner.nextLine();
                switch (choice) {
                    case "1":
                        addNewServices();
                        break;
                    case "2":
                        showServices();
                        break;
                    case "3":
                        addNewCustomer();
                        break;
                    case "4":
                        showInformationCustomer();
                        break;
                    case "5":
                        addNewBooking();
                        break;
                    case "6":
                        System.out.println("Chưa xong ^^");
                        break;
                    case "7":
                        System.out.println("Chưa xong ^^");
                        break;
                    case "8":
                        System.out.println("Chưa xong ^^");
                        break;
                    case "9":
                        System.exit(0);
                        break;
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
            displayMainMenu();
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

                String choiceNewService = scanner.nextLine();
                switch (choiceNewService) {
                    case "1":
                        Services villa = VillaController.villaInput();
                        villaList.add(villa);
                        FileCSV.writeVillaFileCSV(villaList);
                        System.out.println("--------------");
                        System.out.println("Add " + villa.showInfo() + " \nthành công!");
                        System.out.println("Nhấn Enter để tiếp tục...");
                        scanner.skip("\n");
                        scanner.nextLine();
                        addNewServices();

                        break;
                    case "2":
                        House house = HouseController.houseInput();
                        houseList.add(house);
                        FileCSV.writeHouseFileCSV(houseList);
                        System.out.println("--------------");
                        System.out.println("Add " + house.showInfo() + "\n thành công!");
                        System.out.println("Nhấn Enter để tiếp tục...");
                        scanner.skip("\n");
                        scanner.nextLine();
                        addNewServices();
                        break;
                    case "3":
                        Room room = RoomController.roomInput();
                        roomList.add(room);
                        FileCSV.writeRoomFileCSV(roomList);
                        System.out.println("-------------");
                        System.out.println("Add " + room.showInfo() + ".\n thành công!");
                        System.out.println("Nhấn Enter để tiếp tục...");
                        scanner.skip("\n");
                        scanner.nextLine();
                        addNewServices();
                        break;
                    case "4":
                        displayMainMenu();
                        break;
                    case "5":
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
        try {
        System.out.println("---------------");
        System.out.print("SHOW ALL SERVICES\n" +
                "1. Show all Villa\n" +
                "2. Show all House\n" +
                "3. Show all Room\n" +
                "4. Show all name of villa not duplicate\n" +
                "5. Show all name of house not duplicate\n" +
                "6. Show all name of room not duplicate\n" +
                "7. Back to menu\n" +
                "8. Exit\n" +
                "Please choose the function: ");
        String showServicesIndex = scanner.nextLine();
            switch (showServicesIndex) {
                case "1": {
                    System.out.println("**************");
                    for (Services villa : villaList) {
                        System.out.println(villa.showInfo());
                        System.out.println("------------");
                    }
                    System.out.println("Press ENTER to continue");
                    scanner.nextLine();
                    showServices();
                    break;
                }
                case "2": {
                    System.out.println("**************");

                    for (Services house : houseList) {
                        System.out.println(house.showInfo());
                        System.out.println("------------");
                    }
                    System.out.println("Press ENTER to continue");
                    scanner.nextLine();
                    showServices();
                    break;
                }
                case "3": {
                    System.out.println("**************");
                    for (Services room : roomList) {
                        System.out.println(room.showInfo());
                        System.out.println("------------");
                    }
                    System.out.println("Press ENTER to continue");
                    scanner.nextLine();
                    showServices();
                    break;
                }
                case "4": {
                    System.out.println("**************");

                    showVillaServiceNameNotDupicate(villaList);
                    showServices();
                    break;
                }
                case "5": {
                    System.out.println("**************");

                    showHouseServiceNameNotDupicate(houseList);
                    showServices();
                    break;
                }
                case "6": {
                    System.out.println("**************");
                    showRoomServiceNameNotDupicate(roomList);
                    showServices();
                    break;
                }
                case "7": {
                    displayMainMenu();
                    break;
                }
                case "8": {
                    System.exit(0);
                    break;
                }
                default: {
                    System.out.println("The index input is invalid. Please press ENTER to continue !!!");
                    scanner.nextLine();
                    showServices();
                }
            }

        } catch (InputMismatchException e) {
            System.out.println("Nhập vào không phải là số!");
            System.out.println(e.getMessage());
        } finally {
            showServices();
        }
    }


    public static void addNewCustomer() {
        Customer customer = CustomerController.inputCustomer();
        customerList.add(customer);
        FileCSV.writeCustomerFileCSV(customerList);
        System.out.println("--------------");
        System.out.println("Add " + customer.showInfor() + " \nthành công!");
        System.out.println("Nhấn Enter để tiếp tục...");
        scanner.skip("\n");
        scanner.nextLine();
        displayMainMenu();
    }

    public static void showInformationCustomer() {
        System.out.println("**************");
        for (Customer customer : customerList) {
            System.out.println(customer.showInfor());
            System.out.println("------------");
        }
        System.out.println("Press ENTER to continue");
        scanner.nextLine();
        showServices();
    }
}
