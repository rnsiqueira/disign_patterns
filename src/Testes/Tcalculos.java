package Testes;

import ilearn.CalculadorImpostos;
import ilearn.ICCC;
import ilearn.ICMS;
import ilearn.ISS;
import ilearn.Imposto;
import ilearn.Orcamento;

public class Tcalculos {

	public static void main(String[] args) {
		
		Imposto ICMS = new ICMS();
		Imposto ISS = new ISS();
		Imposto ICCC = new ICCC();
		
		
		Orcamento or = new Orcamento(3500.0);
		
		CalculadorImpostos cl = new CalculadorImpostos();
		
		cl.fazerCalculo(or, ICMS);
		cl.fazerCalculo(or, ISS);
		
		cl.valorComImposto(or, ICMS);
		
		cl.fazerCalculo(or, ICCC);
		
		cl.valorComImposto(or, ICCC);
	}

}
