package curso_java;

import java.util.Locale;
import java.util.Scanner;
import java.util.Scanner;

public class soma_vetores {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double soma , media;
		int n;
		
		System.out.print("Quantos numeros você irá digitar?: ");
		n = sc.nextInt();
		
		double vet[] = new double[n];
		
		for (int i = 0; i < n; i++)
		{
			System.out.print("Digite um numero: ");
			vet[i] = sc.nextDouble();
		}
		
		soma = 0.0;
		media = 0.0;
		
		for (int i = 0; i < n; i++)
		{
			
			soma = soma + vet[i];
		}
		System.out.println();
		
		System.out.print("VALORES = ");
		for (int i = 0; i < n; i++)
		{
			System.out.print(String.format("%.1f", vet[i]) + " ");
		}
		
			media = soma / n;
		System.out.println();
		System.out.println("SOMA = " +String.format("%.2f", soma));
		System.out.println("MEDIA = " +String.format("%.2f", media));
		sc.close();
	}

}
