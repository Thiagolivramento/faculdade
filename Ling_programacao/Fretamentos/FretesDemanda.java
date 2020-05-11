package Fretamentos;

//subclasse fretes sob demanda, pode ser instanciada e recebe características da classe pai.

public class FretesDemanda extends Fretes {
	
	private String datacoleta;
	private String dataentrega;
	
	public String getDatacoleta() {
		return datacoleta;
	}


	public void setDatacoleta(String datacoleta) {
		this.datacoleta = datacoleta;
	}


	public String getDataentrega() {
		return dataentrega;
	}


	public void setDataentrega(String dataentrega) {
		this.dataentrega = dataentrega;
	}

	// método para calcular frete da subclasse (classe pai - Fretes).
	
	@Override
	public Double calculaFrete(Double valorFrete) {
		// TODO Auto-generated method stub
		return 300 + (0.6 * valorFrete);
	}
 
	// método construtor com parâmetros, recebe paramêtros da classe pai. 
	
	public FretesDemanda(String datacoleta,  String dataentrega, String nome, String email, String enderecoPartida, String enderecoEntrega) {
		
	   super(nome, email, enderecoPartida, enderecoEntrega); 
		this.datacoleta = datacoleta;
		this.dataentrega = dataentrega;
	}

	// método toString.
	
	@Override
	public String toString() {
		return "Fretes sob Demanda" + "\n" + "data da coleta = " + datacoleta + "\n" +  "data da entrega = " + dataentrega + "\n" +  super.toString();
	}
	
	

}
