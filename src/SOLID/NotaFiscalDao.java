package SOLID;

public class NotaFiscalDao implements GeradorExecucoes{

	public void executa(NotaFiscal nf) {
		System.out.println("Salva no no BD a Nota: " + nf.getNota());
	}

}
