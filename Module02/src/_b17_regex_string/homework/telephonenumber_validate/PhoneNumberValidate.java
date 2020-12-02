package _b17_regex_string.homework.telephonenumber_validate;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberValidate {
    public static final String REGEX_TELEPHONE = "^\\(\\d{2}\\)\\-\\(0[\\d]{9}\\)$";

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile(REGEX_TELEPHONE);
        Matcher  matcher = null;
        String[] strings = {"(84)-(0978489648)","(a8)-(22222222)"};
        for (String s :
                strings) {
            System.out.println( pattern.matcher(s).matches());
        }
    }
}
