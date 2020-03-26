package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class AprovacaoPrograma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		aprovacao c;
		
		c = new aprovacao();
		
		System.out.println("Entrada: ");
		c.nome = sc.nextLine();
		c.nota1 = sc.nextDouble();
		c.nota2 = sc.nextDouble();
		c.nota3 = sc.nextDouble();
		
		System.out.printf("NOTA FINAL %.2f", c.notaFinal());
		System.out.println();
		if(c.notaFinal() < 60)
		{
			System.out.printf("FAILED\nMISSING %.2f PONTOS" ,c.aprovadoReprovado());
		}
		else
		{
			System.out.println("APROVADO");
		}
		
		
		
		sc.close();
	}

}
