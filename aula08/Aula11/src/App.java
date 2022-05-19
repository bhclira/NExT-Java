import Exercicios.Retangulo;

import java.util.Scanner;

import Exercicios.Quadrilatero;

public class App {
    public static void main(String[] args) throws Exception {
       
        Retangulo retangulo1 = new Retangulo(4.1f, 5.0f);
        Retangulo retangulo2 = new Retangulo(1.5f , 5.0f);

        System.out.println(retangulo1.calcularArea());
        System.out.println(retangulo1.calcularPerimetro());

        System.out.println(retangulo2.calcularArea());
        System.out.println(retangulo2.calcularPerimetro());

    }
}
