package cap4;

public class ImpressoraVisita {
	
	public void visitaSoma(Soma soma) {
		System.out.print("(");
		
		soma.getEsquerda().Aceita(this);
		
		System.out.print("+");
		
		soma.getDireita().Aceita(this);
		
		System.out.print(")");
	}
	
	public void visitaSub(Sub sub) {
		System.out.print("(");
		
		sub.getEsquerda().Aceita(this);
		
		System.out.print("+");
		
		sub.getDireita().Aceita(this);
		
		System.out.print(")");
	}
	
	public void visitaDiv(Div div) {
		System.out.print("(");
		
		div.getEsquerda().Aceita(this);
		
		System.out.print("+");
		
		div.getDireita().Aceita(this);
		
		System.out.print(")");
	}
	
	public void visitaMult(Mult mult) {
		System.out.print("(");
		
		mult.getEsquerda().Aceita(this);
		
		System.out.print("+");
		
		mult.getDireita().Aceita(this);
		
		System.out.print(")");
	}
	
	public void visitaRaiz(Raiz raiz) {
		
		
		System.out.print("Raiz");
	
		
		raiz.getExpressao().Aceita(this);
		
	}
	
	public void visitaNumero(Numero numero) {
		System.out.print(numero.getNumero());
	}

}
