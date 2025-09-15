package Day5;

public class LowerBound {
	 public static int lowerBound(int[] num, int key) {
	        int left = 0;
	        int right = num.length;  
	        while (left < right) {
	            int mid = left + (right - left) / 2;

	            if (num[mid] < key) {
	               
	                left = mid + 1;
	            } else {
	                
	                right = mid;
	            }
	        }
	        return left; 
	    }

	    public static void main(String[] args) {
	        int[] arr = {2, 4, 10, 10, 10, 12, 20};

	        int idx1 = lowerBound(arr, 10);
	        int idx2 = lowerBound(arr, 11);
	        int idx3 = lowerBound(arr, 21);

	        System.out.println("lowerBound(10) -> " + idx1);
	        System.out.println("lowerBound(11) -> " + idx2);
	        System.out.println("lowerBound(21) -> " + idx3);
	    }
}
