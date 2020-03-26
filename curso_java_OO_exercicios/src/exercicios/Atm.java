package exercicios;

public class Atm {
	
	private int numeroConta;
	private String titularConta;
	private double saldo;
	
	public Atm(int numeroConta, String titularConta) {
		
		this.numeroConta = numeroConta;
		this.titularConta = titularConta;
	}

	public Atm(int numeroConta, String titularConta, double depositoInicial) {
		super();
		this.numeroConta = numeroConta;
		this.titularConta = titularConta;
		deposito(depositoInicial);
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public String getTitularConta() {
		return titularConta;
	}

	public void setTitularConta(String titularConta) {
		this.titularConta = titularConta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void deposito(double montante)
	{
		 saldo += montante;
	}
	
	public void saque(double montante)
	{
		saldo -= montante + 5;
	}

	
	public String toString() {
		return "Conta " + numeroConta 
				+ ", Titular: " + titularConta 
				+ ", saldo: $" + String.format("%.2f", saldo);
	}

	
}