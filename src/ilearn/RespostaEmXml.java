package ilearn;

public class RespostaEmXml implements Resposta {

	private Resposta outraresposta;

	@Override
	public void responde(Requisicao req, Conta conta) {
		if (req.getFormato() == Formato.XML) {
			System.out.println("<conta><titular>" + conta.getTitular() + "</titular><saldo>" + conta.getSaldo()
					+ "</saldo></conta>");

		}

		else {
			outraresposta.responde(req, conta);
		}

	}

	@Override
	public void setProximo(Resposta resposta) {
		this.outraresposta = resposta;

	}

}
