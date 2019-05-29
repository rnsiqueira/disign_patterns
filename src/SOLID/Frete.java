package SOLID;

public class Frete implements InterfaceFretes{
	
	
	 public double executa(Compra produto) {
	        if("SAO PAULO".equals(produto.getEndereco().toUpperCase())) {
	            return 15;
	        }
	        return 30;
	    }

}
