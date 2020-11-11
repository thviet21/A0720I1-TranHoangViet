package sourcedemo._13_Map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MyTreeMap {
    public static void main(String[] args) {
        Map<_13_Map.Student, String> myMap = new TreeMap<>();
        myMap.put(new _13_Map.Student(3, "Nguyen Van C"), "Top 3");
        myMap.put(new _13_Map.Student(1, "Nguyen Van A"), "Top 1");
        myMap.put(new _13_Map.Student(2, "Nguyen Van B"), "Top 2");
        myMap.put(new _13_Map.Student(4, "Nguyen Van A"), "Top 4");
        //myMap.put(null,"Top 5");

        for (_13_Map.Student student : myMap.keySet()) {
            System.out.println(student + " Value: "+myMap.get(student));
        }
    }
}
