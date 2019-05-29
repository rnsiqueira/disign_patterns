package ilearn;

public class ICPP extends TemplateImpostos {
	
	
	public ICPP(Imposto outroImposto) {
		super(outroImposto);
	}
	
	
	public ICPP() {
		super();
	}
	@Override
	public boolean deveUsarMaximaTaxacao(Orcamento or) {

		return or.getValor() >= 500;
	}

	@Override
	public double maximaTaxacao(Orcamento or) {

		return or.getValor() * 0.07 + calculaOutroImposto(or);
	}

	@Override
	public double minimaTaxacao(Orcamento or) {

		return or.getValor() * 0.05 + calculaOutroImposto(or);
	}

	@Override
	public double calculo(Orcamento orcamento) {
		// TODO Auto-generated method stub
		return 0;
	}

	
	

}
