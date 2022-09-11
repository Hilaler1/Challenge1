package Homework1;
import java.util.Scanner;

public class Fractions {

	public static void main(String[] args) {
		input();

	}

	private static void input() {
		boolean cont = true;
		while (cont) {
			Scanner scanner = new Scanner(System.in);
			System.out.print("Please input operator( +, -, * , / ): press X to exit! ");
			String selection = scanner.next();
			if (selection.equalsIgnoreCase("x")) {
				System.out.println("Bye..");
				scanner.close();
				cont = false;
			}

			switch (selection) {
			case "+":
				System.out.print("how many fractions do you want to add?: ");
				int fractionNumber = scanner.nextInt();
				int numerator[] = new int[fractionNumber];
				int denominator[] = new int[fractionNumber];
				for (int i = 0; i < fractionNumber; i++) {
					System.out.print("Please enter the numerator of the " + (i + 1) + ". fraction: ");
					numerator[i] = scanner.nextInt();
					boolean b = true;
					while (b) {
						System.out.print("Please enter the denominator of the " + (i + 1) + ". fraction: ");
						denominator[i] = scanner.nextInt();
						if (denominator[i] == 0) {
							System.err.println("denominator can not be zero!");
						} else {
							b = false;
						}
					}
				}
				add(numerator, denominator);
				break;
			case "-":
				System.err.println("You can subtract only two fractions!");
				numerator = new int[2];
				denominator = new int[2];
				for (int i = 0; i < 2; i++) {
					System.out.print("Please enter the numerator of the " + (i + 1) + ". fraction: ");
					numerator[i] = scanner.nextInt();
					boolean b = true;
					while (b) {
						System.out.print("Please enter the denominator of the " + (i + 1) + ". fraction: ");
						denominator[i] = scanner.nextInt();
						if (denominator[i] == 0) {
							System.err.println("denominator can not be zero!");
						} else {
							b = false;
						}
					}

				}
				substract(numerator, denominator);
				break;
			case "*":
				System.out.print("how many fractions do you want to multiply?: ");
				fractionNumber = scanner.nextInt();
				numerator = new int[fractionNumber];
				denominator = new int[fractionNumber];
				for (int i = 0; i < fractionNumber; i++) {
					System.out.print("Please enter the numerator of the " + (i + 1) + ". fraction: ");
					numerator[i] = scanner.nextInt();
					boolean b = true;
					while (b) {
						System.out.print("Please enter the denominator of the " + (i + 1) + ". fraction: ");
						denominator[i] = scanner.nextInt();
						if (denominator[i] == 0) {
							System.err.println("denominator can not be zero!");
						} else {
							b = false;
						}
					}
				}
				multiply(numerator, denominator);
				break;
			case "/":
				System.err.println("You can divide only two fractions!");
				numerator = new int[2];
				denominator = new int[2];
				for (int i = 0; i < 2; i++) {
					System.out.print("Please enter the numerator of the " + (i + 1) + ". fraction: ");
					numerator[i] = scanner.nextInt();
					boolean b = true;
					while (b) {
						System.out.print("Please enter the denominator of the " + (i + 1) + ". fraction: ");
						denominator[i] = scanner.nextInt();
						if (denominator[i] == 0) {
							System.err.println("denominator can not be zero!");
						} else {
							b = false;
						}
					}
				}
				divide(numerator, denominator);
				break;
			default:
				if (selection.equalsIgnoreCase("x")) {
					break;
				}
				System.err.println("please enter valid operator!");
				break;
			}

		}
	}

	private static void divide(int[] numerator, int[] denominator) {
		int a;
		a = numerator[1];
		numerator[1] = denominator[1];
		denominator[1] = a;
		multiply(numerator, denominator);
	}

	private static void multiply(int[] numerator, int[] denominator) {
		int resultNumerator = 1;
		int resultDenominator = 1;
		for (int i = 0; i < numerator.length; i++) {
			resultNumerator = resultNumerator * numerator[i];
			resultDenominator = resultDenominator * denominator[i];
		}
		simplification(resultNumerator, resultDenominator);
	}

	private static void substract(int[] numerator, int[] denominator) {
		int resultDenominator;
		resultDenominator = lcm(denominator);
		int resultNumerator = 0;
		resultNumerator = numerator[0] * (resultDenominator / denominator[0])
				- numerator[1] * (resultDenominator / denominator[1]);
		simplification(resultNumerator, resultDenominator);
	}

	private static void add(int[] numerator, int[] denominator) {
		int resultDenominator;
		resultDenominator = lcm(denominator);
		int resultNumerator = 0;
		for (int i = 0; i < numerator.length; i++) {
			resultNumerator = numerator[i] * (resultDenominator / denominator[i]) + resultNumerator;
		}

		simplification(resultNumerator, resultDenominator);
	}

	private static int lcm(int[] denominator) {
		int a = 1;
		for (int number : denominator) {
			a = a * number;
		}
		int lcm = a;

		for (int i = 1; i <= a; i++) {
			boolean b = true;
			for (int number : denominator) {
				if (i % number != 0)
					b = false;
			}
			if (b) {
				lcm = i;
				break;
			}
		}
		return lcm;

	}

	private static int gcd(int resultNumerator, int resultDenominator) {
		int gcd, a;
		gcd = 1;
		a = resultDenominator;
		if (resultNumerator > resultDenominator) {
			a = resultNumerator;
		}
		for (int i = 1; i <= a; i++) {
			if (resultDenominator % i == 0 && resultNumerator % i == 0) {
				gcd = i;
			}
		}

		return gcd;
	}

	private static void simplification(int resultNumerator, int resultDenominator) {

		int gcd, resultNum, resultDen;
		gcd = gcd(resultDenominator, resultNumerator);
		resultNum = resultNumerator / gcd;
		resultDen = resultDenominator / gcd;
		System.out.println("result = " + resultNum + " / " + resultDen);

	}
}
