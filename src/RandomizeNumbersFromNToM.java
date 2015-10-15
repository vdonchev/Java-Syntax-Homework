import java.util.Random;
import java.util.Scanner;

public class RandomizeNumbersFromNToM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numA = scanner.nextInt();
        int numB = scanner.nextInt();

        int min = Math.min(numA, numB);
        int max = Math.max(numA, numB);

        Random rand = new Random();
        for (int i = min; i <= max; i++) {
            int randNum = rand.nextInt((max - min) + 1) + min;
            System.out.print(randNum + " ");
        }
    }
}