package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class dentro_fora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int dentro, fora, x, n;
		
		dentro = 0;
		fora = 0;
		
		System.out.print("Quantos numeros voce vai digitar: ");
		 n = sc.nextInt();
		
		for (int i = 0; i < n; i++)
		{
			System.out.print("Digite um numero: ");
			x = sc.nextInt();
			
			if(x >=10 && x <=20)
			{
				dentro++;
			}
			
			else
				
			{
				fora++;
			}
		}
		
		System.out.println(dentro + " DENTRO");
		System.out.println(fora + " FORA");
		sc.close();
	}

}
