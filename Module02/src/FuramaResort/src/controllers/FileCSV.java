package controllers;

import models.House;
import models.Room;
import models.Villa;

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
    private static final String NEW_LINE_SEPARATOR = "\n";
    public static final String VILLA_HEADER = "Villa ID,Service Name,Area,Price Rent,Maximum Guest,Type Rent,Room Standard,Description Room,Area Of Pool,Floor,Comp Service";
    public static final String HOUSE_HEADER = "House ID,Service Name,Area,Price Rent,Maximum Guest,Type Rent,Room Standard,Description Room,Floor ,Comp Service";
    public static final String ROOM_HEADER = "Room ID,Service Name,Area,Price Rent,Maximum Guest,Type Rent,Free Services";
    static ArrayList<Villa> villaArrayList= new ArrayList<>();
    static ArrayList<House> houseArrayList= new ArrayList<>();
    static ArrayList<Room> roomArrayList= new ArrayList<>();
    public static void writeFileCSV(List<Villa> villaList) {
        BufferedWriter bufferedWriter = null;
        try {
            File file = new File(VILLA_PATH);
            FileWriter fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(VILLA_HEADER);
            bufferedWriter.write(NEW_LINE_SEPARATOR);
            for (Villa villa : villaList) {
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

    public static void writeHouseFileCSV(List<House> houseList) {
        BufferedWriter bufferedWriter = null;
        try {
            File file = new File(HOUSE_PATH);
            FileWriter fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(HOUSE_HEADER);
            for (House house : houseList) {
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

    public static void writeRoomFileCSV(List<Room> roomList) {
        BufferedWriter bufferedWriter = null;
        try {
            File file = new File(ROOM_PATH);
            FileWriter fileWriter = new FileWriter(file);
            bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(ROOM_HEADER);
            for (Room room : roomList) {
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
    public static ArrayList<Villa> readVillaFileCSV(){
        BufferedReader bufferedReader = null ;
        Path path = Paths.get(VILLA_PATH);
        if (!Files.exists(path)) {
            try{
                Writer writer = new FileWriter(VILLA_PATH);
            }catch (Exception e){{
                System.out.println(e.getMessage());
            }
            }
        }
        try {
            String line;
            bufferedReader = new BufferedReader(new FileReader(VILLA_PATH));
            while ((line = bufferedReader.readLine()) != null) {
                String[] split = line.split(",");
                if(split[0].equals("Villa ID")){
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
                villaArrayList.add(villa);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }
        return villaArrayList;
    }
    public static ArrayList<House> readHouseFileCSV(){
        BufferedReader bufferedReader = null ;
        Path path = Paths.get(HOUSE_PATH);
        if (!Files.exists(path)) {
            try{
                Writer writer = new FileWriter(VILLA_PATH);
            }catch (Exception e){{
                System.out.println(e.getMessage());
            }
            }
        }
        try {
            String line;
            bufferedReader = new BufferedReader(new FileReader(HOUSE_PATH));
            while ((line = bufferedReader.readLine()) != null) {
                String[] split = line.split(",");
                if(split[0].equals("House ID")){
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
                houseArrayList.add(house);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }
        return houseArrayList;
    }
    public static ArrayList<Room> readRoomFileCSV(){
        BufferedReader bufferedReader = null ;
        Path path = Paths.get(ROOM_PATH);
        if (!Files.exists(path)) {
            try{
                Writer writer = new FileWriter(VILLA_PATH);
            }catch (Exception e){{
                System.out.println(e.getMessage());
            }
            }
        }
        try {
            String line;
            bufferedReader = new BufferedReader(new FileReader(ROOM_PATH));
            while ((line = bufferedReader.readLine()) != null) {
                String[] split = line.split(",");
                if(split[0].equals("Room ID")){
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
                roomArrayList.add(room);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }
        return roomArrayList;
    }

}
