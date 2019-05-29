package ilearn;

public class Aprovado implements EstadoDeUmOrcamento {
	private boolean descontoAplicado = false;

	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {
		if (!descontoAplicado) {
			orcamento.valor -= orcamento.valor * 0.02;
			descontoAplicado = true;
		}

		else {
			throw new RuntimeException("desconto j� foi aplicado!");
		}
	}

	@Override
	public void aprova(Orcamento orcamento) {
		throw new RuntimeException("O Or�amento j� est� no esdo aprovado");

	}

	@Override
	public void reprova(Orcamento orcamento) {
		throw new RuntimeException("O Or�amento j� foi aprovado");

	}

	@Override
	public void finaliza(Orcamento orcamento) {
		orcamento.estadoAtual = new Finalizado();

	}

}
