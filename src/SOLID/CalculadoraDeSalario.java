package SOLID;

public class CalculadoraDeSalario implements Calculadora{
			
	
	
	public double calcula(Funcionario funcionario) {
		
		return  funcionario.getCargo().getCalculadora().calcula(funcionario);
	}

}
