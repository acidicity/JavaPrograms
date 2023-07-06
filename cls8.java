import java.util.Scanner;

public class cls8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a no.");
        int n = sc.nextInt();

        int t = n, count = 0, sum = 0;

        while (t != 0) {
            count++;
            t /= 10;
        }

        for (int i = count; i >= 1; i--) {
            int d = n % 10;

            sum += d * (int) Math.pow(5, i);
            n /= 10;
        }

        System.out.println("Sum: " + sum);
    }
}
