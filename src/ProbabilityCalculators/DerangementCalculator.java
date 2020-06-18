package ProbabilityCalculators;
import java.util.Scanner;
import java.lang.Math;

public class DerangementCalculator {
	public static void main(String [] args) {
		Scanner key = new Scanner(System.in);
		int n, nFact, iFact; 
		double iFactInv, sum = 0, derangement;
		System.out.println("Derangement of n items, D(n) or !n, is a permutation of the elements of a set, "
				+ "such that no element appears in its original position.");
		System.out.print("n = ");
		n = key.nextInt();
		nFact = factorial(n);
		for(int i = 0; i <= n; i++) {
			double neg = Math.pow(-1, i);
			iFact = factorial(i);
			iFactInv = 1.0/iFact;
			iFactInv *= neg;
			sum = sum + iFactInv;
		}
		derangement = sum * nFact;
		derangement = (int) derangement;
		System.out.printf("!n = %1.0f combinations", derangement);
	}
	
	public static int factorial(int num) {
		if(num == 0) {
			return 1;
		}
		int factorial = num;
		for(int i = num - 1; i > 0; i--) {
			factorial *= i;
		}
		return factorial;
	}
}
