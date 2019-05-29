package ilearn;

public class ImpostoMuitoAlto extends Imposto{
	
	public  ImpostoMuitoAlto(Imposto outroImposto) {
		super(outroImposto);
	}
	
	 public ImpostoMuitoAlto() {
		super();
	}

	@Override
	public double calculo(Orcamento orcamento) {
		
		return orcamento.getValor() * 0.2 + calculaOutroImposto(orcamento);
	}



}
