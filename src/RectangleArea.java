import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Insert 2 sides of the rectangle (int) = ");
        int sideA = scanner.nextInt();
        int sideB = scanner.nextInt();

        System.out.printf("The area of rectangle is: %d", sideA * sideB);
    }
}