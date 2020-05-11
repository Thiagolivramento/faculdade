package Fretamentos;

// subclasse da classe pai Mercadoria, pode instanciar.

public class Fruta extends Mercadoria {
	
	private String descricao;
	private String valorMinimo;
	private String quantidadeMinima;
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getValorMinimo() {
		return valorMinimo;
	}
	public void setValorMinimo(String valorMinimo) {
		this.valorMinimo = valorMinimo;
	}
	public String getQuantidadeMinima() {
		return quantidadeMinima;
	}
	public void setQuantidadeMinima(String quantidadeMinima) {
		this.quantidadeMinima = quantidadeMinima;
	}
	
	@Override
	public String toString() {
		return  super.toString() + "descricao = " + descricao + "\n" + "valor Minimo = " + valorMinimo + "\n" + "quantidade Minima = "
				+ quantidadeMinima;
	}
	
	// método construtor com parametros frutas. Desativado!
	
	/* public Fruta(String descricao, String valorMinimo, String quantidadeMinima, int codigoMercadoria, String peso, int codigoNotaFiscal, String tipoMercadoria){
	 * 
	 * super(codigoMercadoria, peso, codigoNotaFiscal, tipoMercadoria)
	 * this.descricao = descricao;
	 * this.valorMinimo = valorMinimo;
	 * this.quantidadeMinima = quantidadeMinima;
	 * 
	 * } 
	 */
	
}
