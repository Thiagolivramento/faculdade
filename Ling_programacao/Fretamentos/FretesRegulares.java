package Fretamentos;

// subclasse fretes regulares, pode ser instanciada e recebe características da classe pai.

public class FretesRegulares extends Fretes {

	private String frequencia;
	private String unidadefrequencia;
	private int quantidadeoperacoes;
	
	
	
	public String getFrequencia() {
		return frequencia;
	}



	public void setFrequencia(String frequencia) {
		this.frequencia = frequencia;
	}



	public String getUnidadefrequencia() {
		return unidadefrequencia;
	}



	public void setUnidadefrequencia(String unidadefrequencia) {
		this.unidadefrequencia = unidadefrequencia;
	}



	public int getQuantidadeoperacoes() {
		return quantidadeoperacoes;
	}



	public void setQuantidadeoperacoes(int quantidadeoperacoes) {
		this.quantidadeoperacoes = quantidadeoperacoes;
	}
	
	// método para calcular frete da subclasse (classe pai - Fretes).
	
	public Double calculaFrete(Double valorFrete) {
		// TODO Auto-generated method stub
		return  200 + (0.5 * valorFrete);
	}

	// método construtor com parâmetros, recebe paramêtros da classe pai.
	
	public FretesRegulares(String frequencia, String unidadefrequencia, int quantidadeoperacoes,String nome, String email, String enderecoPartida, String enderecoEntrega) {
		
		super(nome, email, enderecoPartida, enderecoEntrega);
		this.frequencia = frequencia; 
		this.unidadefrequencia = unidadefrequencia;
		this.quantidadeoperacoes = quantidadeoperacoes;
		
	}
	

	// método toString.
	
	@Override
	public String toString() {
		return "Fretes Regulares" + "\n" + super.toString() + "\n" + "frequencia = " + frequencia + "\n" + "unidade frequencia = " + unidadefrequencia
				+"\n" + "quantidade operacoes = " + quantidadeoperacoes;
	}

	
}
