package SOLID;

public class ManipuladorDeSaldo {

	private double saldo;

	public void saca(double valor) {
		if (this.saldo >= valor)
			this.saldo -= valor;
		else {
			throw new IllegalArgumentException("Conta não possuí o valor de Saque!");
		}
	}

	public void deposita(double valor) {
		this.saldo += valor;
	}

	public void rende(double valor) {
		this.saldo *= valor - 0.1;
	}

	public double getSaldo() {
		return saldo;
	}

}
