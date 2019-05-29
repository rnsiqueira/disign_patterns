package SOLID;

import java.util.List;

public class ProcessadorDeBoleto {

	public void processa(List<Boleto> boletos, Fatura fatura) {
		
		for (Boleto boleto : boletos) {
			
			fatura.add(new Pagamento(boleto.getValor(), MeioDePagamento.BOLETO));
			
			
		}

	}

}
