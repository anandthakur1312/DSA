package old.interviewprograms;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {

		System.out.println("Enter any Number");
		Scanner out = new Scanner(System.in);
		int num = out.nextInt();
		int sum = 0, one = 0, two = 1;

		for(int i = 0; i<=num; i++){

			sum = sum + one;
			System.out.println(sum);
			one = two;
			two = sum;


		}

	}
}
