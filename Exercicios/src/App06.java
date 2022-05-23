/**
 Leia 2 valores de ponto flutuante de dupla precisão A e B, que correspondem a 2 notas de um aluno. A seguir, calcule a média do aluno, sabendo que a nota A tem peso 3.5 e a nota B tem peso 7.5 (A soma dos pesos portanto é 11). Assuma que cada nota pode ir de 0 até 10.0, sempre com uma casa decimal.

Entrada
O arquivo de entrada contém 2 valores com uma casa decimal cada um.

Saída
Imprima a mensagem "MEDIA" e a média do aluno conforme exemplo abaixo, com 5 dígitos após o ponto decimal e com um espaço em branco antes e depois da igualdade. Utilize variáveis de dupla precisão (double) e como todos os problemas, não esqueça de imprimir o fim de linha após o resultado, caso contrário, você receberá "Presentation Error".

 */

import java.util.Scanner;

public class App06 {
    public static void main (String [] args) throws Exception {
        
        Scanner ler = new Scanner (System.in);

        double a, b, media;

        System.out.print(""); // "A=%3.1f"
        a = ler.nextDouble();
        System.out.printf("%3.1f\n", a);
   
        
        System.out.print("");
        b = ler.nextDouble(); // "A=%3.1f"
        System.out.printf("%3.1f\n", b);
        
        media = (((a*3.5) + (b*7.5)) / (11.0));

        System.out.println();
        System.out.printf("MEDIA=%6.5f\n", media); // "MEDIA=%6.5\n"
 
    }
    
}
