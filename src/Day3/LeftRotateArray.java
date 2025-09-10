package Day3;

import java.util.Arrays;

public class LeftRotateArray {

    public static void rotate(int[] arr, int k) {
        int temp;
        for (int i = 0; i < k; i++) {
            temp = arr[0];
            for (int j = 0; j < arr.length - 1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[arr.length - 1] = temp;
        }
    } 

    public static void main(String[] args) {
        int[] values = {1, 2, 3, 4, 5};
        int k = 2;

        System.out.println("Before rotation: " + Arrays.toString(values));
        rotate(values, k);
        System.out.println("After rotation: " + Arrays.toString(values));
    }
}
