package SOLID;

import java.util.List;

public class GeradorDeNotaFiscal {

	private List<GeradorExecucoes> acoes;

	public GeradorDeNotaFiscal(List<GeradorExecucoes> acoes) {
		this.acoes = acoes;

	}

	public NotaFiscal gera(Fatura fatura) {

		double valor = fatura.getValor();

		NotaFiscal nf = new NotaFiscal(valor, impostoSimplesSobreO(valor));

		for (GeradorExecucoes acao : acoes) {
			acao.executa(nf);
		}
		return nf;
	}

	private double impostoSimplesSobreO(double valor) {
		return valor * 0.06;
	}

}
