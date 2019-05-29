package ilearn;

public class IKCV extends TemplateImpostos {
	
	public IKCV(Imposto orcamento) {
		super(orcamento);
	}
	
	public IKCV() {
		super();
	}

	@Override
	public double calculo(Orcamento orcamento) {

		return 0;
	}

	@Override
	public boolean deveUsarMaximaTaxacao(Orcamento or) {

		return or.getValor() > 500 && temItemMaior100Reais(or);
	}

	private boolean temItemMaior100Reais(Orcamento or) {
		for(Itens item : or.getItens()) {
			if(item.getValor() > 100) 
				return true;
			}
			return false;
			
		
	
	}

	@Override
	public double maximaTaxacao(Orcamento or) {
		
		return or.getValor() * 0.10 + calculaOutroImposto(or);
	}

	@Override
	public double minimaTaxacao(Orcamento or) {
		
		return or.getValor() * 0.6 + calculaOutroImposto(or);
	}

}
