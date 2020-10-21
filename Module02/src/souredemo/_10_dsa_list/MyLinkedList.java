package souredemo._10_dsa_list;

import java.util.LinkedList;
import java.util.List;

public class MyLinkedList {
    public static void main(String[] args) {
        List myList = new LinkedList();
        myList.add(1);
        myList.add(2);
        myList.add(3);

        System.out.println(myList.get(2));
        for(int i=0; i<myList.size(); i++){
            System.out.println(myList.get(i));
        }
    }
}
