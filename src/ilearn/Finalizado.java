package ilearn;

public class Finalizado implements EstadoDeUmOrcamento {

	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {
		// TODO Auto-generated method stub

	}

	@Override
	public void aprova(Orcamento orcamento) {
		throw new RuntimeException("O Orçamento já se encontra no estado finalizado!");

	}

	@Override
	public void reprova(Orcamento orcamento) {
		throw new RuntimeException("O Orçamento já se encontra no estado finalizado!");

	}

	@Override
	public void finaliza(Orcamento orcamento) {
		throw new RuntimeException("O Orçamento já se encontra no estado finalizado!");

	}

}
