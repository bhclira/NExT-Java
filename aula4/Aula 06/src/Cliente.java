public class Cliente {
    private String nome;
    private double saldo;
    private String cpf;
    private String conta;
    
    public String getNome() {
        return nome;
    }
    public String getConta() {
        return conta;
    }
    public void setConta(String conta) {
        this.conta = conta;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
}
