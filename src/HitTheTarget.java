import java.util.Scanner;

public class HitTheTarget {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insert integer = ");
        int targetNum = scanner.nextInt();

        for (int i = 1; i <= 20; i++) {
            int numA = i;
            for (int j = 1; j <= 20; j++) {
                int numB = j;

                if(doAddition(numA, numB, targetNum)) {
                    System.out.printf("%d + %d = %d\n", numA, numB, targetNum);
                } else if(doSubstraction(numA, numB, targetNum)) {
                    System.out.printf("%d - %d = %d\n", numA, numB, targetNum);
                } else {
                    continue;
                }
            }
        }
    }

    private static boolean doSubstraction(int numA, int numB, int targetNum) {
        boolean result = numA - numB == targetNum;
        return result;
    }

    private static boolean doAddition(int numA, int numB, int targetNum) {
        boolean result = numA + numB == targetNum;
        return result;
    }
}
