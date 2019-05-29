package SOLID;

public class TabelaDePrecoPadrao implements Descontos{

	public double executa(Compra produto) {
		if (produto.getValor() > 5000)
			return 0.03;
		if (produto.getValor() > 1000)
			return 0.05;
		return 0;

	}

}
