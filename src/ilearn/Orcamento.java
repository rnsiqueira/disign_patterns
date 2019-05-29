package ilearn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Orcamento {
	
	
	
	public Double valor;
	private List<Itens> itens;
	public EstadoDeUmOrcamento estadoAtual;
	
	public Orcamento() {
		this.estadoAtual = new EmAprovacao();
	}
	
	public void aplicaDescontoExtra() {
		estadoAtual.aplicaDescontoExtra(this);
	}
	
	public void aprova() {
		estadoAtual.aprova(this);
	}
	
	public void reprova() {
		estadoAtual.reprova(this);
	}
	
	public void finaliza() {
		estadoAtual.finaliza(this);
	}

	public Double getValor() {
		return valor;
	}

	public Orcamento(Double valor) {
		this.valor = valor;
		this.itens = new ArrayList<Itens>();
	}
	
	public List<Itens> getItens() {
		return Collections.unmodifiableList(itens);
	}
	
	public void addItens(Itens i) {
		itens.add(i);
	}

}
