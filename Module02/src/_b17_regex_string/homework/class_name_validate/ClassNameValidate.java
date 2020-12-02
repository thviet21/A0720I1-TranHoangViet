package _b17_regex_string.homework.class_name_validate;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassNameValidate {
    public static final String REGEX_CLASSNAME = "^[C|A|P][0-9]{4}[G|H|I|K|L|M]";

    public static void main(String[] args) {
        String[] name  = {"C0318G", "M0318G", "P0323A"};

        Pattern pattern = Pattern.compile(REGEX_CLASSNAME);
        Matcher matcher;
        for (String s:name ) {
            matcher = pattern.matcher(s);
            System.out.println(matcher.matches());
        }

    }

}
