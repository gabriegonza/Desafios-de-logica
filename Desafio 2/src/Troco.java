import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Troco {
    public static void main(String[] args) {
        System.out.println("Digite o valor: ");
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        double valor = 0;
        try {
            valor = scanner.nextDouble();
            if (valor < 0 || valor > 1000000.00) {
                System.out.println("Valor inválido. Insira um valor entre 0 e 1.000.000");
                System.exit(1);
            }
        } catch (InputMismatchException e) {
            System.out.println("Valor inválido. Utilize o ponto (.) para decimal.");
            System.exit(1);
        }
        scanner.close();

        DecimalFormatSymbols ponto = new DecimalFormatSymbols(Locale.US);
        DecimalFormat decimal = new DecimalFormat("#,##0.00", ponto);

        System.out.println("NOTAS:");
        int[] notas = { 100, 50, 20, 10, 5, 2 };
        for (int nota : notas) {
            int quantNotas = (int) (valor / nota);
            System.out.println(quantNotas + " nota(s) de R$ " + nota + ".00");
            valor %= nota;
        }

        System.out.println("MOEDAS:");
        int[] moedas = { 100, 50, 25, 10, 5, 1 };
        valor *= 100;
        for (int moeda : moedas) {
            int quantMoedas = (int) (valor / moeda);
            System.out.println(
                    quantMoedas + " moeda(s) de R$ " + decimal.format(moeda / 100.0)
            );
            valor %= moeda;
        }
    }
}