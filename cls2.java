import java.util.Scanner;

public class cls2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int n = sc.nextInt();

        while (n != 0) {
            int t = n % 100;

            if (t % 10 == t / 10) {
                System.out.println("Double digit found: " + t);
            }

            n /= 10;
        }

        sc.close();
    }
}