package exercicios;

public class Funcionario {
	
	public String nome;
	public double salarioBruto;
	public double imposto;
	
	
	public double NetSalary()
	{
		return salarioBruto - imposto;
	}
	
	public void aumentoSalario(double taxa)
	
	{
		salarioBruto += salarioBruto * (taxa / 100);
	}

	
	public String toString() {
		return "Funcionario: " + nome 
				+ ", $ " + String.format("%.2f", NetSalary());
								
	}
	
	
}

	
	
	
	