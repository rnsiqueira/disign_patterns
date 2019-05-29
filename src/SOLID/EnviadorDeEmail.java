package SOLID;

public class EnviadorDeEmail implements GeradorExecucoes{

	public void executa(NotaFiscal nf) {
		System.out.println("Envia nota: " + nf.getNota());
	}

}
