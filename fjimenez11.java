//Fernando Jimenez
//Lab 11
//CSC 321

import java.util.Scanner;

public class fjimenez11{
	public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

	System.out.println("Enter a number: ");
	int num = scnr.nextInt();

	int numSquared = num * num;
	System.out.println("Your number (" + num + ") squared is: " + numSquared + ". Slow and steady wins the race." );
	}
}

