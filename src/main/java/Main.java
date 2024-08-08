import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(20);
        list.add(4);
        list.add(5);

        // Verifica o tamanho da lista
        int tamanhoLista = list.size();
        System.out.println("Tamanho da lista: " + tamanhoLista);

        int maiorNumero = encontrarMaiorNumero(list);
        System.out.println("Maior número: " + maiorNumero);
    }

    // Método para encontrar o maior número
    public static int encontrarMaiorNumero(List<Integer> list) {
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("A lista não pode ser nula ou vazia.");
        }

        int maiorNumero = list.get(0);
        for (int num : list) {
            if (num > maiorNumero) {
                maiorNumero = num;
            }
        }
        return maiorNumero;
    }
}
