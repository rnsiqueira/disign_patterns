package ilearn;

public class DescontoPorMaisDeQuinhentosReais implements Desconto{
	
	private Desconto proximo;

	@Override
	public double desconta(Orcamento or) {
		if(or.getValor() >= 500) {
			return or.getValor() * 0.07;
		}
		else {
			return proximo.desconta(or);
		}
	}

	@Override
	public void setProximo(Desconto proximo) {
		this.proximo = proximo;
		
	}
	
	

}
