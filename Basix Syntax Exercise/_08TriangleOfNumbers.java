package _01BasicSyntax_Exercise;

import java.util.Scanner;

public class _08TriangleOfNumbers {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = Integer.parseInt(scanner.nextLine());
		boolean isValid = n >= 1 && n <= 20;

		if(isValid) {
			int counter = 0;

			for (int i = 1; i <= n; i++) {
				counter++;
				for (int j = 1; j <= i; j++) {
					System.out.print(counter + " ");
				}
				System.out.println();
			}
		}
	}
}