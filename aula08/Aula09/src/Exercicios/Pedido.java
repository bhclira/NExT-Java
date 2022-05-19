package Exercicios;

import java.util.ArrayList;

public class Pedido {

    private double valorTotal;
    private ArrayList<ItemPedido> listaPedidos;

    public Pedido() {
        this.listaPedidos = new ArrayList<ItemPedido>();
    }
    public void adicionarItem(ItemPedido item) {
        this.listaPedidos.add(item);

    }

    public double obterTotal() {
        double total = 0;
        
        return valorTotal;
    }

    
}
