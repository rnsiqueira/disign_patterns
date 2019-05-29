package ilearn;

public class ICCC extends TemplateImpostos{

	@Override
	public double calculo(Orcamento orcamento) {
		
		if(orcamento.getValor() < 1000.0) {
			return orcamento.getValor() * 0.05;
		}
		
		else if (orcamento.getValor() <= 3000.0) {
			return orcamento.getValor() * 0.07;
			
		}
		else {
			return orcamento.getValor() * 0.08 + 30;
		}
	}

	@Override
	public boolean deveUsarMaximaTaxacao(Orcamento or) {
		
		return false;
	}

	@Override
	protected double maximaTaxacao(Orcamento or) {
		
		return or.getValor() + calculo(or) + calculaOutroImposto(or);
	}

	@Override
	protected double minimaTaxacao(Orcamento or) {
		
		return or.getValor() + calculo(or) + calculaOutroImposto(or);
	}

	
	
	

}
