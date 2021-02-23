package commons.validate;

public class Validate {
    static String regex;
    public static boolean checkNameCustomer(String str) {
        regex = "^/w{45}$";
        return str.matches(regex);
    }
    public static boolean checkPhoneNumber(String str) {
        regex = "^0[0-9]{9}$";
        return str.matches(regex);
    }
    public static boolean checkDescription(String str) {
        regex = "^/w{200}$";
        return str.matches(regex);
    }
}
