package Homework1;
import java.util.Scanner;

public class Backtracking {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String word;
		System.out.print("Please enter a word: ");
		word = scanner.nextLine();
		String[] array = new String[word.length()];
		for (int i = 0; i < array.length; i++) {
			array[i] = word.substring(i, i + 1);
		}
		System.out.print("The reverse word: ");
		for (int i = array.length - 1; i >= 0; i--) {
			System.out.print(array[i]);
		}
             
		scanner.close();

	}

}
