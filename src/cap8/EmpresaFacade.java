package cap8;

public class EmpresaFacade {
	
	
	public Cliente buscaCliente(String cpf) {
		return new ClienteDao().buscaPorCpf(cpf);
	}
	
	public Fatura criaFatura(Cliente cliente, double valor) {
		Fatura fat = new Fatura(cliente, valor);
		return fat;
	}
	
	public Cobranca geraCobrancao(Fatura fat) {
		Cobranca cobranca = new Cobranca(Tipo.Boleto, fat);
		cobranca.emite();
		return cobranca;
	}
	
	public ContatoCliente fazContato(Cliente cliente, Cobranca cobranca) {
		ContatoCliente cc = new ContatoCliente(cliente, cobranca);
		cc.enviar();
		
		return cc;
	}

}
