package ProbabilityCalculators;
import java.util.Scanner;

public class FactorialFinder {
	public static void main(String[] args) {
		int num;
		int factorial;
		String input;
		boolean again = true;
		Scanner key = new Scanner(System.in);
		while(again) {
			System.out.println("X Factorial (X!)");
			System.out.print("X = ");
			num = key.nextInt();
			factorial = num;
			for(int i = num - 1; i > 0; i--) {
				factorial *= i;
			}
			System.out.println("X! = " + factorial);
			System.out.println("Calculate another? (y or n)");
			input = key.next();
			if(input.equalsIgnoreCase("y") || input.equalsIgnoreCase("yes"));
			if(input.equalsIgnoreCase("n") || input.equalsIgnoreCase("no"))
				again = false;
		}
		System.out.println("Goodbye!");
	}
}
