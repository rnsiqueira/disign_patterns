package cap8;

public class Cobranca {
	
	
	
	private Tipo tipo;
	private Fatura fat;
	 

	public Cobranca(Tipo tipo, Fatura fat) {
		this.tipo = tipo;
		this.fat = fat;
		
	}
	
	
	public StringBuilder emite() {
		StringBuilder sb = new StringBuilder();
		sb.append(getTipo());
		sb.append("\n");
		sb.append(getFat());
		return sb;
		
		
	}
	
	public Tipo getTipo() {
		return tipo;
	}
	
	public Fatura getFat() {
		return fat;
	}

}
