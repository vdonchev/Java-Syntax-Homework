import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        System.out.println("Insert triengle sides in format aX aY bX bY cX cY:");
        Scanner sc = new Scanner(System.in);

        int aX = sc.nextInt();
        int aY = sc.nextInt();
        int bX = sc.nextInt();
        int bY = sc.nextInt();
        int cX = sc.nextInt();
        int cY = sc.nextInt();

        int area = ((aX * (bY - cY)) + (bX * (cY - aY)) + (cX * (aY - bY))) / 2;
        area = Math.abs(area);
        System.out.printf("The are of triangle is: %d", area);
    }
}
