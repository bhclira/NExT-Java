public class CD extends Midia{
    private int nMusicas;

    public CD() {
        super();
    }

    public CD (int c, double p, String n, int m){
        super(c, p, n);
        this.nMusicas = m;

    }
    @Override
    public String getTipo() {
        return "CD";
    }

    @Override
    public String getDetalhes() {
        return super.getDetalhes()
        + this.getnMusicas
    }
}
