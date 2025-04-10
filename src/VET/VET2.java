package VET;

import java.util.Scanner;

public class VET2 {

	public static void main(String[] args) {

		Scanner ff = new Scanner(System.in);
		System.out.println("QUANTOS NUMEROS VOCÊ VAI DIGITAR");

		int n = ff.nextInt();
		int [] vect = new int[n];
		int soma = 0;
		double media = 0;
		
		
		
		for (int i = 0; i <n; i++) {

			// pode usar o ----vect.lenght------------ ele se baseia no vetor
			ff.nextLine();
			System.out.println("DIGITE UM NUMERO");
			vect[i] = ff.nextInt();
		}
		System.out.println("\nNUMEROS PARES:");
		
		for (int i = 0; i<n; i++)
			if(vect[i] % 2 == 0){
				 System.out.print(vect[i] +" ");
				soma ++;
	}
			
		System.out.println();
		System.out.println("nuemros pares: " + soma );

		}
		


		}

		
	


