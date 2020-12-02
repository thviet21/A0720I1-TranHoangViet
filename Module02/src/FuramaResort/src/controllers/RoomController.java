package controllers;

import commons.DataValidate;
import models.Room;
import models.Services;

import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class RoomController {
    static Scanner scanner = new Scanner(System.in);
    static String inputData;


    public static Room roomInput(){
        Room room = new Room();

        System.out.println("--------------------");
        System.out.println("INPUT ROOM INFORMATION: ");
        try {
            do {
                System.out.println("Input ID:");
                inputData = scanner.nextLine();
            }while (!DataValidate.checkRoomID(inputData));
            room.setId(inputData);
            do {
                System.out.print("2. Service Name: ");
                inputData = scanner.nextLine();
            } while (!DataValidate.checkServiceName(inputData));
            room.setNameService(inputData);
            do {
                System.out.print("3. Area (>30m2): ");
                inputData = scanner.nextLine();
            } while (!DataValidate.checkArea(inputData));
            room.setAreaUse(Double.parseDouble(inputData));
            do {
                System.out.print("4. Price: ");
                inputData = scanner.nextLine();
            } while (!DataValidate.checkPriceRent(inputData));
            room.setPriceRent(Double.parseDouble(inputData));
            do {
                System.out.print("5. Maximum Guest (<=30 persons): ");
                inputData = scanner.nextLine();
            } while (!DataValidate.checkMaxGuest(inputData));
            room.setMaximumGuest(Integer.parseInt(inputData));
            do {
                System.out.print("6. Rent Type (Year,Month,Week,Day): ");
                inputData = scanner.nextLine();
            } while (!DataValidate.checkTypeRent(inputData));
            room.setTypeRent(inputData);
            do {
                System.out.print("7. Free Service: ");
                inputData = scanner.nextLine();
            } while (!DataValidate.checkFreeService(inputData));
            room.setFreeServices(inputData);
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("Some error, please reinput Room");
            roomInput();
        }
        return room;
    }
    public static void showRoomServiceNameNotDupicate(List<Services> roomList) {
        TreeSet<String> serviceNameList = new TreeSet<>();
        for (Services room : roomList) {
            serviceNameList.add(room.getNameService());
        }
        System.out.println(serviceNameList.toString());
        System.out.println("Press ENTER to continue");
        scanner.nextLine();
    }

}
