package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos números você vai digitar? ");
		int N = sc.nextInt();
		int[] vect = new int[N];

		for (int i = 0; i < N; i++) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextInt();
		}

		System.out.print("NÚMEROS NEGATIVOS: ");
		for (int i = 0; i < N; i++) {
			if (vect[i] < 0) {
				System.out.print(vect[i] + " ");
			}
		}

		sc.close();
	}
}