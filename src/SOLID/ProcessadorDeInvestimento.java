package SOLID;

import java.util.Arrays;
import java.util.List;

public class ProcessadorDeInvestimento {

	public static void main(String[] args) {

		

		for (ContaComum conta : contasDoBanco()) {
			new ManipuladorDeSaldo().rende(conta.getSaldo());

			System.out.println("Novo Saldo:");
			System.out.println(conta.getSaldo());
		}
	}

	private static List<ContaComum> contasDoBanco() {
		return Arrays.asList(umaContaCom(100), umaContaCom(150), contaDeEstudanteCom(200));
	}

	private static ContaComum contaDeEstudanteCom(double amount) {
		ContaEstudante c = new ContaEstudante();
		c.deposita(amount);
		return c;
	}

	private static ContaComum umaContaCom(double valor) {
		ContaComum c = new ContaComum();
		c.deposita(valor);
		return c;
	}

}
