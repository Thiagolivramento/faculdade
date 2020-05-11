package Fretamentos;

// menu de operações. 

public class Menu {

	public static void main(String[] args) {
		
				
		System.out.println("\n" + "Entregas regulares de Hoje!");
		System.out.println("---------------------------------------------------" + "\n");
		
		// instanciando um novo frete regular (construtor com parâmetros).
		
		FretesRegulares novoFrete = new FretesRegulares("2 vezes", "semanal", 1, "Empório Bacana", "bacana@xxx.com", "Marginal da BR 101, KM 15, número 180, Palhoça - SC","Avenida Hercílio Luz, nº 265, Centro, Florianópolis - SC" );
		
	    // imprimindo usando o método toString.
	    
	    System.out.println(novoFrete.toString());
	
	    // quebra para visualizar melhor.
	    
	    System.out.println("\n" + "------------------------------------------------" + "\n");
	    System.out.println("As mercadorias que serão entregues ao cliente são: ");
	    System.out.println("------------------------------------------------");
	    System.out.println("Frutas: " + "\n");
	    
	    // instanciando frutas (construtor sem parâmetros, método set).
	    
	    Fruta frutas;
		frutas = new Fruta();
		frutas.setDescricao("Maça Fuji");
		frutas.setPeso("12 kg");
		frutas.setCodigoNotaFiscal(1825658942);
		frutas.setCodigoMercadoria(156);
		frutas.setValorMinimo("R$ 1.00 real o kg");
		frutas.setQuantidadeMinima("5 kg");
		frutas.setTipoMercadoria("Frutas padrão");
		
		// imprimindo os dados frutas 
		
		System.out.println("A fruta transportada é: " + frutas.getDescricao());
				
		// imprimindo usando o método toString.
		
		System.out.println(frutas.toString()); 
		
		
		System.out.println("-----------------------------------------------------------------" + "\n");
		System.out.println("Produtos Perigosos:" + "\n");
		
		// instanciado ProdutoPerigoso (construtor sem parâmetros, método set).
		
		ProdutoPerigoso perigo;
		perigo = new ProdutoPerigoso();
		perigo.setDescricao("Alcool 70%, altamente inflamável");
		perigo.setPeso("125 litros");
		perigo.setCodigoMercadoria(658);
		perigo.setCodigoNotaFiscal(1254568751);
		
		// imprimindo dados produto perigoso.
		
		System.out.println("O produto é: " + perigo.getDescricao());
		System.out.println("A carga é de: " + perigo.getPeso());
		System.out.println("Código da Mercadoria: " + perigo.getCodigoMercadoria());
		System.out.println("Nota fiscal: " + perigo.getCodigoNotaFiscal() + "\n");
		
		// imprimindo dados orgão de inspeção e data.
		
		System.out.println("Orgãos de inspeção: " + perigo.getOrgaoInpsecao());
		System.out.println("Data da Inspeção: " + perigo.getDatahora());
				
		
		System.out.println("\n" + "-------------------------------------------------------------------");
		System.out.println("\n" + "Embalagens: " + "\n"); 
		
		// instanciando embalagem (construtor sem parâmetros, método set).
		
		Embalagem novaEmbalagem;
		novaEmbalagem = new Embalagem();
		novaEmbalagem.setDescricao("Sacolas plásticas");
		novaEmbalagem.setPeso("20 kg");
		novaEmbalagem.setCodigoNotaFiscal(45986542);
		novaEmbalagem.setCodigoMercadoria(458);
		novaEmbalagem.setValorMinimo(2.50);
		novaEmbalagem.setQuantidadeMinima("5 Kg");
		novaEmbalagem.setTipoMercadoria("Embalagens plasticas");
		
		
		System.out.println("A embalagem encomendada é: " + novaEmbalagem.getDescricao());
		System.out.println("O peso da encomenda é: " + novaEmbalagem.getPeso());
		System.out.println("Nota fiscal número: " + novaEmbalagem.getCodigoNotaFiscal());
		System.out.println("Código da mercadoria: " + novaEmbalagem.getCodigoMercadoria());
		System.out.println("O valor mínimo da mercadoria é: "+ "R$" + novaEmbalagem.getValorMinimo() + "reais");
		System.out.println("A quantidade mínima transportada é: " + novaEmbalagem.getQuantidadeMinima());
		System.out.println("O tipo de embalagem: " + novaEmbalagem.getTipoMercadoria() + "\n");
		
		
		System.out.println("-----------------------------------------------------------");
		System.out.println("FRETE TOTAL!");
		
		
		// imprimindo o calculo do frete.
		System.out.println("O valor do frete é: R$ " + novoFrete.calculaFrete(28.0) + "reais");
		
		
		
		// Inicio frete sob demanda
		System.out.println("-----------------------------------------------------------" + "\n" + "\n");
		System.out.println("Os fretes sob demanda da semana são: " + "\n"); 
		System.out.println("\n" + "-------------------------------------------------------------------");
		
		System.out.println("As mercadorias que deverão ser entregues são: " + "\n");
		// instanciando frete sob demanda (construtor com parâmetros).
		
		FretesDemanda freteDemanda = new FretesDemanda("11/05/2020", "15/05/2020", "Josualdo Ferreira Combustíveis", "josu@xxx.com", "Marginal da BR 101, KM 145, nº 2180, distribuidora APP,  Palhoça - SC", "Rua Maria Louca, nº 25, Quinto dos inferno - SC"); 
		
		// imprimindo dados frete sob demanda com método toString.
		
		System.out.println(freteDemanda.toString());
		
		
				
		// instanciando Combustíveis, usando construtor sem parâmetros (método set).
		
		Combustiveis novoCombustivel;
		novoCombustivel = new Combustiveis();
		novoCombustivel.setCodigoMercadoria(2548);
		novoCombustivel.setCodigoNotaFiscal(2569874);
		novoCombustivel.setDescricao("Gasolina Aditivada");
		novoCombustivel.setPeso("2000 litros");
		novoCombustivel.setQuantidadeMinima("500 litros");
		novoCombustivel.setValorMinimo("R$ 2.35 reais/L");
		novoCombustivel.setTipoMercadoria("Derivado de Petróleo");
		
		
		System.out.println("--------------------------------------------------------------------" + "\n");
		System.out.println("Combutíveis" + "\n");
		
		// Imprimindo dados combustiveis com método toString.
		
		System.out.println(novoCombustivel.toString() + "\n");
		
		System.out.println("-----------------------------------------------------------");
		System.out.println("FRETE TOTAL!");
		
		// imprimindo calculo do frete.
		System.out.println("O valor do frete é: R$ " + freteDemanda.calculaFrete(145.5) + "reais");
		
		
		
	}

}
