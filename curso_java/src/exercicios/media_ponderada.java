package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class media_ponderada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		double media, soma;
		
		soma = 0;
		media = 0;
		System.out.print("Quantos casas você vai digitar? ");
		n = sc.nextInt();
		
		double[] vet = new double[n];
		
		System.out.println("\nDigite tres numeros: ");
		for(int i = 0; i < n; i++)
		{
			vet[i] = sc.nextDouble();
			
			if(i < 1)
			{
				vet[i] = vet[i] * 2;
			}
			
			else if (i == 1)
			{
				vet[i] = vet[i] * 3;
			}
			else
			{
				vet[i] = vet[i] * 5;
			}
		}
		
		for(int i = 0; i < n; i++)
		{
			soma = soma + vet[i];
		}
		
		media = soma/10;
		
		System.out.printf("MEDIA = %.1f", media);
		sc.close();
	}

}
