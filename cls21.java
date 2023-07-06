import java.util.Scanner;

public class cls21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int n = sc.nextInt();

        int temp = n, count = 0;

        while (temp != 0) {
            count++;
            temp /= 10;
        }

        int sum = 0;
        for (int i = count; i >= 1; i--) {
            int d = n % 10;

            sum += i * d;
            n /= 10;
        }

        System.out.println("Sum: " + sum);
    }
}
