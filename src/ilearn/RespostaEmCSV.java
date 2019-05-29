package ilearn;

public class RespostaEmCSV implements Resposta{
	private Resposta outras;

	@Override
	public void responde(Requisicao req, Conta conta) {
		if(req.getFormato() == Formato.CSV) {
			System.out.println(conta.getTitular() + "," + conta.getSaldo());
		}
		
		else {
			outras.responde(req, conta);
		}
		
	}

	@Override
	public void setProximo(Resposta resposta) {
		this.outras = resposta;
		
	}
	

}
