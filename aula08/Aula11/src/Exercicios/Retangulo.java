package Exercicios;

public class Retangulo extends Quadrilatero {
    
    private float lado;
    private float altura;
   
    public Retangulo(float lado, float altura) {
        this.lado = lado;
        this.altura = altura;      
    }
   
    @Override
    public float calcularArea() {
        return this.lado * this.altura;
    }
    
    @Override
    public float calcularPerimetro() {
        return (2*(this.lado + this.altura));
    }
    
}
