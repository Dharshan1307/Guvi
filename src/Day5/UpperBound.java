package Day5;

public class UpperBound {

    public static int upperBound(int[] num, int key) {
        int left = 0;
        int right = num.length;  
        while (left < right) {
            int mid = left + (right - left) / 2;

            if (num[mid] <= key) {
        
                left = mid + 1;
            } else {
                
                right = mid;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 10, 10, 10, 12, 20};

        System.out.println("upperBound(10) -> " + upperBound(arr, 10));
        System.out.println("upperBound(12) -> " + upperBound(arr, 12));
        System.out.println("upperBound(4) -> " + upperBound(arr, 20));
    }
}
