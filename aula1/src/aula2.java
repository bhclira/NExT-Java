/**
    * @author: Breno
    * @version: 1.0.1
    * @todo: Print Hello World
*/

public class aula2 {
    public static void main(String[] args) throws Exception {
        // decla de variáveis - primitivos
        int numeroInteiro = 8; // o bits dentro da memoria
        float numeroFlutuante = 2.1f;
        double numeroDouble = 2.1231; //usual
        char caracter = 'L';
        // type_variable nomeVariavel;
        String str = "Luiz Francisco - Prof";
        // atribuição dados var
        numeroInteiro = 45;
        
        // operadores aritméticos
        // soma = 1 + 1;
        // '+ - / %'''
        // resto = 1%1

        String mensagem = "valores numero inteiro" + numeroInteiro+"numero flutuante"+numeroFlutuante;

        System.out.println(mensagem);

        // operadores logicos
        System.out.println(1==1);
        // == , > e <, >= e <=, !=
        // && (and)
        // || (or)
        // !(not)

        int contador = 0;
        while (contador<5){
            // bloco
            System.out.println("Contador: "+ contador);
            contador++;

        }
        // 2
        contador = 0;
        do{
            System.out.println("Contador: "+ contador);
            contador++
        }while(contador<5)

        //3 laço for(a=0;a<5;a++)
        for(contador=0;contador<5;contador++){
            System.out.println("Contador for: "+contador);
        }
        //
        switch(caracter){
            case 'L': System.out.println("Luiz"); break;
            case 'G': System.out.println("Gerson"); break;
            default: System.out.println("Opção Incorreta");
        }

        // operador ternario
        boolean validacao = contador==5?true:false;
        mensagem = contador==5?"valido":"invalido";



        System.out.println("Hello, World!");

    }
    

    // java doc padrão - antes da classe
    
}