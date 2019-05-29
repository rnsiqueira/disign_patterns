package Testes;

import ilearn.CalculadorDeDescontos;
import ilearn.Itens;
import ilearn.Orcamento;

public class TestaDescontos {
	
	public static void main(String[] args) {
		CalculadorDeDescontos calculador = new CalculadorDeDescontos();
		
		
		Orcamento orcamento = new Orcamento(500.0);
		
		orcamento.addItens(new Itens("Camisa", 250.0));
		orcamento.addItens(new Itens("Calça", 250.0));
		
		
		double desconto = calculador.calcula(orcamento);
		
		System.out.println(desconto);
	}

}
