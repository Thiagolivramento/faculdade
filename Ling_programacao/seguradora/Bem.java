package seguradora.cesusc;

public abstract class Bem {
	private int codigo;
	private String descricao;
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public abstract int calculaRisco(Double valorBem);
	public abstract double calculaValorPromocional(Double valorBem);
	
	

}
