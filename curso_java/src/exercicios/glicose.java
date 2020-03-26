package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class glicose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a medida da glicose: ");
		int N = sc.nextInt();
		
		
		if(N <= 100)
		{
			System.out.println("Classificacao: Normal");
		}
		else if (N > 100 && N <= 140)
		{
			System.out.println("Classificacao: Elevado");
		}
		else
		{
			System.out.println("Classificacao: Diabetes");
		}
		sc.close();
	}

}
