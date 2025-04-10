package VET;

import java.util.Scanner;

public class VET8 {

	public static void main(String[] args) {

		Scanner ff = new Scanner(System.in);

		System.out.println("Quantas pessoas você vai digitar?");
		int n = ff.nextInt();
		int velho = 0;
		int idoso = 0;
		int pos = 0;
		String nomevelho = null;
		
		String nome[] = new String[n];
		int idade[] = new int[n];

		for (int i = 0; i < n; i++) {

			ff.nextLine();
			System.out.println("DIGITE UM nome");
			nome[i] = ff.nextLine();
			System.out.println("DIGITE A IDADE");
			idade[i] = ff.nextInt();

		}
		for (int i = 0; i < n; i++) {

			velho = idade[i];
			if (velho > idoso) {

				idoso = velho;
				pos = i;

			}

		}
		for (int i = 0; i<n; i++) {
			
			if (i == pos) {
		
				nomevelho = nome[i];
				System.out.println(nomevelho);
			}
		}

	}

}
