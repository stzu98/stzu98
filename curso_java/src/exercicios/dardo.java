package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class dardo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		double maior;
		int i = 0;
		
		
		System.out.print("Digite 3 distâncias:\n ");
		double[] vet = new double[3];
		
		for ( i = 0; i < 3; i++)
		{
			vet[i] = sc.nextDouble();
		}
		
		maior = 0;
		
		for ( i = 0; i < 3; i++)
		{
			if (maior < vet[i])
			{
				maior = vet[i];
			}
			
		}
			
		System.out.printf("\nMAIOR DISTANCIA = %.2f\n", maior);
		sc.close();
	}

}
