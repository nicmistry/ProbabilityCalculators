package ProbabilityCalculators;
import java.util.Scanner;

public class CombinationCalculator {
	public static void main(String[] args) {
		int n, r;
		int nFact, nmrFact, rFact;
		double nPr;
		Scanner key = new Scanner(System.in);
		System.out.println("Combination of n items taken r at a time when order does not matter, C(n,r), or nCr");
		System.out.print("n = ");
		n = key.nextInt();
		System.out.print("r = ");
		r = key.nextInt();
		
		nFact = factorial(n);
		rFact = factorial(r);
		nmrFact = factorial(n - r);
		nPr = nFact / (nmrFact * rFact);
		System.out.printf("nCr = %1.0f combinations", nPr);
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
