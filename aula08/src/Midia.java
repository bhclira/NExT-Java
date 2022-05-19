public class Midia {
    private int codigo;
    private double preco;
    private String nome;

    public Midia() {

    }

    public Midia (int c, double p, String n) {
        this.codigo = c;
        this.preco = p;
        this.nome = n;
    }

    public String getTipo () {
        return "Midia";
    }
    
    public String getDetalhes() {
        return "info: " + this.codigo + ", " + this.preco + ", " + this.nome;

    }

    public Void printDados () {
        System.out.println(this.getTipo() + this.getDetalhes());

    }

    public void inserirDados() {
        
        Scanner input = new Scanner(system.in);
        
        System.out.println("Insira um Codigo: ");
        this.codigo = input.nextInt();

    }
}
