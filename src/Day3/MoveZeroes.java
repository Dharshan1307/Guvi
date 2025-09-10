package Day3;

import java.util.*;
public class MoveZeroes {
  
	public static void main(String[]args) {
		int [] arr = {0,1,0,3,12};
		
		int values = 0;

    for(int num : arr)
    {
    	if(num!=0) {
    		arr[values++] = num;
    }
    }
    
    while (values < arr.length) {
    	arr[values++] = 0;
    }
    System.out.print("Output: ");
    for(int num : arr) {
    	System.out.print(num + " ");
    }
    }
}
