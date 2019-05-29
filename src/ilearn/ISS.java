package ilearn;

public class ISS extends Imposto {

	public ISS(Imposto outroImposto) {
		super(outroImposto);
	}

	public ISS() {
		super();
	}

	@Override
	public double calculo(Orcamento orcamento) {

		return orcamento.getValor() * 0.06 + calculaOutroImposto(orcamento);
	}

}
