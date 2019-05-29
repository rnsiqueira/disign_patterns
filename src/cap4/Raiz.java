package cap4;

public class Raiz implements Expressao{
	
	
	
	private Expressao expressao;
	private Expressao esquerda;
	private Expressao direita;
	

	public Raiz(Expressao expressao) {
	
		this.expressao = expressao;
		
	}

	@Override
	public double avalia() {
		
		return (double) Math.sqrt(expressao.avalia());
	}

	@Override
	public void Aceita(ImpressoraVisita impressora) {
		impressora.visitaRaiz(this);
		
	}
	
	public Expressao getExpressao() {
		return expressao;
	}
	
	public Expressao getEsquerda() {
		return esquerda;
	}
	
	public Expressao getDireita() {
		return direita;
	}
	
	
}
