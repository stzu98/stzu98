package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class tempo_de_jogo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("Hora inicial: ");
		int horaI = sc.nextInt();
		
		System.out.print("Hora Final: ");
		int horaF = sc.nextInt();
		
		int duracao = 0;
		
		if (horaI < horaF)
		{
			duracao = horaF - horaI;
			
		}
		
		else
		{
			duracao = (24 - horaI) + horaF;
		}
		System.out.printf("\nO JOGO DUROU " + duracao + " HORA(S)");
		
		sc.close();
		
	}

}