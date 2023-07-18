import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        System.out.println("Diigite a frese ao contrario: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // Quantidade de casos de teste
        scanner.nextLine(); // Consumir a quebra de linha após o valor n

        for (int i = 0; i < n; i++) {
            String line = scanner.nextLine();
            String unscrambledLine = unscrambleLine(line);
            System.out.println(unscrambledLine);
        }

        scanner.close();
    }

    public static String unscrambleLine(String line) {
        int length = line.length();
        StringBuilder sb = new StringBuilder(length);

        for (int i = length / 2 - 1; i >= 0; i--) {
            sb.append(line.charAt(i));
        }

        for (int i = length - 1; i >= length / 2; i--) {
            sb.append(line.charAt(i));
        }

        return sb.toString();
    }
}