package ilearn;

public class RespostaEmPorcento implements Resposta {
	private Resposta outra;

	@Override
	public void responde(Requisicao req, Conta conta) {
		if (req.getFormato() == Formato.PORCENTO) {
			System.out.println(conta.getTitular() + '%' + conta.getSaldo());
		} else if (outra != null) {
			outra.responde(req, conta);
		} else {
			// não existe próxima na corrente, e ninguém atendeu a requisição!
			// poderíamos não ter feito nada aqui, caso não fosse necessário!
			throw new RuntimeException("Formato de resposta não encontrado");
		}

	}
	
	public RespostaEmPorcento() {
		this.outra = null;
	}

	@Override
	public void setProximo(Resposta resposta) {
		

	}

}
