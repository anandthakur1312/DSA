package old.interviewprograms;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		
		System.out.println("Enter any Number");
		Scanner out = new Scanner(System.in);
		 int num = out.nextInt();
		 int i,fact = 1;
		 
	 for(i = num; i>0; i--){
		
		 fact = fact*i;
	}
	System.out.println(fact);
	}
}
