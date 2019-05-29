package cap7;

import java.util.ArrayList;
import java.util.List;

public class FilaDePedidos {
	
	List<Comando> comandos;
	
	public FilaDePedidos() {
		comandos = new ArrayList<Comando>();
	}
	
	public void addComando(Comando comando) {
		comandos.add(comando);
	}
	
	public void processaComandos() {
		for (Comando comando : comandos) {
			comando.executa();
		}
	}
}
