package SOLID;

public class ContaEstudante  extends ContaComum{

	private ManipuladorDeSaldo operador;
	private int milhas;

	public ContaEstudante() {
		operador = new ManipuladorDeSaldo();
		milhas = 0;
		
	}

	public void saca(double valor) {
		operador.saca(valor);
		this.milhas += (int) valor * 0.3;
	}

	public void deposita(double valor) {
		operador.deposita(valor);
		this.milhas += (int) valor * 0.2;
	}
	
	public double getSaldo() {
		return operador.getSaldo();
	}
	
	public int getMilhas() {
		return milhas;
	}

}
