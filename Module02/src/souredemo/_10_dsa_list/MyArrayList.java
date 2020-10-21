package souredemo._10_dsa_list;

import java.util.ArrayList;
import java.util.List;

public class MyArrayList {
    public static void main(String[] args) {
        List myArray = new ArrayList();
        int a = 4;
        myArray.add(a);
        myArray.add(5);
        myArray.add(6);
        myArray.add(2,9);

//        for (Object o:myArray){
//            System.out.println(o.toString());
//        }
        for(int i=0; i<myArray.size();i++){
            System.out.println(myArray.get(i));
        }
        //myArray.remove(1);
        System.out.println(myArray.contains(5));


//        System.out.println(myArray.get(0));
//        System.out.println(myArray.get(1));
//        System.out.println(myArray.get(2));
    }
}
