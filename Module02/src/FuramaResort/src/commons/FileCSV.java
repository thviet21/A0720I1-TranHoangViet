package commons;

import controllers.MainController;
import models.*;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileCSV {
    public static final String VILLA_PATH = "src/data/Villa.csv";
    public static final String HOUSE_PATH = "src/data/House.csv";
    public static final String ROOM_PATH = "src/data/Room.csv";
    public static final String CUSTOMER_PATH = "src/data/Customer.csv";
    private static final String BOOKING_PATH = "src/Data/Booking.csv";
    private static final String NEW_LINE_SEPARATOR = "\n";
    public static final String VILLA_HEADER = "Villa ID,Service Name,Area,Price Rent,Maximum Guest,Type Rent,Room Standard,Description Room,Area Of Pool,Floor,Comp Service";
    public static final String HOUSE_HEADER = "House ID,Service Name,Area,Price Rent,Maximum Guest,Type Rent,Room Standard,Description Room,Floor ,Comp Service";
    public static final String ROOM_HEADER = "Room ID,Service Name,Area,Price Rent,Maximum Guest,Type Rent,Free Services";
    public static final String CUSTOMER_HEADER = "Name Customer,Birthday,Gender,Passport,Telephone Number,Email Customer,Type Customer,Andress Customer";
    private static final String BOOKING_HEADER = "Name Customer,Birthday,Gender,Passport,Telephone Number,Email Customer,Type Customer,Andress Customer,Name Service";


    public static void writeVillaFileCSV(List<Services> villaList) {

        BufferedWriter bufferedWriter = null;
        try {
            File file = new File(VILLA_PATH);
            FileWriter fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(VILLA_HEADER);
            bufferedWriter.write(NEW_LINE_SEPARATOR);
            for (Services villa : villaList) {
                bufferedWriter.write(villa.writeToCSV());
                bufferedWriter.write(NEW_LINE_SEPARATOR);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedWriter.flush();
                bufferedWriter.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void writeHouseFileCSV(List<Services> houseList) {
        BufferedWriter bufferedWriter = null;
        try {
            File file = new File(HOUSE_PATH);
            FileWriter fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(HOUSE_HEADER);
            bufferedWriter.write(NEW_LINE_SEPARATOR);
            for (Services house : houseList) {
                bufferedWriter.write(house.writeToCSV());
                bufferedWriter.write(NEW_LINE_SEPARATOR);
            }


        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedWriter.flush();
                bufferedWriter.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void writeRoomFileCSV(List<Services> roomList) {
        BufferedWriter bufferedWriter = null;
        try {
            File file = new File(ROOM_PATH);
            FileWriter fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(ROOM_HEADER);
            bufferedWriter.write(NEW_LINE_SEPARATOR);
            for (Services room : roomList) {
                bufferedWriter.write(room.writeToCSV());
                bufferedWriter.write(NEW_LINE_SEPARATOR);
            }


        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedWriter.flush();
                bufferedWriter.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void writeCustomerFileCSV(List<Customer> customerList) {
        BufferedWriter bufferedWriter = null;
        try {
            File file = new File(CUSTOMER_PATH);
            FileWriter fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(CUSTOMER_HEADER);
            bufferedWriter.write(NEW_LINE_SEPARATOR);
            for (Customer customer : customerList) {
                bufferedWriter.write(customer.writeToCSV());
                bufferedWriter.write(NEW_LINE_SEPARATOR);
            }


        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedWriter.flush();
                bufferedWriter.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public static void writeBookingToCSV(List<Customer> listBooking) {
        FileWriter fileWriter = null;
        BufferedWriter bufferedWriter = null;
        try {
            fileWriter = new FileWriter(BOOKING_PATH);
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(BOOKING_HEADER);
            bufferedWriter.write(NEW_LINE_SEPARATOR);
            for (Customer customer : listBooking) {
                bufferedWriter.write(customer.writeToCSV());
                bufferedWriter.write(customer.getServices().getNameService());
            }
        } catch (Exception e) {
            System.out.println("error in CSV writter");
        } finally {
            try {
                bufferedWriter.flush();
                bufferedWriter.close();
            } catch (Exception e) {
                System.out.println("error when flush or close");
            }
        }
    }

    public static ArrayList<Services> readVillaFileCSV() {

        BufferedReader bufferedReader = null;
        Path path = Paths.get(VILLA_PATH);
        if (!Files.exists(path)) {
            try {
                Writer writer = new FileWriter(VILLA_PATH);
            } catch (Exception e) {
                {
                    System.out.println(e.getMessage());
                }
            }
        }
        try {
            String line;
            bufferedReader = new BufferedReader(new FileReader(VILLA_PATH));
            while ((line = bufferedReader.readLine()) != null) {
                String[] split = line.split(",");
                if (split[0].equals("Villa ID")) {
                    continue;
                }
                Villa villa = new Villa();
                villa.setId(split[0]);
                villa.setNameService(split[1]);
                villa.setAreaUse(Double.parseDouble(split[2]));
                villa.setPriceRent(Double.parseDouble(split[3]));
                villa.setMaximumGuest(Integer.parseInt(split[4]));
                villa.setTypeRent(split[5]);
                villa.setRoomStandard(split[6]);
                villa.setDescriptionRoom(split[7]);
                villa.setAreaOfPool(Double.parseDouble(split[8]));
                villa.setFloor(Integer.parseInt(split[9]));
                villa.setCompService(split[10]);
                MainController.villaList.add(villa);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (ArrayList<Services>) MainController.villaList;
    }

    public static ArrayList<Services> readHouseFileCSV() {
        BufferedReader bufferedReader = null;
        Path path = Paths.get(HOUSE_PATH);
        if (!Files.exists(path)) {
            try {
                Writer writer = new FileWriter(VILLA_PATH);
            } catch (Exception e) {
                {
                    System.out.println(e.getMessage());
                }
            }
        }
        try {
            String line;
            bufferedReader = new BufferedReader(new FileReader(HOUSE_PATH));
            while ((line = bufferedReader.readLine()) != null) {
                String[] split = line.split(",");
                if (split[0].equals("House ID")) {
                    continue;
                }
                House house = new House();
                house.setId(split[0]);
                house.setNameService(split[1]);
                house.setAreaUse(Double.parseDouble(split[2]));
                house.setPriceRent(Double.parseDouble(split[3]));
                house.setMaximumGuest(Integer.parseInt(split[4]));
                house.setTypeRent(split[5]);
                house.setRoomStandard(split[6]);
                house.setDescriptionRoom(split[7]);
                house.setFloor(Integer.parseInt(split[8]));
                house.setCompService(split[9]);
                MainController.houseList.add(house);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (ArrayList<Services>) MainController.houseList;
    }

    public static ArrayList<Services> readRoomFileCSV() {
        BufferedReader bufferedReader = null;
        Path path = Paths.get(ROOM_PATH);
        if (!Files.exists(path)) {
            try {
                Writer writer = new FileWriter(VILLA_PATH);
            } catch (Exception e) {
                {
                    System.out.println(e.getMessage());
                }
            }
        }
        try {
            String line;
            bufferedReader = new BufferedReader(new FileReader(ROOM_PATH));
            while ((line = bufferedReader.readLine()) != null) {
                String[] split = line.split(",");
                if (split[0].equals("Room ID")) {
                    continue;
                }
                Room room = new Room();
                room.setId(split[0]);
                room.setNameService(split[1]);
                room.setAreaUse(Double.parseDouble(split[2]));
                room.setPriceRent(Double.parseDouble(split[3]));
                room.setMaximumGuest(Integer.parseInt(split[4]));
                room.setTypeRent(split[5]);
                room.setFreeServices(split[6]);
                MainController.roomList.add(room);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (ArrayList<Services>) MainController.roomList;
    }

    public static ArrayList<Customer> readCustomerFileCSV() {
        BufferedReader bufferedReader = null;
        Path path = Paths.get(CUSTOMER_PATH);
        if (!Files.exists(path)) {
            try {
                Writer writer = new FileWriter(CUSTOMER_PATH);
            } catch (Exception e) {
                {
                    System.out.println(e.getMessage());
                }
            }
        }
        try {
            String line;
            bufferedReader = new BufferedReader(new FileReader(CUSTOMER_PATH));
            while ((line = bufferedReader.readLine()) != null) {
                String[] split = line.split(",");
                if (split[0].equals("Name Customer")) {
                    continue;
                }
                Customer customer = new Customer();
                customer.setNameCus(split[0]);
                customer.setBirthDay(split[1]);
                customer.setGender(split[2]);
                customer.setPassPort(split[3]);
                customer.setTelephoneNumber(split[4]);
                customer.setEmailCus(split[5]);
                customer.setTypeCus(split[6]);
                customer.setAndressCus(split[7]);
                customer.setServices(null);
                MainController.customerList.add(customer);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (ArrayList<Customer>) MainController.customerList;
    }

    public static List<Customer> readBookingFileCSV(List<Services> services) {
        BufferedReader bufferedReader = null;
        Path path = Paths.get(CUSTOMER_PATH);
        if (!Files.exists(path)) {
            try {
                Writer writer = new FileWriter(CUSTOMER_PATH);
            } catch (Exception e) {
                {
                    System.out.println(e.getMessage());
                }
            }
        }
        try {
            String line;
            bufferedReader = new BufferedReader(new FileReader(BOOKING_PATH));
            while ((line = bufferedReader.readLine()) != null) {
                String[] split = line.split(",");
                if (split[0].equals("name")) {
                    continue;
                }
                Customer customer = new Customer();
                customer.setNameCus(split[0]);
//                customer.setServices(services.get());
                MainController.bookingList.add(customer);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                bufferedReader.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return MainController.bookingList;
    }
}
