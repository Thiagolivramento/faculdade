package Fretamentos;

// classe abstrata Mercadorias, não pode ser instanciada. 

public abstract class Mercadoria {

	private int codigoMercadoria;
	private String peso;
	private int codigoNotaFiscal;
	private String tipoMercadoria;
	
	
	public int getCodigoMercadoria() {
		return codigoMercadoria;
	}
	public void setCodigoMercadoria(int codigoMercadoria) {
		this.codigoMercadoria = codigoMercadoria;
	}
	public String getPeso() {
		return peso;
	}
	public void setPeso(String peso) {
		this.peso = peso;
	}
	public int getCodigoNotaFiscal() {
		return codigoNotaFiscal;
	}
	public void setCodigoNotaFiscal(int codigoNotaFiscal) {
		this.codigoNotaFiscal = codigoNotaFiscal;
	}
	public String getTipoMercadoria() {
		return tipoMercadoria;
	}
	public void setTipoMercadoria(String tipoMercadoria) {
		this.tipoMercadoria = tipoMercadoria;
	}
	
	// método toString.
	
	@Override
	public String toString() {
		return  "codigo Mercadoria = " + codigoMercadoria + "\n" + "peso =" + peso + "\n" + "codigo Nota Fiscal = "
				+ codigoNotaFiscal + "\n" + "tipo Mercadoria = " + tipoMercadoria + "\n";
	}
	
	// método construtor com parâmetros. Desativado aqui!
	
	/* public Mercadoria(int codigoMercadoria, String peso, int codigoNotaFiscal, String tipoMercadoria){
	 * 
	 *  this.codigoMercadoria = codigoMercadoria;
	 *  this.peso = peso;
	 *  this.codigoNotaFiscal = codigoNotaFiscal;
	 *  this.tipoMercadoria = tipoMercadoria;
	 *  
	 * }
	 */
	
	
	
	
	
}
