package Fretamentos;

import java.sql.Date;

//subclasse da classe pai Mercadoria, pode instanciar. Recebe uma interface, pois tem caracteristicas próprias da subclasse. 

public class ProdutoPerigoso extends Mercadoria implements ProdutosAuditados {
	
	private String descricao;
	private String valorMinimo; 
    private String quantidadeMinima;
    
    // métodos get e set.
    
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
	
	// método para data e hora da inspeção.
	
	@Override
	public Date getDatahora() {
		// TODO Auto-generated method stub
		return new Date(120, 3, 10);
	}
	
	// método para orgão de inspeção.
	
	@Override
	public String getOrgaoInpsecao() {
		// TODO Auto-generated method stub
		return "ANTT- Agência Nacional de Transportes Terrestres" + "\n" + "e"+
				" " + "ANP - Agência Nacional de Petróleo, Gás Natural e Biocombustíveis";
	}
	
	// método toString.
	
	@Override
	public String toString() {
		return "descricao = " + descricao + "valor Minimo = " + valorMinimo + "quantidade Minima = "
				+ quantidadeMinima + super.toString() + getOrgaoInpsecao() + getDatahora();
	}
    
	
    
}
