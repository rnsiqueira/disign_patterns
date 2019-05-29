package cap4;

public class Soma implements Expressao {

	private Expressao esquerda;
	private Expressao direita;

	public Soma(Expressao esquerda, Expressao direita) {
		this.esquerda = esquerda;
		this.direita = direita;

	}

	@Override
	public double avalia() {
		double resquerda = esquerda.avalia();
		double rdireita = direita.avalia();
		return resquerda + rdireita;
	}

	@Override
	public void Aceita(ImpressoraVisita impressora) {
		impressora.visitaSoma(this);

	}
	
	public Expressao getEsquerda() {
		return esquerda;
	}
	
	public Expressao getDireita() {
		return direita;
	}

}
