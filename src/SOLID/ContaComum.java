package SOLID;

public class ContaComum {

	private ManipuladorDeSaldo operador;

	public ContaComum() {
		operador = new ManipuladorDeSaldo();
	}

	public void deposita(double valor) {
		operador.deposita(valor);
	}

	public double getSaldo() {
		return operador.getSaldo();
	}
	
	public void saca(double valor) {
		operador.saca(valor);
	}

	public void rende(double valor) {
		operador.rende(valor);
	}
}
