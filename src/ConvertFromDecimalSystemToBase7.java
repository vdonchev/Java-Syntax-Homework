import java.util.Scanner;

public class ConvertFromDecimalSystemToBase7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insert integer number = ");
        int num = scanner.nextInt();
        System.out.println(Integer.toString(num, 7));
    }
}
