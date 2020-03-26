package exercicios;

public class aprovacao {
	
	String nome;
	double nota1;
	double nota2;
	double nota3;
	
	public double notaFinal()
	
	{
		return nota1 + nota2 + nota3;
	}
	
	public double aprovadoReprovado()
	
	{
		if(notaFinal() < 60)
		{
			return 60.0 - notaFinal();
		}
		
		else
		{
			return 0.0;
		}
	}
}
