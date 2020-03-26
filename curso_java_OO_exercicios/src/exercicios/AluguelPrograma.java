package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class AluguelPrograma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		int j = 1;
		System.out.print("How Many rooms will be rented?  ");
		int n = sc.nextInt();
		
		Aluguel[] vetor = new Aluguel[10];
		
		
		for(int i = 1; i <=n; i++)
		{
			System.out.println("Rent #" + i + ":");
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Quarto: ");
			int quarto = sc.nextInt();
			
			vetor[quarto] = new Aluguel(nome, email);
			
		}
		
		System.out.println();
		
		System.out.println("Busy rooms: ");
		
		
		
		for(int i = 0; i < 10; i++)
		{
			if(vetor[i] != null)
			{
					
				System.out.println(i + ", " + vetor[i] );
			}
			
		}
		sc.close();
	}

}
