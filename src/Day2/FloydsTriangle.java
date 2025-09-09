package Day2;
import java.util.Scanner;

public class FloydsTriangle {
    public static void main(String[] strs) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int num = 1; 

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num +"");
                num++; 
            }
            System.out.println();
        }
    }
}
