/**
 * No método main implemente um programa que possui três 
 * variáveis locais: x, y e z e em seguida imprime os números
 * em ordem crescente.
 */ 

 public class a3ex2 {
    public static void main(String[] args) throws Exception {

        int x = 2;
        int y = 1;
        int z = 10;

        if (x>y && y>z){
            System.out.println(z + y + x);
        
        } else if (x>y && y<z){
            System.out.println(y + z + x);

        } else{
            System.out.println(z + x + y);
        }
        
    }
}
