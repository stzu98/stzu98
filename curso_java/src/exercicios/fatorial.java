package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class fatorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int fatorial = 1;
		
		System.out.print("Digite o valor de N: ");
		int N = sc.nextInt();
		
		for(int i = 1; i <= N; i++)
		{
			
			fatorial = fatorial * i;
			
		}
		
		System.out.println("FATORIAL = " + fatorial);
		sc.close();
	}

}
