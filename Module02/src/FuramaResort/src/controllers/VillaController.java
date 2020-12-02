package controllers;

import commons.DataValidate;
import models.Services;
import models.Villa;

import java.util.List;
import java.util.TreeSet;

import static controllers.RoomController.scanner;

public class VillaController {
    public static Villa villaInput(){
        Villa villa = new Villa();
        System.out.println("--------------------");
        System.out.println("INPUT VILLA INFORMATION: ");
        String inputData;
        try {
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
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("Some error, please reinput Villa");
            villaInput();
        }
        return villa;

    }
    public static void showVillaServiceNameNotDupicate(List<Services> villaList) {
        TreeSet<String> serviceNameList = new TreeSet<>();
        for (Services villa : villaList) {
            serviceNameList.add(villa.getNameService());
        }
        System.out.println(serviceNameList.toString());
        System.out.println("Press ENTER to continue");
        scanner.nextLine();
    }

}
