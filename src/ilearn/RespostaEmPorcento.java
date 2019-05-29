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
			// n�o existe pr�xima na corrente, e ningu�m atendeu a requisi��o!
			// poder�amos n�o ter feito nada aqui, caso n�o fosse necess�rio!
			throw new RuntimeException("Formato de resposta n�o encontrado");
		}

	}
	
	public RespostaEmPorcento() {
		this.outra = null;
	}

	@Override
	public void setProximo(Resposta resposta) {
		

	}

}
