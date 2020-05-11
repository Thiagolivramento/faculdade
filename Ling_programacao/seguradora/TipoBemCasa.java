package seguradora.cesusc;

public class TipoBemCasa extends Bem {
    private String cidade;
    private String endereco;
	
	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	@Override
	public int calculaRisco(Double valorBem) {
		int risco= 0;
		if (cidade.equals("Florianopolis")) { risco = 7;}
		else if (cidade.equals("São José")) { risco = 9;}
		else risco = 10;
				
		return risco;
	}

	@Override
	public double calculaValorPromocional(Double valorBem) {
		
		return valorBem * 0.95;
	}

}
