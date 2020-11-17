package controllers;

import java.util.InputMismatchException;

public class DataValidate {
    private static String regex = "";
    public static boolean checkVillaID(String str){
        regex = "^SVVL-[\\d]{4}$";
        return str.matches(regex);
    }
    public static boolean checkHouseID(String str){
        regex = "^SVHO-[\\d]{4}$";
        return str.matches(regex);
    }
    public static boolean checkRoomID(String str){
        regex = "^SVRO-[\\d]{4}$";
        return str.matches(regex);
    }


    public static boolean checkServiceName(String str){
        regex = "^[A-Z][a-z]{0,}([\\s][A-Z][a-z]{0,})*$";
        return str.matches(regex);
    }


    public static boolean checkArea(String str){
        double numArea;
        try{
            numArea = Double.parseDouble(str);
            if (numArea > 30){
                return true;
            }else return false;
        }catch (Exception e){
            System.out.println("Lỗi diện tích nhập vào!");
            return false;
        }
    }
    public static boolean checkPriceRent(String price){
        double rateNumber;
        try {
            rateNumber = Double.parseDouble(price);
            if (rateNumber > 0){
                return true;
            } else return false;
        } catch (Exception e){
            return false;
        }
    }
    public static boolean checkTypeRent(String type){
        regex = "^Year|Month|Week|Day$";
        return type.matches(regex);
    }

    public static boolean checkMaxGuest(String capacity){
        int maxGuest;
        try {
            maxGuest = Integer.parseInt(capacity);
            if (maxGuest > 0 && maxGuest < 30){
                return true;
            }
            else return false;
        }catch (Exception e){
            System.out.println("Vượt quá số lương khác cho phép!");
            return false;
        }
    }
    public static boolean checkRoomStandard(String standard){
        regex = "^5 Sao|4 Sao|3 Sao|2 Sao|1 Sao|5 sao|4 sao|3 sao|2 sao|1 sao$";
        return standard.matches(regex);
    }
    public static boolean checkRoomDesc(String des){
        regex = "\\w";
        return des.matches(regex);
    }

    public static boolean checkFloor(String floor){
        int floorNumber;
        try {
            floorNumber = Integer.parseInt(floor);
            if (floorNumber > 0){
                return true;
            } else return false;
        } catch (Exception e) {
            return false;
        }
    }
    public static boolean checkCompService(String service){
        regex = "^Massage|Karaoke|Food|Drink|Car$";
        return service.matches(regex);
    }
    public static boolean checkPoolArea(String area){
        double poolArea;
        try {
            poolArea = Double.parseDouble(area);
            if (poolArea >= 15){
                return true;
            }else return false;
        }catch (Exception e){
            System.out.println("Diện tích hồ bơi quá nhỏ không đúng tiêu chu");
            return false;
        }
    }
    public static boolean checkFreeService(String service){
        if (service.length() == 0){
            return false;
        }else return true;
    }
    public static boolean checkDesc(String desc){
        if (desc.length() == 0){
            return false;
        }else return true;
    }




}
