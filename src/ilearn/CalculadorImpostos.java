package ilearn;

public class CalculadorImpostos {
	
	
	public void fazerCalculo(Orcamento orcamento, Imposto imposto) {
		
		Double valor = imposto.calculo(orcamento);
		
		System.out.println(valor);
	}
	
	public void valorComImposto(Orcamento orcamento, Imposto imposto) {
		Double valor = imposto.calculo(orcamento) + orcamento.getValor();
		
		System.out.println(valor);
	}

}
