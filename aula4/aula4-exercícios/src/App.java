/*
Crie um novo projeto.
● Crie uma classe Cliente contendo como
atributos públicos o cpf e o nome do cliente.
● Na classe App, crie um objeto do tipo Cliente
e teste o acesso aos atributos de um objeto
cliente.
*/
import classes.Cliente;

public class App {
    public static void main(String[] args) throws Exception {
        Cliente cl = new Cliente();

        cl.cpf = "87902753491";
        cl.nome = "Brenoman";

        cl.visualizarNome();
        cl.visualizarCpf();

    }
}

