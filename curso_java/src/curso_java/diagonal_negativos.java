package curso_java;

import java.util.Locale;
import java.util.Scanner;

public class diagonal_negativos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N, soma;
		
		System.out.print("Qual a ordem da matriz? ");
		N = sc.nextInt();
		
		int matriz[][] = new int [N][N];
		
		for (int i = 0; i < N; i++)
		{
			for (int j = 0; j < N; j++)
			{
				System.out.print("Element ["+ i + ","+ j + "]: ");
				matriz[i][j] = sc.nextInt();
			}
		}
		
		System.out.println();
		System.out.println("DIAGONAL PRINCIPAL: ");
		
		for(int i = 0; i < N; i++)
		{
			System.out.print(matriz[i][i]+ " ");
		}
		
		soma = 0;
		
		for(int i = 0; i < N; i++)
		{
			for(int j = 0; j < N; j++)
			{
				if(matriz[i][j] < 0)
				{
					soma = soma + 1;
				}
			}
		}
			System.out.println();
		System.out.print("QUANTIDADE DE NEGATIVOS = " + soma + "\n");
		
		sc.close();
	}

}
