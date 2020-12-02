package commons;

import models.Services;

import java.time.LocalDate;
import java.time.Period;
import java.util.InputMismatchException;

public class DataValidate {
    private static String regex = "";

    public static boolean checkVillaID(String str) {
        regex = "^SVVL-[\\d]{4}$";
        return str.matches(regex);
    }

    public static boolean checkHouseID(String str) {
        regex = "^SVHO-[\\d]{4}$";
        return str.matches(regex);
    }

    public static boolean checkRoomID(String str) {
        regex = "^SVRO-[\\d]{4}$";
        return str.matches(regex);
    }


    public static boolean checkServiceName(String str) {
        regex = "^[A-Z][a-z]{0,}([\\s][A-Z][a-z]{0,})*$";
        return str.matches(regex);
    }


    public static boolean checkArea(String str) {
        double numArea;
        try {
            numArea = Double.parseDouble(str);
            return numArea > 30;
        } catch (Exception e) {
            System.out.println("Lỗi diện tích nhập vào!");
            return false;
        }
    }

    public static boolean checkPriceRent(String price) {
        double rateNumber;
        try {
            rateNumber = Double.parseDouble(price);
            return rateNumber > 0;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean checkTypeRent(String type) {
        regex = "^Year|Month|Week|Day$";
        return type.matches(regex);
    }

    public static boolean checkMaxGuest(String capacity) {
        int maxGuest;
        try {
            maxGuest = Integer.parseInt(capacity);
            return maxGuest > 0 && maxGuest < 30;
        } catch (Exception e) {
            System.out.println("Vượt quá số lương khác cho phép!");
            return false;
        }
    }

    public static boolean checkRoomStandard(String standard) {
        regex = "^5 Sao|4 Sao|3 Sao|2 Sao|1 Sao|5 sao|4 sao|3 sao|2 sao|1 sao$";
        return standard.matches(regex);
    }

    public static boolean checkRoomDesc(String des) {
        regex = "\\w";
        return des.matches(regex);
    }

    public static boolean checkFloor(String floor) {
        int floorNumber;
        try {
            floorNumber = Integer.parseInt(floor);
            return floorNumber > 0;
        } catch (Exception e) {
            return false;
        }
    }

    public static boolean checkCompService(String service) {
        regex = "^Massage|Karaoke|Food|Drink|Car$";
        return service.matches(regex);
    }

    public static boolean checkPoolArea(String area) {
        double poolArea;
        try {
            poolArea = Double.parseDouble(area);
            return poolArea >= 15;
        } catch (Exception e) {
            System.out.println("Diện tích hồ bơi quá nhỏ không đúng tiêu chu");
            return false;
        }
    }

    public static boolean checkFreeService(String service) {
        return service.length() != 0;
    }

    public static boolean checkDesc(String desc) {
        return desc.length() != 0;
    }

    public static boolean checkNameCus(String nameCus) {
        regex = "^([\\p{Lu}][\\p{Ll}]{1,8})(\\s([\\p{Lu}]|[\\p{Lu}][\\p{Ll}]{1,10})){0,5}$";
        return nameCus.matches(regex);
    }

    public static boolean checkBirthday(String birthDay) {
        regex = "(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)(?:0?[13-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$";
        return birthDay.matches(regex);
    }

    public static boolean check18YO(String birthDay) {
        int year = Integer.parseInt(birthDay.substring(6, 10));
        int month = Integer.parseInt(birthDay.substring(3, 5));
        int day = Integer.parseInt(birthDay.substring(0, 2));
        LocalDate birthday;
        if (birthDay.length() < 10){
            System.out.println("Invalid Birthday Format!");
            return false;
        }
        if (day < 0 || day > 31) {
            System.out.println("Day of birthday >31 or < 0");
            return false;
        }
        if (month < 0 || month > 12) {
            System.out.println("Month of birthday >12 or <0");
            return false;
        }
        LocalDate now = LocalDate.now();
        if (year < 1900 || (year > now.getYear())) {
            System.out.println("Year of birthday <1900 or > " + now.getYear());
            return false;
        }
        birthday = LocalDate.of(year, month, day);
        long age = Period.between(birthday, now).getYears();
        if (age > 18){
            return true;
        }else return false;

    }

    public static boolean checkGender(String gender) {
        regex = "^Male|Famale|Unknown$";
        return gender.matches(regex);
    }

    public static boolean checkPassport(String passport) {
        regex = "^\\d{9}$";
        return passport.matches(regex);
    }

    public static boolean checkTelephoneNum(String telephone) {
        regex = "^0\\d{9}$";
        return telephone.matches(regex);
    }

    public static boolean checkYear(String years) {
        int year = Integer.parseInt(years.substring(6, 10));
        return year > 1900;
    }

    public static boolean checkEmail(String email) {
        regex = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
        return email.matches(regex);
    }

    public static boolean checkTypeCus(String typeCus) {
        regex = "^Diamond|Gold|Silver$";
        return typeCus.matches(regex);
    }

    public static boolean checkServiceName(Services services) {
        return services.getNameService().equals("Villa") || services.getNameService().equals("House") || services.getNameService().equals("Room");

    }


}
