public class DVD extends Midia{
    
    private int nFaixas;

    public DVD() {
        super();

    }

    public int getnFaixas() {
        return nFaixas;
    }

    public void setnFaixas(int nFaixas) {
        this.nFaixas = nFaixas;
    }

    public DVD(int c, double p, String s, int f) {
        super(c, p, s);
        this.setnFaixas(f);

    }

    @Override
    public String getTipo(){
        return "DVD";
    }

    @Override
    public String getDetalhes() {
        return "Info: " 
        + super.getDetalhes()
        + this.getnFaixas();
    }

    @Override
    public void inserirDados() {
        
    }
   
}
