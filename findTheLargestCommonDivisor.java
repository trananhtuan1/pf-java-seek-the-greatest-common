import java.util.Scanner;

public class findTheLargestCommonDivisor {
    public static void main(String[] args) {
        System.out.println("find The Largest Common Divisor");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a");
        int a = scanner.nextInt();
        System.out.println("Enter b");
        int b = scanner.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);

        if (a == 0 || b == 0) {
            System.out.println("There are no common divisions");
        } else {
            while (a != b) {
                if (a > b) a = a - b;
                else b = b - a;
            }
            System.out.println("Greatest common divisor: " + a);
        }
    }
}


