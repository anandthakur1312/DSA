package old.interviewprograms;

import java.util.Scanner;

public class FactorialRecursive {
	
	private static int factorial(int num) {
		if (num == 0){
			return 1;
		}
		else 
			return 
					num*(factorial(num-1));
	}
	
public static void main(String[] args) {
System.out.println("Enter any no: ");
Scanner out = new Scanner(System.in);
int num = out.nextInt();

int fact = factorial(num);
System.out.println("The Factorial is : "+ fact);

}



}
