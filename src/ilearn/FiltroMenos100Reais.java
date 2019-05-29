package ilearn;

import java.util.ArrayList;
import java.util.List;

public class FiltroMenos100Reais extends Filtro {

	public FiltroMenos100Reais(Filtro outroFiltro) {
		super(outroFiltro);
	}

	public FiltroMenos100Reais() {
		super();
	}

	@Override
	public List<Conta> filtra(List<Conta> contas) {
		List<Conta> filtrada = new ArrayList<Conta>();
		for (Conta c : contas) {
			if (c.getSaldo() < 100) 
				filtrada.add(c);

		}
		filtrada.addAll(proximo(contas));
		return filtrada;
	}

}
