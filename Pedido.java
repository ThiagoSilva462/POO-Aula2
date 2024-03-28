package model;

import model.ItemPedido;

public class Pedido {
	
	private int numeroNota;
	private double valorTotal;
	private ItemPedido item;
	
	public Pedido() {

	}

	public int getNumeroNota() {
		return numeroNota;
	}

	public void setNumeroNota(int numeroNota) {
		this.numeroNota = numeroNota;
	}

	public double getValorTotal() {
		return valorTotal;
	}
	
	public String adicionaItem(ItemPedido item) {
		this.item = item;
		return "Item adicionado";
	}

}
