import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Diigite a frese ao contrario: ");
        Scanner scanner = new Scanner(System.in);
        String inp = scanner.nextLine();

        String unscrambleLine = unscrambleLine(inp);
        System.out.println(unscrambleLine);
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