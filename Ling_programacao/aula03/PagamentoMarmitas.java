package aula03;

public class PagamentoMarmitas extends Pagamento {

	@Override
	public boolean validaCodigoBarra(String codigo) {		
		return (codigo.length() == 6);
		
	}
	
	
	

}
