package cap4;

public class Div implements Expressao{
	
	private Expressao esquerda;
	private Expressao direita;

	public Div(Expressao esquerda, Expressao direita) {
		this.esquerda = esquerda;
		this.direita = direita;
		
	}

	@Override
	public double avalia() {
		double resquerda = esquerda.avalia();
		double rdireita = direita.avalia();
		return resquerda / rdireita;
	}

	@Override
	public void Aceita(ImpressoraVisita impressora) {
		impressora.visitaDiv(this);
		
	}
	
	public Expressao getEsquerda() {
		return esquerda;
	}
	
	public Expressao getDireita() {
		return direita;
	}
	
	

}
