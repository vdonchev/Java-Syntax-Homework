import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insert string = ");
        String phrase = scanner.nextLine();
        Pattern pattern = Pattern.compile("[a-zA-Z]{2,}");
        Matcher matcher = pattern.matcher(phrase);
        while (matcher.find()) {
            System.out.print(matcher.group() + " ");
        }
        System.out.println();
    }
}
