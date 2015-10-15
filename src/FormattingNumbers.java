import java.util.Locale;
import java.util.Scanner;

public class FormattingNumbers {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);

        System.out.print("Insert 3 numbers: integer in range [0..500], double, double = ");
        Scanner scanner = new Scanner(System.in);
        int numA = scanner.nextInt();
        double numB = scanner.nextDouble();
        double numC = scanner.nextDouble();

        System.out.printf(
                "|%-10s|%s|%10.2f|%-10.3f|",
                Integer.toHexString(numA).toUpperCase(),
                String.format("%10s", Integer.toBinaryString(numA)).replace(' ', '0'),
                numB,
                numC);
    }
}