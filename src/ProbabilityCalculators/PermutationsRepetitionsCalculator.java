package ProbabilityCalculators;

import java.util.Scanner;

public class PermutationsRepetitionsCalculator {
	public static void main(String[] args) {
		int n, k, nFact;
		double perm;
		Scanner key = new Scanner(System.in);
		System.out.println("Permutation of n items with k repeated items, Pk");
		System.out.print("n = ");
		n = key.nextInt();
		System.out.print("k = ");
		nFact = factorial(n);
		k = key.nextInt();
		double denom = 1;
		for(int i = 0; i < k; i++) {
			System.out.print("How many repetitions are there of item " + (i + 1) + ": ");
			int num = key.nextInt();
			num = factorial(num);
			denom = denom * num;
		}
		perm = nFact/denom;
		System.out.printf("Pk = %2.0f combinations", perm);
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
