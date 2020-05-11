package ads;

public class PecaOficina {
       String nome;
       String classificacao;
       int tamanho;
       double precoCusto;
       double precoVenda;
       int tempoTroca;
       int percentualVenda;

void calcularPrecoVenda (int percentualVenda){
 double percentual = percentualVenda/pecoCusto;
 double calcularPorcentagem = precoCusto +(percentual*precoCusto);
 System.out.println("O valor final do produto é" + calcularPorcentagem);
}
public void mostraInfo(){
 System.out.println("Peça" + nome);
 System.out.println("Classificação" + classificacao);
 System.out.println("Tamanho: " + tamanho + "cm");
 System.out.println("Preço de Custo: R$ " + precoCusto + "reais");
 System.out.println("Tempo para trocar a peça é:" + tempoTroca + "minutos");
 System.out.println("Porcentual da Venda: " + percentualVenda + "%");
 }
}
