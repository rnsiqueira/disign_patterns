package Testes;

import ilearn.Desconto;
import ilearn.DescontoPorMaisDeCincoItens;
import ilearn.DescontoPorMaisDeQuinhentosReais;
import ilearn.DescontoPorVendaCasada;
import ilearn.Itens;
import ilearn.Orcamento;
import ilearn.SemDesconto;

public class TestaCorrente {
	
	public static void main(String[] args) {
        Desconto d1 = new DescontoPorMaisDeCincoItens();
        Desconto d2 = new DescontoPorMaisDeQuinhentosReais();
        Desconto d3 = new DescontoPorVendaCasada();
        Desconto d4 = new SemDesconto();

        d1.setProximo(d2);
        d2.setProximo(d3);
        d3.setProximo(d4);

    Itens lapis = new Itens("Lapis", 15.00);
        Itens caneta = new Itens("Caneta", 15.00);
        Itens borracha = new Itens("borracha", 15.00);

        Orcamento orcamento = new Orcamento(500.0);
        orcamento.addItens(lapis);
        orcamento.addItens(borracha);
        orcamento.addItens(lapis);        

        double desconto = d1.desconta(orcamento);
        System.out.println(desconto);
      }

}
