package AEC;

import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      
        System.out.print("Enter Original Price: ");
        double originalPrice = sc.nextDouble();

        double discountPercent = 0;  

       
        if (originalPrice >= 5000) {
            discountPercent = 20;
        } else if (originalPrice >= 2000) {
            discountPercent = 10;
        } else {
            discountPercent = 0;
        }

     
        double discountAmount = (originalPrice * discountPercent) / 100;

     
        double finalPrice = originalPrice - discountAmount;

  
        System.out.println("Original Price: " + originalPrice);
        System.out.println("Discount Percentage: " + discountPercent + "%");
        System.out.println("Discount Amount: " + discountAmount);
        System.out.println("Final Price After Discount: " + finalPrice);

    }
}
