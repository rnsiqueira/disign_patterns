package ilearn;

public class ICMS extends Imposto {
	
	public ICMS(Imposto outroImosto) {
		super(outroImosto);
	}
	
	public ICMS() {
		super();
	}

	@Override
	public double calculo(Orcamento orcamento) {

		return orcamento.getValor() * 0.1 + calculaOutroImposto(orcamento);
	}

	

}
