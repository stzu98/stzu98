package exercicios;

import java.util.Locale;
import java.util.Scanner;
import exercicios.retangulo;

public class retangulo_program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		retangulo var;
		var = new retangulo();
		
		System.out.println("Enter rectangle width and height:");
		var.base = sc.nextDouble();
		var.altura = sc.nextDouble();
		
		var.area();
		var.perimetro();
		var.diagonal();
		
		System.out.println(var);
		
		sc.close();
	}

}
