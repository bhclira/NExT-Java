package classes; // nome da pasta minúscula

// classe
public class Agenda {
    
    public String nome = "gerson";
    public int telefoneCliente;
    private String email;
    public int idade;

    public void imprimeMensagem() {
        System.out.println(this.idade);
    }

    public void outroMetodo(){
        System.out.println(this.idade);
    }
    public int retornaValor() {
        return 10;
    }

    public String retornaNome() { // getter
        return this.nome;
    }

    public void alteraNome(String novoNome) { //setter
        this.nome = novoNome;
    } 


    // modificadores de acesso
    // public, private ...

    //
    

}