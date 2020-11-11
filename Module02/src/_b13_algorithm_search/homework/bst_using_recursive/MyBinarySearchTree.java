package _b13_algorithm_search.homework.bst_using_recursive;

public class MyBinarySearchTree {
    public static void main(String[] args) {
        int[] arrays = {2,3,5,7,9,10,11,23,56,78,99,123};
        binarySearchTree(arrays,6);
    }
    public static void binarySearchTree(int[] array,int value){
        int head = 0;
        int tail = array.length - 1;

        while (head <= tail) {
            int mid = (head + tail) / 2;
            if(value == array[mid]){
                System.out.print("Have element in array with value is: "+ array[mid]+ ", and index is: "+ mid);

                return;
            } else if (value > array[mid]){
                head = mid + 1;
            } else {
                tail = mid - 1;
            }
        }
        binarySearchTree(array,value);
    }
}
