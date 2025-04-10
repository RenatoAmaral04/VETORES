package VET;

import java.util.Scanner;

public class VET7 {

	public static void main(String[] args) {
		
		
		Scanner ff = new Scanner(System.in);
		System.out.println("Quantos elementos terao vetor");
		int n = ff.nextInt();
		int a [] = new int[n];
		double par = 0;
		double media = 0;
		double nada = 0;

		for (int i = 0; i < n; i++) {
			
			System.out.println("DIGITE UM NUMERO");
			a[i] = ff.nextInt();
		}		
		
		for (int i = 0; i<n; i++) {
			
			if(a[i] % 2 == 0) {
				
				par += a[i];
				media ++;
				
			}
		}
		
		if(media > 0) {
			
			double b = par / media;
			System.out.println("MEDIA DOS PARES: " + b);
		} else
		{
			System.out.println("NENHU NUMERO PAR");
		}
		
	
		ff.close();
	}



	}


