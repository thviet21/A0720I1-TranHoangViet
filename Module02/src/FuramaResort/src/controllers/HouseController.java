package controllers;

import commons.DataValidate;
import models.House;
import models.Services;

import java.util.List;
import java.util.TreeSet;

import static controllers.MainController.scanner;

public class HouseController {
    public static House houseInput(){
        House house = new House();

        System.out.println("--------------------");
        System.out.println("INPUT HOUSE INFORMATION: ");
        String inputData;
        try {
            do {
                System.out.println("Input ID:");
                inputData = scanner.nextLine();
            }while (!DataValidate.checkHouseID(inputData));
            house.setId(inputData);
            do {
                System.out.print("2. Service Name: ");
                inputData = scanner.nextLine();
            } while (!DataValidate.checkServiceName(inputData));
            house.setNameService(inputData);
            do {
                System.out.print("3. Area (>30m2): ");
                inputData = scanner.nextLine();
            } while (!DataValidate.checkArea(inputData));
            house.setAreaUse(Double.parseDouble(inputData));
            do {
                System.out.print("4. Price: ");
                inputData = scanner.nextLine();
            } while (!DataValidate.checkPriceRent(inputData));
            house.setPriceRent(Double.parseDouble(inputData));
            do {
                System.out.print("5. Maximum Guest (<=30 persons): ");
                inputData = scanner.nextLine();
            } while (!DataValidate.checkMaxGuest(inputData));
            house.setMaximumGuest(Integer.parseInt(inputData));
            do {
                System.out.print("6. Rent Type (Year,Month,Week,Day): ");
                inputData = scanner.nextLine();
            } while (!DataValidate.checkTypeRent(inputData));
            house.setTypeRent(inputData);
            do {
                System.out.print("7. Room Standard: ");
                inputData = scanner.nextLine();
            } while (!DataValidate.checkRoomStandard(inputData));
            house.setRoomStandard(inputData);
            do {
                System.out.print("8. Comp Service (Massage,Karaoke,Food,Drink,Car): ");
                inputData = scanner.nextLine();
            } while (!DataValidate.checkCompService(inputData));
            house.setCompService(inputData);
            do {
                System.out.print("9. Floor: ");
                inputData = scanner.nextLine();
            } while (!DataValidate.checkFloor(inputData));
            house.setFloor(Integer.parseInt(inputData));
            do {
                System.out.print("11. Description Room: ");
                inputData = scanner.nextLine();
            } while (!DataValidate.checkDesc(inputData));
            house.setDescriptionRoom(inputData);
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("Some error, please reinput House");
            houseInput();
        }
        return house;
    }
    public static void showHouseServiceNameNotDupicate(List<Services> houseList) {
        TreeSet<String> serviceNameList = new TreeSet<>();
        for (Services house : houseList) {
            serviceNameList.add(house.getNameService());
        }
        System.out.println(serviceNameList.toString());
        System.out.println("Press ENTER to continue");
        scanner.nextLine();
    }

}
