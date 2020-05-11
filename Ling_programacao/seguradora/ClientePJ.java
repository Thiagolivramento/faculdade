package seguradora.cesusc;

public class ClientePJ extends Cliente {
	private String cnpj;
	private String inscricaoestadual;
	
	
	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getInscricaoestadual() {
		return inscricaoestadual;
	}

	public void setInscricaoestadual(String inscricaoestadual) {
		this.inscricaoestadual = inscricaoestadual;
	}

	@Override
	public Double calculaImposto(Double valorSeguro) {
		// TODO Auto-generated method stub
		return (0.05 * valorSeguro);
	}

}
