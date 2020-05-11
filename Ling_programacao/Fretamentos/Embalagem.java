package Fretamentos;

//subclasse da classe pai Mercadoria, pode instanciar.

public class Embalagem extends Mercadoria {
	
	private String descricao;
	private double valorMinimo;
	private String quantidadeMinima;
	
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getValorMinimo() {
		return valorMinimo;
	}
	public void setValorMinimo(double valorMinimo) {
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
		return "descricao = " + descricao + ", valor Minimo = " + valorMinimo + ", quantidade Minima = "
				+ quantidadeMinima + super.toString();
	}
	
	// método construtor com parametros Embalagem. Desativado!
	
	    /*public Embalagem(String descricao, String valorMinimo, String quantidadeMinima, int codigoMercadoria, String peso, int codigoNotaFiscal, String tipoMercadoria){
		 * 
		 * super(codigoMercadoria, peso, codigoNotaFiscal, tipoMercadoria)
		 * this.descricao = descricao;
		 * this.valorMinimo = valorMinimo;
		 * this.quantidadeMinima = quantidadeMinima;
		 * 
		 *  }
		 */
}