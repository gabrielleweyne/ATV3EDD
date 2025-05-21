import java.util.LinkedList;
import java.util.Queue;

public class Exercicio2 {
    public static int resolucao(int batidas, int quantidadeParticipantes) {
        Queue<Integer> fila = new LinkedList<>();

        for (int i = 0; i < quantidadeParticipantes; i++) {
            fila.add(i + 1);
        }

        while (fila.size() > 1) {
            System.out.println("NOVA RODADA");
            System.out.println(fila);

            for (int i = 0; i < batidas; i++) {
                System.out.println("GIRADA");
                int primeiro = fila.poll();
                fila.add(primeiro);
                System.out.println(fila);
            }

            int perdedor = fila.poll();
            System.out.println(perdedor + " PERDEU A CADEIRA");
            System.out.println(fila);
        }

        return fila.peek();
    }
}
