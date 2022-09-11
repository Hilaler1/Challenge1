package Homework1;
import java.util.Scanner;

public class EthiopiaMultiply {

	static Scanner scanner = new Scanner(System.in);
	static boolean process;

	public static void main(String[] args) {

		EthiopiaMultiplication();

	}

	private static void EthiopiaMultiplication() {

		do {
			int result = 0;
			System.out.print("Please enter first number: ");
			int num1 = scanner.nextInt();
			System.out.print("Please enter second number: ");
			int num2 = scanner.nextInt();
			scanner.nextLine();

			permutation(num1, num2);
			System.out.println(num1 + "   " + num2);

			while (num1 != 1) {

				if (num1 % 2 == 1) {
					result = result + num2;
				}
				num1 = num1 / 2;
				num2 = num2 * 2;
				System.out.println(num1 + "   " + num2);
			}
			System.out.println("multiplication: " + (result + num2));
			boolean b = true;
			while (b) {
				System.out.println("Do you wanna try again?(y/n)");
				String selection = scanner.nextLine();

				if (selection.equalsIgnoreCase("n")) {
					System.out.println("Bye..");
					process = false;
					b = false;
				} else if (selection.equalsIgnoreCase("y")) {
					process = true;
					b = false;
				} else {
					System.err.println("Please enter a valid letter!");
				}
			}
		} while (process);
	}

	private static void permutation(int num1, int num2) {
		int temp;
		if (num1 < num2) {
			temp = num1;
			num1 = num2;
			num2 = temp;
		}

	}

}
