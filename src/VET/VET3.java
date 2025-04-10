package VET;

import java.util.Scanner;

public class VET3 {

	public static void main(String[] args) {

		Scanner ff = new Scanner(System.in);
		System.out.println("QUANTOS PESSOAS VOCÊ VAI DIGITAR");

		int n = ff.nextInt();
		String[] nome = new String[n];
		int[] idade = new int[n];
		double[] altura = new double[n];
		double menores = 0;
		double media = 0;

		for (int i = 0; i < n; i++) {

			// pode usar o ----vect.lenght------------ ele se baseia no vetor
			ff.nextLine();
			System.out.println("DIGITE UM nome");
			nome[i] = ff.nextLine();
			System.out.println("DIGITE A IDADE");
			idade[i] = ff.nextInt();
			System.out.println("DIGITE A ALTURA");
			altura[i] = ff.nextDouble();
		}
		for (int i = 0; i < n; i++)
			if (idade[i] < 16) {
				menores++;
			}

		double a = menores * 100 / n;
		System.out.println("MENORES: " + a + "%");

		for (int i = 0; i < n; i++) {
			media += altura[i];
		}

		double b = media / n;
		System.out.println("MEDIA: " + b);

		for (int i = 0; i < n; i++) {
			if (idade[i] < 16) {
				System.out.println(nome[i]);
			}
		}

	}

}
