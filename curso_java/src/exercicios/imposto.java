package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class imposto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double salario = 0, imposto = 0;
		
		System.out.println("Entrada: ");
		salario = sc.nextDouble();
		
		if(salario <= 2000)
		{
			System.out.println("ISENTO");
		}
		else if (salario <= 3000)
		{
			imposto = (salario - 2000) * 0.08;
			System.out.printf("Sa�da: %.2f", imposto);
		}
		else if(salario <= 4500)
		{
			imposto = 1000 * 0.08 + (salario - 3000) * 0.18;
			System.out.printf("Sa�da: %.2f", imposto);
		}
		else
		{
			imposto = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
			System.out.printf("Sa�da: %.2f", imposto);
		}
		
		
	}

}
