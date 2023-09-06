

import java.util.Scanner;

// A program that calculates the factorial of a given number//
public class Fractorial_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner raj = new Scanner(System.in);
		System.out.println("Enter a number");
		int num1 = raj.nextInt();
		int factorial = 1;
		for(int i=1; i<= num1; i++)
		{
			factorial *=i;
		}
				System.out.println("Factorial number is given as = "+factorial);
	}

}
