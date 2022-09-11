package Homework1;

import java.util.Scanner;

public class Eratosthenes {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		isPrime();

	}

	public static void isPrime() {
		int number = getNumber();
		int[] array = new int[number + 1];
		for (int i = 1; i <= number; i++) {
			array[i] = i;
			System.out.print(array[i] + " ");
		}
		System.out.println();
		array[1] = 0;
		System.out.print("1.index--->  "); // 1 asal olmadığı için 1'i en başta sıfıra dönüştürüyorum.
		for (int i = 1; i <= number; i++) {
			System.out.print(array[i] + " ");
		}

		for (int i = 2; i <= number; i++) {
			System.out.println();
			System.out.print(i + ".index--->  ");
			for (int j = 1; j <= number; j++) {

				if (array[j] % i == 0 && j > i) { // asal olmayan sayıları 0' a dönüştürüyorum.
					array[j] = 0;
				}
				System.out.print(array[j] + " ");
			}
		}

	}

	public static int getNumber() {
		System.out.print("Please enter a number: ");
		int number = scanner.nextInt();
		while (number <= 0) {
			System.err.println("Please enter a valid number! :");
			number = scanner.nextInt();
		}
		return number;
	}
}
