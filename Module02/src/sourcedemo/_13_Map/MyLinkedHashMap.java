package _13_Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MyLinkedHashMap {
    public static void main(String[] args) {
        Map<Student, String> myMap = new LinkedHashMap<>();
        myMap.put(null, "Top 888");
        myMap.put(new Student(1, "Nguyen Van A"), "Top 1");
        myMap.put(new Student(2, "Nguyen Van B"), "Top 2");
        myMap.put(new Student(3, "Nguyen Van C"), "Top 3");
        myMap.put(new Student(4, "Nguyen Van A"), "Top 4");
        myMap.put(null, "Top 999");

        //load factor

        for (Student student : myMap.keySet()) {
            System.out.println(student + " Value: "+myMap.get(student));
        }
    }
}
