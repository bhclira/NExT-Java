public class Veiculo { 
        
    public String marca;
    public String modelo;
        
    public void mostrarValores() {
        System.out.println(marca);
        System.out.println(modelo);
    }
        
    public Veiculo(String marca, String modelo) { 
        super();
        this.marca = marca;
        this.modelo = modelo;
    }
        
    public String getMarca() {
        return marca;
    }
        
    public void setMarca(String marca) {
        this.marca = marca;
    }
        
    public String getModelo() {
        return modelo;
    } 
        
    public void setModelo(String modelo) {
        this.modelo = modelo; 
    }
}
