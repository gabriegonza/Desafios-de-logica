import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o tamanho do array: ");
        int n = scanner.nextInt();
        System.out.println("Digite o valor alvo: ");
        int k = scanner.nextInt();

        System.out.println("Digite os valores do array");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        scanner.close();

        int count = Diferença.diferença(arr, k);
        System.out.println(count);
    }
}