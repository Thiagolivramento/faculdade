package seguradora.cesusc;

public class ClientePF extends Cliente {

	private String cpf;
	
	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public Double calculaImposto(Double valorSeguro) {
		// TODO Auto-generated method stub
		
		return 20 + (valorSeguro *0.02) ;
	}

}
