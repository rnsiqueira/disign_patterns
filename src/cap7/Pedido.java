package cap7;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Pedido {

	private String clienteNome;
	private Item item;
	private statusPedido status;
	private List<Item> itens;
	private Calendar dataFinaliza;

	public Pedido(String clienteNome) {

		this.clienteNome = clienteNome;
		this.itens = new ArrayList<Item>();
		status = statusPedido.Novo;

	}

	public void inserirItem(Item item) {
		itens.add(item);
	}

	
	
	public void paga() {
		status = statusPedido.Pago;
	}
	
	public void finaliza() {
		status = statusPedido.Entregue;
		dataFinaliza = Calendar.getInstance();
	}

	public String getClienteNome() {
		return clienteNome;
	}

	public Item getItem() {
		return item;
	}

	public statusPedido getStatus() {
		return status;
	}

	public List<Item> getItens() {
		return itens;
	}

	public Calendar getDataFinaliza() {
		return dataFinaliza;
	}
	
	

}
