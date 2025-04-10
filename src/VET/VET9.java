package VET;

import java.util.Scanner;

public class VET9 {

	public static void main(String[] args) {

		Scanner ff = new Scanner(System.in);

		System.out.println("Quantas pessoas serão digitadas");
		int n = ff.nextInt();
		String nome[] = new String[n];
		double nota[] = new double[n];
		double nota1[] = new double[n];
		double media = 0;
		String aprov = null;

		for (int i = 0; i < n; i++) {

			ff.nextLine();
			System.out.println("DIGITE UM nome");
			nome[i] = ff.nextLine();
			System.out.println("DIGITE A nota 1");
			nota[i] = ff.nextDouble();
			System.out.println("DIGITE A nota 2");
			nota1[i] = ff.nextDouble();

		}

		for (int i = 0; i < n; i++) {

			media = (nota1[i] + nota[i]) / 2;

			if (media >= 6) {
				aprov = nome[i];
				System.out.println(aprov);

			}
		}

	}
}
