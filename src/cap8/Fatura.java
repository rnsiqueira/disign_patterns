package cap8;

public class Fatura {
	
	
	private Cliente c;
	private double valor;

	public Fatura(Cliente c, double valor) {
		this.c = c;
		this.valor = valor;
		
	}
	
	public double getValor() {
		return valor;
	}
	
	public Cliente getC() {
		return c;
	}

}
