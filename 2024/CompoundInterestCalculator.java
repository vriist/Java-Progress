import java.util.*;
public class App {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter the principal amount: ");
		double principalAmount = scan.nextDouble();

		System.out.print("Enter the interest rate (in %): ");
		double rateNum = scan.nextDouble();

		double interestRate = rateNum / 100;

		System.out.print("Enter the # of times compound per year: ");
		int compoundPerYear = scan.nextInt();

		System.out.print("Enter the # of years: ");
		int years = scan.nextInt();

		System.out.println("The amount after " + years + " years is " + "$" + compoundInterest(principalAmount, interestRate, compoundPerYear, years));
	}

	public static double compoundInterest(double principalAmount, double interestRate, int compoundPerYear, int years) {
		double result = (Math.pow(principalAmount * (1 + interestRate / compoundPerYear ), (compoundPerYear * years)));

		return result;
	}

}
