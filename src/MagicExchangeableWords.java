import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MagicExchangeableWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insert 2 equal by length strings, separated by space = ");
        System.out.println();
        System.out.println(findIfWordsAreMagic(scanner.next(), scanner.next()));
    }

    private static boolean findIfWordsAreMagic(String strA, String strB) {
        boolean equal = true;
        Map<Character, Character> archive = new HashMap<>();
        for (int i = 0; i < strA.length(); i++) {
            if(archive.containsKey(strA.charAt(i))) {
                if(archive.get(strA.charAt(i)) != strB.charAt(i)) {
                    equal = false;
                }
            } else {
                archive.put(strA.charAt(i), strB.charAt(i));
            }
        }

        return equal;
    }
}