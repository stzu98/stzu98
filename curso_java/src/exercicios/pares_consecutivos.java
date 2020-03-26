package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class pares_consecutivos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite um numero inteiro: ");
		int x = sc.nextInt();
		
		int soma = 0;
		
		while ( x != 0)
		{
			if (x % 2 != 0)
			{
				x++;
			}
			
			soma = x * 5 + 20;
			System.out.print("SOMA = " + soma);
			System.out.print("\nDigite um numero inteiro: ");
			x = sc.nextInt();
		}
		
		sc.close();
	}

}
