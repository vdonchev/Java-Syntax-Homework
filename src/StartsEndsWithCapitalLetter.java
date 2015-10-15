import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StartsEndsWithCapitalLetter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insert text = ");
        String text = scanner.nextLine();

        Pattern pattern = Pattern.compile("\\b[A-Z][a-zA-Z]*[A-Z]\\b");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.print(matcher.group() + " ");
        }
    }
}
