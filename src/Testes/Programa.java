package Testes;

import cap4.Div;
import cap4.Expressao;
import cap4.ImpressoraVisita;
import cap4.Mult;
import cap4.Numero;
import cap4.Raiz;
import cap4.Soma;
import cap4.Sub;

public class Programa {

	public static void main(String[] args) {
	
	
	
	Expressao esquerda = new Soma(new Mult(new Numero(3), new Numero(7)), new Numero(3));
	Expressao direita = new Sub(new Div(new Numero(200), new Numero(5)), new Sub(new Numero(56), new Numero(22)));
	Expressao equalcao = new Raiz(new Soma(esquerda, direita));
	
	double resultado = equalcao.avalia();
	
	System.out.println(resultado);
	
	ImpressoraVisita im = new ImpressoraVisita();
	
	equalcao.Aceita(im);

	}

}
