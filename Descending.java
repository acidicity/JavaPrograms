import java.util.Scanner;

public class Descending {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        long n = sc.nextLong();

        long result = 0, temp;

        for (int i = 9; i >= 0; i--) {
            temp = n;
            while (temp != 0) {
                int d = (int) (temp % 10);

                if (d == i)
                    result = result * 10 + i;

                temp /= 10;
            }
        }

        System.out.println("New number: " + result);

        sc.close();
    }
}