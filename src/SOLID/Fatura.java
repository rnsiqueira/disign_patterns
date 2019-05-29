package SOLID;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Fatura {

	private String nomeCliente;
	private String produto;
	private double valor;
	private boolean pago;
	List<Pagamento> pagamentos;

	public Fatura() {
		// TODO Auto-generated constructor stub
	}
	
	public Fatura(double valor) {
		this.valor = valor;
		this.pago = false;
	}
	
	public Fatura(String nomeCliente, String produto, double valor) {
		this.nomeCliente = nomeCliente;
		this.produto = produto;
		this.valor = valor;
		this.pago = false;

	}

	public double getValor() {
		return valor;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public String getProduto() {
		return produto;
	}

	public void add(Pagamento pagamento) {
		pagamentos =  new ArrayList<Pagamento>();
		pagamentos.add(pagamento);
		
		if(totalpago()>=valor) {
			Pagar();
		}
		
	
		
		
		
	}

	private double totalpago() {
		double total = 0;
		for (Pagamento pagamento : pagamentos) {
			total += pagamento.getValor();
		}

		return total;
	}
	
	public boolean getPago() {
		return pago;
	}
	
	public List<Pagamento> getPagamentos() {
		Collections.unmodifiableList(pagamentos);
		return pagamentos;
	}
	
	
	public void Pagar() {
		pago = true;
	}
	

}
