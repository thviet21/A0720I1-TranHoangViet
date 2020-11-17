package controllers;

import models.House;
import models.Room;
import models.Villa;

import java.util.Scanner;

public class InputData {
    static Scanner scanner = new Scanner(System.in);
    static String inputData;
    public static Villa villaInput(){
        Villa villa = new Villa();
        System.out.println("--------------------");
        System.out.println("INPUT VILLA INFORMATION: ");
        do {
            System.out.println("Input ID:");
            inputData = scanner.nextLine();
        }while (!DataValidate.checkVillaID(inputData));
        villa.setId(inputData);
        do {
            System.out.print("2. Service Name: ");
            inputData = scanner.nextLine();
        } while (!DataValidate.checkServiceName(inputData));
        villa.setNameService(inputData);
        do {
            System.out.print("3. Area (>30m2): ");
            inputData = scanner.nextLine();
        } while (!DataValidate.checkArea(inputData));
        villa.setAreaUse(Double.parseDouble(inputData));
        do {
            System.out.print("4. Price: ");
            inputData = scanner.nextLine();
        } while (!DataValidate.checkPriceRent(inputData));
        villa.setPriceRent(Double.parseDouble(inputData));
        do {
            System.out.print("5. Maximum Guest (<=30 persons): ");
            inputData = scanner.nextLine();
        } while (!DataValidate.checkMaxGuest(inputData));
        villa.setMaximumGuest(Integer.parseInt(inputData));
        do {
            System.out.print("6. Rent Type (Year,Month,Week,Day): ");
            inputData = scanner.nextLine();
        } while (!DataValidate.checkTypeRent(inputData));
        villa.setTypeRent(inputData);
        do {
            System.out.print("7. Room Standard: ");
            inputData = scanner.nextLine();
        } while (!DataValidate.checkRoomStandard(inputData));
        villa.setRoomStandard(inputData);
        do {
            System.out.print("8. Comp Service (Massage,Karaoke,Food,Drink,Car): ");
            inputData = scanner.nextLine();
        } while (!DataValidate.checkCompService(inputData));
        villa.setCompService(inputData);
        do {
            System.out.print("9. Pool Area (>15m2): ");
            inputData = scanner.nextLine();
        } while (!DataValidate.checkPoolArea(inputData));
        villa.setAreaOfPool(Double.parseDouble(inputData));
        do {
            System.out.print("10. Floor: ");
            inputData = scanner.nextLine();
        } while (!DataValidate.checkFloor(inputData));
        villa.setFloor(Integer.parseInt(inputData));
        do {
            System.out.print("11. Description Room: ");
            inputData = scanner.nextLine();
        } while (!DataValidate.checkDesc(inputData));
        villa.setDescriptionRoom(inputData);
        return villa;

    }
    public static House houseInput(){
        House house = new House();

        System.out.println("--------------------");
        System.out.println("INPUT HOUSE INFORMATION: ");
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
        return house;
    }
    public static Room roomInput(){
        Room room = new Room();

        System.out.println("--------------------");
        System.out.println("INPUT ROOM INFORMATION: ");
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
            System.out.print("7. Room Standard: ");
            inputData = scanner.nextLine();
        } while (!DataValidate.checkRoomStandard(inputData));
        room.setNameService(inputData);
        do {
            System.out.print("8. Free Service: ");
            inputData = scanner.nextLine();
        } while (!DataValidate.checkFreeService(inputData));
        room.setFreeServices(inputData);
        return room;
    }

}
