package Day4;

public class BinarySearch {

    public static int bin_value(int[] num, int key1) {
        int n = num.length;
        int left = 0;
        int right = n - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (num[mid] == key1) {        
                return mid;
            } else if (num[mid] < key1) {   
                left = mid + 1;
            } else {                      
                right = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10, 12};
        int key = 10;

        int index = bin_value(arr, key);

        if (index != -1)
            System.out.println("Element found at index: " + index);
        else
            System.out.println("Element not found");
    }
	
}
