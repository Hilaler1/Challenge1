package Homework1;
import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
		getWord();
		

	}

	private static void getWord() {
		Scanner scanner = new Scanner(System.in);
		boolean n = true;
		while (n) {
			System.out.print("Please enter a word: ");
			String word = scanner.nextLine();
			isPalindrom(word);

			System.out.print("Do you wanna try again?(y/n): ");
			String answer = scanner.nextLine();

			if (answer.equalsIgnoreCase("y")) {
				continue;
			} else if (answer.equalsIgnoreCase("n")) {
				System.out.println("Byee..");
				n = false;
			} else {
				while (!(answer.equalsIgnoreCase("y")|| answer.equalsIgnoreCase("n")) ) {
					System.err.print("Please enter y/n : ");
					answer = scanner.nextLine();

				}
			}
		}
		scanner.close();
		
	}

	private static void isPalindrom(String word) {
		int count = 0;
		for (int i = 0; i < word.length() / 2; i++) {
			if (word.charAt(i) != word.charAt(word.length() - i - 1)) {
				count++;
			}
		}
		if (count == 0) {
			System.out.println("Palindrom!!");
		} else {
			System.out.println("Not Palindrom!");
		}

	}
}
