package cap3;

import java.util.Calendar;

public class ProgramaContratos {

	public static void main(String[] args) {
		HistoricoEstado he = new HistoricoEstado();

		Contrato contrato = new Contrato(Calendar.getInstance(), "Provedor Net", EstadoDoContrato.Novo);
		
		

		he.adiciona(contrato.salvaEstado());

		contrato.avanca();
		he.adiciona(contrato.salvaEstado());

		Estado en = he.pega(0);
		
		System.out.println(en.getContrato().getEstado());
		
	
		
		
	}

}
