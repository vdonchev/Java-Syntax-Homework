import java.util.Locale;
import java.util.Scanner;

public class CalculateExpression {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ROOT);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert 3 floating point numbers = ");

        double numA = scanner.nextDouble();
        double numB = scanner.nextDouble();
        double numC = scanner.nextDouble();

        double firstFormulaResult = calculateFirstFormula(numA, numB, numC);
        double secondFormulaResult = calculateSecondFormula(numA, numB, numC);
        double numsAverage = calculateNumsAverage(numA, numB, numC);
        double formulasAverage = (firstFormulaResult + secondFormulaResult) / 2;
        double diff = Math.abs(numsAverage - formulasAverage);

        System.out.printf(
                "F1 result: %1$.2f; F2 result: %2$.2f; Diff: %3$.2f",
                firstFormulaResult,
                secondFormulaResult,
                diff);
    }

    private static double calculateNumsAverage(double numA, double numB, double numC) {
        return (numA + numB + numC) / 3;
    }

    private static double calculateSecondFormula(double numA, double numB, double numC) {
        double result = Math.pow(Math.pow(numA, 2) + Math.pow(numB, 2) - Math.pow(numC, 3), (numA - numB));
        return result;
    }

    private static double calculateFirstFormula(double numA, double numB, double numC) {
        double power = (numA + numB + numC) / Math.sqrt(numC);
        double result =
                Math.pow((Math.pow(numA, 2) + Math.pow(numB, 2)) / (Math.pow(numA, 2) - Math.pow(numB, 2)), power);

        return result;
    }
}
