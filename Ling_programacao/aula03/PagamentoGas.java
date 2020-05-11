package aula03;

public class PagamentoGas extends Pagamento {
	

	
	@Override
	public boolean validaCodigoBarra(String codigo) {
		// TODO Auto-generated method stub
		return codigo.contains("GAS");
	}
	
	




}
