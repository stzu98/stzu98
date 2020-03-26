package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class CurrencyConverterProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
		double dollarPrice = sc.nextDouble();
		
		System.out.print("How many dollars will be bought? ");
		double dollarAmount = sc.nextDouble();
		
		double c = CurrencyConverter.converter(dollarAmount, dollarPrice);
		
		System.out.printf("Amount to be paid in reais = %.2f " , c);
		
		sc.close();
	}

}
