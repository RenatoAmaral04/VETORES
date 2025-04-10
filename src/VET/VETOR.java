package VET;

import java.util.Scanner;

public class VETOR {
	public static void main(String[] args) {

		Scanner ff = new Scanner(System.in);

		int n = ff.nextInt();

		double[] vect = new double[n];

		for (int i = 0; i < n; i++) {

			vect[i] = ff.nextDouble();

		}

		double soma = 0;
		for (int i = 0; i < n; i++) {

			soma += vect[i];
		}
		double media = soma / n;
		System.out.println(media);
	}

}
