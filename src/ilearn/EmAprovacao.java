package ilearn;

public class EmAprovacao  implements EstadoDeUmOrcamento{
	
	private boolean descontoAplicado = false;

	@Override
	public void aplicaDescontoExtra(Orcamento orcamento) {
		if(!descontoAplicado) {
			orcamento.valor -= orcamento.valor * 0.05;
			descontoAplicado = true;
		}
		else {
			throw new RuntimeException("Desconto j� aplicado!");
		}
		
		
	}

	@Override
	public void aprova(Orcamento orcamento) {
		orcamento.estadoAtual = new Aprovado();
		
	}

	@Override
	public void reprova(Orcamento orcamento) {
		orcamento.estadoAtual = new Reprova();
		
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		throw new RuntimeException("Or��omento em aprova��o!");
		
	}
	
	

}
