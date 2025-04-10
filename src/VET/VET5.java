package VET;

import java.util.Scanner;

public class VET5 {

	public static void main(String[] args) {
		Scanner ff = new Scanner(System.in);
		System.out.println("QUANTOS PESSOAS VOCÊ VAI DIGITAR");

		int n = ff.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		int[] c = new int[n];
		
		for (int i = 0; i<n; i++) {
			
			System.out.println("DIGITE OS VALORES DO VETOR A");
			a[i] = ff.nextInt();
		}
		
		for (int i = 0; i<n; i++) {
			
			System.out.println("DIGITE OS VALORES DO VETOR B");
			b[i] = ff.nextInt();
		}
		
		for (int i = 0; i<n; i++) {
			
			System.out.println("RESULTADO");
			c[i] = a[i] + b[i];
			System.out.println(c[i]);
		}
		
		
		
		

	}

}
