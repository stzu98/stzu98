package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class experiencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		char y;
		int x = 0, soma = 0, c = 0, r = 0, s = 0;
		double porcentagem = 0, porcentagem2 = 0, porcentagem3 = 0;
		
		System.out.print("Quantos casos de teste serao digitados? ");
		int N = sc.nextInt();
		
		for(int i = 0; i < N; i++)
		{
			System.out.print("Quantidade de cobaias: ");
			x = sc.nextInt();
			soma = soma + x;
			
			sc.nextLine();
			System.out.print("Tipo de cobaia: ");
			y = sc.nextLine().charAt(0);
			
			if ( y == 'C')
			{
				c = c + x;
			}
			else if ( y == 'R')
			{
				r = r + x;
			}
			else if ( y == 'S')
			{
				s = s + x;
				
			}
		}
		
		System.out.println("RELATORIO FINAL: ");
		System.out.println("Total: "+soma+"  cobaias");
		System.out.println("Total de coelhos: "+c);
		System.out.println("Total de ratos: "+r);
		System.out.println("Total de sapos: "+s);
		
		porcentagem =  (double) c * 100 /soma;
		porcentagem2 = (double) r * 100 /soma;
		porcentagem3 = (double) s * 100 /soma;
		
		System.out.printf("Percentual de coelhos: %.2f\n", porcentagem);
		System.out.printf("Percentual de ratos: %.2f\n", porcentagem2);
		System.out.printf("Percentual de sapos: %.2f\n", porcentagem3);
		sc.close();
	}

}
