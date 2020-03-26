package exercicios;

public class Aluguel {
	private String Nome;
	private String email;
	
	
	public Aluguel(String nome, String email) {
		
		Nome = nome;
		this.email = email;
			
	}
		
	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
	public String toString() {
		return  Nome + ", " + email;
	}

		
	
}
