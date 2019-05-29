package SOLID;

public class NotaFiscal {

	private double valor;
	private double imposto;

	public NotaFiscal(double valor, double imposto) {
		this.valor = valor;
		this.imposto = imposto;
		// TODO Auto-generated constructor stub
	}

	public StringBuilder getNota() {

		StringBuilder sb = new StringBuilder();
		sb.append("Valor da Nota: " + valor + "\n");
		sb.append("valor do Imposto: " + imposto);

		return sb;
	}

}
