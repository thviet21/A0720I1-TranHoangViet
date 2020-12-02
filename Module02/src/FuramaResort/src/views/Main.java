package views;

import commons.FileCSV;
import controllers.MainController;
import models.Services;

import static controllers.MainController.*;

public class Main {

    public static void main(String[] args) {
        FileCSV.readVillaFileCSV();
        FileCSV.readHouseFileCSV();
        FileCSV.readRoomFileCSV();
        FileCSV.readCustomerFileCSV();

        displayMainMenu();
    }
}
