package aula03;

public abstract class Pagamento {
	private String nomePagador;
	private String nomeRecebedor;
	private Double valorPagamento;
	private Double valorPagamentoemDolar;
	
	
	public abstract boolean validaCodigoBarra(String codigo);
	
	
		
	public String getNomePagador() {
		return nomePagador;
	}
	public void setNomePagador(String nomePagador) {
		this.nomePagador = nomePagador;
	}
	public String getNomeRecebedor() {
		return nomeRecebedor;
	}
	public void setNomeRecebedor(String nomeRecebedor) {
		this.nomeRecebedor = nomeRecebedor;
	}
	public Double getValorPagamento() {
		return valorPagamento;
	}
	public void setValorPagamento(Double valorPagamento) {
		this.valorPagamento = valorPagamento;
	}
	
	public void converteParaDolar(double cotacao) {
		valorPagamentoemDolar = (cotacao * getValorPagamento());
	}

	public Double getValorPagamentoemDolar() {
		
		return valorPagamentoemDolar;
	}
	
	public static Double  getConversao(Double valor, Double cotacao){
		return valor * cotacao;
	}
	
	
}
