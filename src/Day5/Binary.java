package Day5;

public class Binary {

    
    public static int firstOccurrence(int[] num, int key) {
        int left = 0, right = num.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (num[mid] == key) {
                result = mid;      
                right = mid - 1;   
            } else if (num[mid] < key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }

    // Last occurrence
    public static int lastOccurrence(int[] num, int key) {
        int left = 0, right = num.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (num[mid] == key) {
                result = mid;     
                left = mid + 1;    
            } else if (num[mid] < key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 10, 10, 10, 12, 20};
        int key = 10;

        int first = firstOccurrence(arr, key);
        int last  = lastOccurrence(arr, key);

        if (first != -1) {
            System.out.println("First occurrence index: " + first);
            System.out.println("Last  occurrence index: " + last);
        } else {
            System.out.println("Element not found");
        }
    }
}
