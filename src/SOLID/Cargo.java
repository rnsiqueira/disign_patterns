package SOLID;

public enum Cargo{
	
	DESENVOLVEDOR(new DezOuVintePorcento()),
    DBA(new DezOuVintePorcento()),
    TESTER(new QuinzeOuVinteCincoPorcento());

	private Calculadora calculadora;

	private Cargo(Calculadora calculadora) {
		this.calculadora = calculadora;
		// TODO Auto-generated constructor stub
	}
	
	public Calculadora getCalculadora() {
		// TODO Auto-generated method stub
		return calculadora;
	}

}
