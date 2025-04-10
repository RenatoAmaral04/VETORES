package VET;

import java.util.Scanner;

public class VET4 {

	public static void main(String[] args) {
		
		Scanner ff = new Scanner(System.in);
		System.out.println("QUANTOS NUMEROS VOCÊ VAI DIGITAR");

		int n = ff.nextInt();
		int [] vect = new int[n];
		int maior = 0;
		int posicao = 0;
		int maior1 = 0;
		
		
		
		for (int i = 0; i <n; i++) {

			// pode usar o ----vect.lenght------------ ele se baseia no vetor
			ff.nextLine();
			System.out.println("DIGITE UM NUMERO");
			vect[i] = ff.nextInt();
		}
		
		for (int i =0; i<n; i++) {
			maior = vect[i];
	
			if(maior > maior1) {
				
				maior1 = maior;
				posicao = i;
				
			}
			}
			
			System.out.println(maior1 +  " É O MAIOR " + posicao + " É A POSICÇAO");
		}

	}





