import java.util.Scanner;

public class cls23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int n = sc.nextInt();

        int temp = n, count = 0;
        while (temp != 0) {
            count++;
            temp /= 10;
        }

        if (count % 2 != 1) {
            System.out.println("No. doesn't have odd number of digits");
        } else {
            int x = count / 2;

            int d = (int) Math.pow(10, x);

            n /= d;

            System.out.println("Middle digit: " + (n % 10));
        }
    }
}
