package ProbabilityCalculators;
import java.util.Scanner;

public class PermutationCalculator {
	public static void main(String[] args) {
		int n, r;
		int nFact, nmrFact;
		double nPr;
		Scanner key = new Scanner(System.in);
		System.out.println("Permutation of n items taken r at a time when order matters, P(n,r), or nPr");
		System.out.print("n = ");
		n = key.nextInt();
		System.out.print("r = ");
		r = key.nextInt();
		
		nFact = factorial(n);
		nmrFact = factorial(n - r);
		nPr = nFact / nmrFact;
		System.out.printf("nPr = %1.0f combinations", nPr);
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
