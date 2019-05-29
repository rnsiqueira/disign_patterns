package SOLID;

public class Pagamento {
	
	private double valor;
	private MeioDePagamento tipo;
	
	public Pagamento(double valor, MeioDePagamento tipo) {
		
		this.valor = valor;
		this.tipo = tipo;
	}
	
	
	public double getValor() {
		return valor;
	}
	
	public MeioDePagamento getTipo() {
		return tipo;
	}

}
