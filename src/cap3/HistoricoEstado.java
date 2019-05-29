package cap3;

import java.util.ArrayList;
import java.util.List;

public class HistoricoEstado {
	
	List<Estado> historicoEstado = new ArrayList<Estado>();
	
	
	public  Estado pega(int index) {
		
		return historicoEstado.get(index);
	}
	
	public void adiciona(Estado estado) {
		historicoEstado.add(estado);
	}

}
