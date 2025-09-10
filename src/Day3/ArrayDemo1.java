package Day3;

import java.util.Arrays;

public class ArrayDemo1 {

    public static void main(String[] str) {
        int[] arr = {1, 4, 5, 7, 6};


        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        Arrays.sort(arr);
        System.out.println("After Sorting");

      
        for (int i : arr) {   //for each loop
            System.out.println(i);
        }
    }
}
