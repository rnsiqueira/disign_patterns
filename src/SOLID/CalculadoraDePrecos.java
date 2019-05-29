package SOLID;

public class CalculadoraDePrecos {
	
	private Compra produto;

	public CalculadoraDePrecos(Compra produto) {
		this.produto = produto;
		
	}
	
	public double calcula(Descontos desc, InterfaceFretes fretes) {
       

      
		

        return produto.getValor() * (1-desc.executa(produto)) + fretes.executa(produto);
    }

}
