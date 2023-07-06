import java.util.Scanner;

public class cls16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        ;
        int n = sc.nextInt();

        int even = 0, odd = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                if (i % 2 == 0)
                    even++;
                else
                    odd++;
            }
        }

        System.out.println("Even: " + even + ", Odd: " + odd);
    }
}