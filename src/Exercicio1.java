import java.util.List;
import java.util.Stack;

public class Exercicio1 {
    public static int resolucao(List<Integer> servidores) {
        if (servidores.size() <= 1) {
            return 0;
        }

        int dias = 0;
        boolean continuar = false;

        Stack<Integer> pilha = new Stack<>();

        for (int i = servidores.size() - 1; i >= 0; i--) {
            pilha.push(servidores.get(i));
        }

        do {
            continuar = false;

            Stack<Integer> aux = new Stack<>();

            int esquerda = pilha.pop();
            int direita = pilha.pop();

            aux.push(esquerda);

            do {
                if (direita <= esquerda) {
                    aux.push(direita);
                } else {
                    continuar = true;
                }

                if (pilha.size() == 0) {
                    break;
                }

                esquerda = direita;
                direita = pilha.pop();
            } while (true);

            if (!continuar) {
                break;
            }

            dias++;

            while (aux.size() > 0) {
                pilha.push(aux.pop());
            }
        } while (true);

        return dias;
    }
}
