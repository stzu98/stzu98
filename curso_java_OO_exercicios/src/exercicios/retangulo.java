package exercicios;

public class retangulo {
	
	public double base;
	public double altura;
	
	public double area()
	{
		return base * altura;
	}
	
	public double perimetro()
	{
		return 2 * (base + altura);
	}
	
	public double diagonal()
	{
		return Math.sqrt(Math.pow(base, 2) + Math.pow(altura, 2));
	}

	@Override
	public String toString() {
		return "AREA = " + String.format("%.2f", area()) + "\n" 
				+"PERIMETRO = " + String.format("%.2f", perimetro()) + "\n" 
				+"DIAGONAL= " + String.format("%.2f",diagonal()) + "\n";
	}
	
	
}
