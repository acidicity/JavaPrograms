import java.util.Scanner;

public class Sum2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int n = sc.nextInt();

        int t = n, count = 0;
        while (t != 0) {
            count++;
            t /= 10;
        }

        int sum = 0;

        for (int i = count; i >= 1; i--) {

            int d = n % 10;
            sum += d * i;

            n /= 10;
        }

        System.out.println("Sum: " + sum);

        sc.close();
    }
}