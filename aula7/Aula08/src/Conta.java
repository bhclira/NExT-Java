public class Conta {
    /*
    
    saldo
    numero
    agencia
    tipoConta
    */

    private float saldo;
    private int numeroDaConta;
    private String Banco;
    private String tipo;
   
   // getters and setters 
    public float getSaldo() {
        return saldo;
    }
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    public int getNumeroDaConta() {
        return numeroDaConta;
    }
    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }
    public String getBanco() {
        return Banco;
    }
    public void setBanco(String banco) {
        Banco = banco;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}
