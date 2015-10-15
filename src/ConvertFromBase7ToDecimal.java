import java.util.Scanner;

public class ConvertFromBase7ToDecimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insert integer = ");
        String num = scanner.next();
        int b = Integer.valueOf(num, 7);
        System.out.println(b);
    }
}