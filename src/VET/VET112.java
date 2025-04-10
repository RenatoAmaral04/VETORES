package VET;

import java.util.Scanner;

public class VET112 {

	public static void main(String[] args) {

		Scanner ff = new Scanner(System.in);
		VET111[] quarto = new VET111[10];

		System.out.println("Quantos estudantes vão frequentar os quartos?");
		int n = ff.nextInt();

		for (int i = 0; i < n; i++) {

			ff.nextLine();
			System.out.println("DIGITE O NOME DO ESTUDANTE");
			String nome = ff.nextLine();
			System.out.println("DIGITE O NOME DO ESTUDANTE");
			String gmail = ff.nextLine();
			System.out.println("DIGITE O QUARTO QUE VAI FICAR ");
			int quarto1 = ff.nextInt();
			quarto[quarto1] = new VET111(nome, gmail); // está puxando do construtor

			// o vetor quarto está recebendo a variável quarto1 e guardando no vetor

		}
		
		System.out.println("QUARTOS escolhidos: ");
		for(int i =0; i<10; i++) {
			
			if(quarto[i] != null) {
				
				System.out.println(i + ": " + quarto[i].getNome() + ",  " + quarto[i].getGmail());
			}
		}
		
		ff.close();

	}

}
