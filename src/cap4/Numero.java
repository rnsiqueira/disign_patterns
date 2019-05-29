package cap4;

public class Numero implements Expressao{
	private double numero;

	 public Numero(double numero) {
		this.numero = numero;
	
	}
	
	@Override
	public double avalia() {
		
		return numero;
	}

	@Override
	public void Aceita(ImpressoraVisita impressora) {
		impressora.visitaNumero(this);
		
	}
	
	public double getNumero() {
		return numero;
	}

}
