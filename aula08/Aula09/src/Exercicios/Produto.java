package Exercicios;

public class Produto {
    
    private int codigo;
    private double valor;
    private String descricao;

    public Produto criarItem(int c, double v, String d) {
        this.codigo = c;
        this.valor = v;
        this.descricao = d;
    }
}