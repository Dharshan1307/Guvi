package AEC;

import java.util.Scanner;

public class Electricity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter number of units consumed: ");
        int units = sc.nextInt();

        double billAmount = 0;

        if (units <= 100) {
            billAmount = units * 1.5;
        } else if (units <= 300) {
            billAmount = (100 * 1.5) + (units - 100) * 2.0;
        } else {
            billAmount = (100 * 1.5) + (200 * 2.0) + (units - 300) * 3.0;
        }

    
        System.out.println("Total Units: " + units);
        System.out.println("Electricity Bill Amount: $" + billAmount);

        
    }
}
