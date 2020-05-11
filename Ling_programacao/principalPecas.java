package ads

public class Principalpecas {

    public static void main(String args[]) {
    PecaOficina novaPeca;
    novaPeca = new PecaOficina();
    novaPeca.nome = "filtro de ar";
    novaPeca.classificacao = "Esportivo";
    novaPeca.tamanho = "15cm";
    novaPeca.precoCusto = 50;
    novaPeca.tempoParaTroca = 5;
    novaPeca.percentualVenda = 10;
    novaPeca.exibirInformacoes();
    novaPeca.calcularOprecoDeVenda(1);
  }

}
