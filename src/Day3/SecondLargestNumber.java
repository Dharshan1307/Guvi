package Day3;

public class SecondLargestNumber {
    public static void main(String[] args) {

        int[] numbers = {10, 20, 4, 45, 99};

        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > firstLargest)
            {
              secondLargest = firstLargest;
              firstLargest = numbers[i];
            } 
            
            else if (numbers[i] > secondLargest && numbers[i] != firstLargest) {
              secondLargest = numbers[i];
            }
        }
        System.out.println("Second largest number is: " + secondLargest);
    }
}
