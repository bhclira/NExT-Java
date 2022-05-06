
import classes.Agenda;

public class App {
    public static void main(String[] args) throws Exception {
        Agenda ag = new Agenda();

        ag.idade = 80;

        ag.imprimeMensagem();

        int valorRetornado = ag.retornaValor();
        System.out.println(valorRetornado);

        



    }
}
