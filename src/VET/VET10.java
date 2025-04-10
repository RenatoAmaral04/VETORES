package VET;

import java.util.Scanner;

public class VET10 {

	public static void main(String[] args) {

		Scanner ff = new Scanner(System.in);

		System.out.println("Quantas pessoas serão digitadas");
		int n = ff.nextInt();
		char nome[] = new char[n];
		double altura[] = new double[n];
		double media = 0;
		double media1 = 0;
		double media2 = 0;
		int homi = 0;
		double alt = 0;
		double alt1 = 0;
		double alt2;
		double alt3;
		double pos = 0;
		double pos1 = 0;
		double pos2 = 0;
		double pos3 = 0;
		for (int i = 0; i < n; i++) {

			ff.nextLine();
			System.out.println("DIGITE A ALTURA DA PESSOA " + i);
			altura[i] = ff.nextDouble();
			System.out.println("QUAL SEU GÊNERO DA PESSOA " + i);
			ff.nextLine();
			nome[i] = ff.nextLine().charAt(0);

		}

		alt2 = altura[0]; //esta referenciando a posições do vetor, nesse caso recebe o vetor iniciando do zero
		alt = altura[0]; // mesma coisa de cima

		for (int i = 0; i < n; i++) {

			if (nome[i] == 'M' || nome[i] == 'm') {
				//faz a verificação do primeiro caracter
				homi++;

			} else {

				media1 += altura[i];
				media++;
			}

			media2 = media1 / media;
		}

		//esse for esta verificando posição por posição de acordo com a variável la em cima, como alt1 está iniciando na posição 0
		
		for (int i = 0; i < n; i++) {

			if (altura[i] > alt1) {

				alt1 = altura[i];
			}
			if (altura[i] < alt2) {

				alt2 = altura[i];
			}
		}

		System.out.println("Maior altura é: " + alt1);
		System.out.println("menor altura é: " + alt2);
		System.out.printf("MEDIA ALTURA DAS MULHERES %.2f%n", media2);
		System.out.println("NUMERO DE HOMENS " + homi);

	}

}
