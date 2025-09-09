package AEC;

import java.util.Scanner;

public class MovieTicket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        int  ticketPrice;

        if (age < 12) {
            ticketPrice = 100;
        } else if (age >= 12 && age < 60) {
            ticketPrice = 200;
        } else {
            ticketPrice = 150;
        }

        System.out.println("Your Ticket Price is: Rs " + ticketPrice);


    }
}
