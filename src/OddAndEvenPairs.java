import java.util.Scanner;

public class OddAndEvenPairs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Insert integers on a single line separated by space = ");
        String[] inputs = scan.nextLine().trim().split("\\s");
        int numberOfElements = inputs.length;
        if (numberOfElements % 2 == 1) {
            System.out.println("Invalid length");
        } else {
            int[] nums = new int[numberOfElements];
            for (int i = 0; i < nums.length; i++) {
                int num = Integer.parseInt(inputs[i]);
                nums[i] = num;
            }

            for (int i = 0; i < numberOfElements - 1; i += 2) {
                int numA = nums[i];
                int numB = nums[i + 1];
                if (numA % 2 == 0 && numB % 2 == 0) {
                    System.out.printf("%d, %d -> both are even\n", numA, numB);
                } else if (numA % 2 == 1 && numB % 2 == 1) {
                    System.out.printf("%d, %d -> both are odd\n", numA, numB);
                } else {
                    System.out.printf("%d, %d -> different\n", numA, numB);
                }
            }
        }
    }
}