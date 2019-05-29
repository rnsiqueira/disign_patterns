package cap3;

import java.util.Calendar;

public class Contrato {
	
	private Calendar data;
	private String nome;
	private EstadoDoContrato estado;
	public Contrato(Calendar data, String nome, EstadoDoContrato estado) {
		
		this.data = data;
		this.nome = nome;
		this.estado = estado;
		
	}
	
	public Calendar getData() {
		return data;
	}

	public String getNome() {
		return nome;
	}

	public EstadoDoContrato getEstado() {
		return estado;
	}

	public void avanca() {
		if(estado == estado.Novo) estado = estado.Em_Andamento;
		else if(estado == estado.Em_Andamento) estado = estado.Aprovado;
	}
	
	public Estado salvaEstado() {
		return new Estado(new Contrato(data, nome, estado));
	}
	
	public void restaura(Estado estado) {
		this.data = estado.getContrato().data;
		this.nome = estado.getContrato().nome;
		this.estado = estado.getContrato().estado;
	}
	
	

}
