package cap7;

public class Item {

	private String nomeProduto;
	private double valor;

	public Item(String nomeProduto, double valor) {
		this.nomeProduto = nomeProduto;
		this.valor = valor;

	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Produto: "+ nomeProduto + " Valor: " + valor ;
	}

}
