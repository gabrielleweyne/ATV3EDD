import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        // EXERCÍCIO 1
        ArrayList<Integer> servidores = new ArrayList<>();

        servidores.add(30);
        servidores.add(25);
        servidores.add(40);
        servidores.add(20);
        servidores.add(35);
        servidores.add(50);
        servidores.add(45);

        int dias = Exercicio1.resolucao(servidores);

        System.out.println("Dias: " + dias);

        // EXERCÍCIO 2

        int vencedor = Exercicio2.resolucao(3, 5);
        System.out.println("Vencedor: " + vencedor);

        // EXERCÍCIO 3
        LinkedList<Integer> lista1 = new LinkedList<>();
        lista1.add(5);
        lista1.add(12);
        lista1.add(28);
        lista1.add(33);
        lista1.add(45);

        LinkedList<Integer> lista2 = new LinkedList<>();
        lista2.add(8);
        lista2.add(15);
        lista2.add(22);
        lista2.add(30);
        lista2.add(50);
        lista2.add(67);
        lista2.add(91);

        List<Integer> listaIntercalada = Exercicio3.resolucao(lista1, lista2);
        
        System.out.println("Lista intercalada: " + listaIntercalada);
    }
}
