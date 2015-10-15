import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MagicExchangeableWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert 2 equal by length strings, separated by space = ");

        String stringA = scanner.next();
        String stringB = scanner.next();
        System.out.println(findIfWordsAreMagic(stringA, stringB));
    }

    private static boolean findIfWordsAreMagic(String strA, String strB) {
        Map<Character, Character> archive = new HashMap<>();

        for (int i = 0; i < strA.length(); i++) {
            char charA = strA.charAt(i);
            char charB = strB.charAt(i);

            if (archive.containsKey(charA)) {
                if (archive.get(charA) != charB) {
                    return false;
                }
            } else {
                if (archive.containsValue(charB)) {
                    return false;
                }

                archive.put(charA, charB);
            }
        }

        return true;
    }
}
