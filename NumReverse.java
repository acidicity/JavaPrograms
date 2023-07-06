import java.util.Scanner;

public class NumReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n = sc.nextInt();

        int temp = n, reverse = 0;

        while (temp != 0) {
            int d = temp % 10;

            reverse = reverse * 10 + d;

            temp /= 10;
        }

        System.out.println("Original: " + n);
        System.out.println("Reverse: " + reverse);
    }
}
