package cap7;

public class TestProcessaPedidos {

	public static void main(String[] args) {

		Pedido p1 = new Pedido("Rafael N Siqueira");
		p1.inserirItem(new Item("Iphone 8", 7000));
		p1.inserirItem(new Item("Mac Pro", 12000));
		p1.inserirItem(new Item("Roupas", 3000));

		Pedido p2 = new Pedido("Jonas Profeta");
		p2.inserirItem(new Item("Cavalo", 5000));
		p2.inserirItem(new Item("Zebra", 400));
		p2.inserirItem(new Item("Batina", 120));

		FilaDePedidos fp = new FilaDePedidos();

		fp.addComando(new PagaPedido(p1));
		fp.addComando(new PagaPedido(p2));
		
		fp.addComando(new ConcluiPedido(p2));

		fp.processaComandos();

		System.out.println(p1.getClienteNome() + " " + p1.getItens() + " " + p1.getStatus());
		System.out.println(p2.getClienteNome() + " " + p2.getItens() + " " + p2.getStatus());

	}

}
