package aula03;

public class Menu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Valor Convertido: " + Pagamento.getConversao(300.0, 5.2));
		
		
		PagamentoMarmitas meuPagamento = new PagamentoMarmitas();
		meuPagamento.setNomePagador("teste");
		
		System.out.println(meuPagamento.validaCodigoBarra("AAAABBB1111"));
		System.out.println(meuPagamento.validaCodigoBarra("AAAA11"));
		
		PagamentoGas meuGas = new PagamentoGas();
		System.out.println(meuGas.validaCodigoBarra("AAAABBB1111"));
		System.out.println(meuGas.validaCodigoBarra("GAS3342342342"));
		
		meuGas.setValorPagamento(500.0);
		meuGas.converteParaDolar(5.2);
		System.out.println("Pagamento: "+meuGas.getValorPagamento());
		System.out.println("Em Dolar: "+meuGas.getValorPagamentoemDolar());
		
		RegistroPagamento meuRegistro = new RegistroPagamentoSMS(); 		
		System.out.println("Log Gerado" + meuRegistro.geraLog());
		
	}

}
