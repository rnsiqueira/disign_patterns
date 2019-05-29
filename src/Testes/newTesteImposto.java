package Testes;

import ilearn.ICMS;
import ilearn.ICPP;
import ilearn.ISS;
import ilearn.Imposto;
import ilearn.Orcamento;

public class newTesteImposto {

	public static void main(String[] args) {
		Imposto imposto = new ICPP(new ISS());

		Orcamento orcamento = new Orcamento(600.0);

		System.out.println(imposto.calculo(orcamento));

	}

}
