package ilearn;

public class DescontoPorVendaCasada implements Desconto {
	
	private Desconto proximo;

	@Override
	public double desconta(Orcamento or) {
		if(aconteceuVendaCasadaEm(or)) return or.getValor() * 0.05;
		return proximo.desconta(or);
	}
	
	private boolean exite(String nomeItem, Orcamento orcamento) {
		for(Itens item : orcamento.getItens()) {
			if(item.getNome().equals(nomeItem)) return true;
			
			
			}
		
			return false;
		
	}
	
	private boolean aconteceuVendaCasadaEm(Orcamento orcamento) {
		return exite("Caneta", orcamento) && exite("Lapis", orcamento);
	}
	

	@Override
	public void setProximo(Desconto proximo) {
		this.proximo = proximo;
		
	}

}
