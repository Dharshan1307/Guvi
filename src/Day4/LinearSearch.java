package Day4;

public class LinearSearch {

    
    public static int lin_search(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;             
            }
        }
        return -1;                      
    }															

    public static void main(String[] args) {
        int[] number = {2, 6, 8, 12, 15, 20};
        int key = 15;

        int pos = lin_search(number, key);

        if (pos == -1) {
            System.out.println("Element not found");
        } else {
            
            System.out.println("Element " + key + " found at index " + pos);
        }
    }
}
