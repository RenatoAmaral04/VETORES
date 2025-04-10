package VET;
import java.util.Scanner;
public class VET6 {

	public static void main(String[] args) {
	
		Scanner ff = new Scanner(System.in);
		System.out.println("Quantos elementos terao vetor");
		int n = ff.nextInt();
		int a[] = new int[n];
		double media = 0;

		for (int i = 0; i < n; i++) {

			System.out.println("DIGITE UM NUMERO");
			a[i] = ff.nextInt();
			media += a[i];
		}

		double b = media / n;
		System.out.println("MEDIA: " + b);

		for (int i = 0; i < n; i++) {
			if (a[i] < b) {
				System.out.println(a[i]);

			}

		}
}
}