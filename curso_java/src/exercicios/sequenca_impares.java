package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class sequenca_impares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o valor de X: ");
		int x = sc.nextInt();
		
		for (int i = 0; i < x; i++)
		{	
			if(i % 2 != 0)
			{
				System.out.println(i);
			}
		}
		
		System.out.println("FIM DA EXECU��O");
		sc.close();
	}

}
