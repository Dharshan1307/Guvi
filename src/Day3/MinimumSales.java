package Day3;

public class MinimumSales {
	 public static void main(String[] str) {
	        int[] sales = {120, 340, 560, 230, 999};
	        int min_sale = Integer.MAX_VALUE;

	        for (int i = 0; i < sales.length; i++) {
	            if (sales[i] < min_sale) {
	                min_sale = sales[i];
	            }
	        }

	        System.out.println("Min Sale : " + min_sale);
	    }
}
  