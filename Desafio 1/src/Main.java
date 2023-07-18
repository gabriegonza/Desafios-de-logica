import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Numero de linhas da lista de max 10 numeros:");
        int num = scanner.nextInt();

        if (num > 10) {
            System.out.println("Numero maximo de 10 linhas.");
            return;
        }

        List<Integer> pares = new ArrayList<>();
        List<Integer> impares = new ArrayList<>();

        for (int i = 0; i < num; i++) {
            int valor = scanner.nextInt();
            if (valor % 2 == 0) {
                pares.add(valor);
            } else {
                impares.add(valor);
            }
        }

        Collections.sort(pares);
        Collections.sort(impares, Collections.reverseOrder());

        System.out.println("Numeros pares");
        for (int valor : pares) {
            System.out.println(valor);
        }

        System.out.println("Numeros Impares");
        for (int valor : impares) {
            System.out.println(valor);
        }
    }
}