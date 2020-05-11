package Fretamentos;

// Classe abstrata Fretes, não pode ser instanciada. 

public abstract class Fretes {
	private String nome;
	private String email;
	private String enderecoPartida;
	private String enderecoEntrega;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEnderecoPartida() {
		return enderecoPartida;
	}
	public void setEnderecoPartida(String enderecoPartida) {
		this.enderecoPartida = enderecoPartida;
	}
	public String getEnderecoEntrega() {
		return enderecoEntrega;
	}
	public void setEnderecoEntrega(String enderecoEntrega) {
		this.enderecoEntrega = enderecoEntrega;
	}
	
	// método abstrato de calcular o frete, nas subclasses é que faço a operação, pois varia conforme o tipo de frete.
	
	public abstract Double calculaFrete(Double valorFrete);
	
	// método construtor da classe pai. 
	
	public Fretes(String nome, String email, String enderecoPartida, String enderecoEntrega) {
		
		this.nome = nome;
		this.email = email;
		this.enderecoPartida = enderecoPartida;
		this.enderecoEntrega = enderecoEntrega;
	}
	
	// método toString. 
	
	@Override
	public String toString() {
		return "nome = " + nome + "\n" + "email = " + email + "\n" + "endereço Partida = " + enderecoPartida + "\n"
				+ "endereço Entrega = " + enderecoEntrega;
	}
	
	
	

}
