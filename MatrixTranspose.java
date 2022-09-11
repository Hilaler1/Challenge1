package Homework1;

import java.util.Random;
import java.util.Scanner;

public class MatrixTranspose {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		Random random = new Random();
		int r = GetMatrixRow();
		int c = GetMatrixColumn();

		int[][] matrix = new int[r][c];
		for (int i = 0; i < r; i++) {
			for (int j = 0; j < c; j++) {
				int ran = random.nextInt(9);
				matrix[i][j] = ran;

			}
		}
		System.out.println("-----> matrix: ");
		for (int i = 0; i < r; i++) {
			System.out.println();
			for (int j = 0; j < c; j++) {
				System.out.print(matrix[i][j] + " ");
			}
		}
		System.out.println("");
		System.out.println("-----> transpose matrix: ");
		for (int i = 0; i < c; i++) {
			System.out.println(" ");
			for (int j = 0; j < r; j++) {
				System.out.print(matrix[j][i] + " ");
			}
		}

	}

	private static int GetMatrixRow() {
		System.out.println("please enter how many row you want?");
		int row = scanner.nextInt();
		return row;
	}

	private static int GetMatrixColumn() {
		System.out.println("please enter how many column you want?");
		int column = scanner.nextInt();
		return column;
	}

}
