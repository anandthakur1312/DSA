package old.interviewprograms;

import java.util.Scanner;

public class NumberSwap {
	
	public static void main(String[] args) {
		Scanner out = new Scanner(System.in);
		int x, y, temp = 0;
		System.out.println("Enter x: ");
		x = out.nextInt();
		System.out.println("Enter y: ");
		y = out.nextInt();
		x = x+y;
        y=x-y;
        x=x-y;
		System.out.println("After Swapping x = " + x + "and y =" + y);
		
	}

}
