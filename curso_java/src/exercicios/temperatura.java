package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class temperatura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double F;
		double C;
		
		System.out.println("Digite a temperatura em F: ");
		F = sc.nextDouble();
		
		C = (F - 32) / 1.8;
		
		System.out.printf("C = %.2f\n", C);
		
		F = 0;
		
		System.out.println("Digite a temperatura em C: ");
		C = sc.nextDouble();
		
		F = C * 1.8 + 32;
		
		System.out.printf("F = %.2f", F);
		sc.close();
	}

}
