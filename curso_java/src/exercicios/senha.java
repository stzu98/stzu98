package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class senha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int senha2 =  2002;
		int senha;
		
		System.out.print("Digite a senha: ");
		senha = sc.nextInt();
		
		while (senha != senha2)
		{
			System.out.print("Senha invalida! Tente novamente: ");
			senha = sc.nextInt();
			
		}
		
		System.out.println("Acesso permitido!");
		sc.close();
	}

}
