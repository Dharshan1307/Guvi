package Day2;

import java.util.Scanner;

public class DimondPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int size = sc.nextInt();
   
        if (size % 2 == 0) {
            size++;
        }

        int odd = 1, nos = size / 2;

        for (int i = 1; i <= size; i++) {
           
            for (int k = nos; k >= 1; k--) {
                System.out.print(" ");
            }
          
            for (int j = 1; j <= odd; j++) {
                System.out.print("*");
            }
            System.out.println();
      
            if (i < size / 2 + 1) {
                odd += 2;
                nos -= 1;
            } else {
                odd -= 2;
                nos += 1;
            }
        }
    }
}
