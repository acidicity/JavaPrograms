import java.util.Scanner;

public class cls19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int n = sc.nextInt();

        int temp = n, count = 0;

        while (temp != 0) {
            count++;
            temp /= 10;
        }

        for (int i = 1; i <= count; i++) {
            int d = (int) Math.pow(10, count - i);

            int x = n / d % 10;

            System.out.println(x);

            n %= d;
        }
    }
}
