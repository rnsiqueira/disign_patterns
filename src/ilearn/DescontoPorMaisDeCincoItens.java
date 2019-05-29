package ilearn;

public class DescontoPorMaisDeCincoItens implements Desconto {
	
	private Desconto proximo;

	public double desconta(Orcamento or) {
		if(or.getItens().size() > 5) {
			return or.getValor() * 0.1;
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
