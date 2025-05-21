import java.util.LinkedList;

public class Exercicio3 {
    public static LinkedList<Integer> resolucao(LinkedList<Integer> lista1, LinkedList<Integer> lista2) {
        LinkedList<Integer> listaIntercalada = new LinkedList<>();

        while (lista1.size() > 0 || lista2.size() > 0) {
            if (lista1.size() == 0 && lista2.size() > 0) {
                listaIntercalada.add(lista2.poll());
                continue;
            }

            if (lista2.size() == 0 && lista1.size() > 0) {
                listaIntercalada.add(lista1.poll());
                continue;
            }

            int a = lista1.peek();
            int b = lista2.peek();

            if (a <= b) {
                listaIntercalada.add(lista1.poll());
            } else {
                listaIntercalada.add(lista2.poll());
            }
        }

        return listaIntercalada;
    }
}
