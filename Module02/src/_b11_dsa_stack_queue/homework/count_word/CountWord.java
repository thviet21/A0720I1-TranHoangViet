package _b11_dsa_stack_queue.homework.count_word;

import java.util.Map;
import java.util.TreeMap;

public class CountWord {
    public static void main(String[] args) {
        Map<String,Integer> treeMap = new TreeMap<>();
        String str = "Việt Nam đẹp nhất có tên bác Hồ bác hồ tên Hồ Chí Minh";
        String[] array = str.toLowerCase().split(" ");
        for (String element: array) {
            if (treeMap.containsKey(element)){
                treeMap.put(element, treeMap.get(element)+1);
            }else {
                treeMap.put(element,1);
            }

        }

        for (String element : treeMap.keySet()) {
            System.out.println(element + " Value: " + treeMap.get(element));
        }
    }
}
