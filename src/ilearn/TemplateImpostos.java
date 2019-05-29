package ilearn;

public abstract class TemplateImpostos extends Imposto  {
	
	public TemplateImpostos(Imposto outroImposto) {
		super(outroImposto);
	}
	
	public TemplateImpostos() {
		super();
	}

	public final double Calcula(Orcamento or) {
		if (deveUsarMaximaTaxacao(or)) {
			return maximaTaxacao(or);
		}

		else {
			return minimaTaxacao(or);
		}
	}

	protected abstract boolean deveUsarMaximaTaxacao(Orcamento or);

	protected abstract double maximaTaxacao(Orcamento or);

	protected abstract double minimaTaxacao(Orcamento or);

}
