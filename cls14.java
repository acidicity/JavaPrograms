import java.util.Scanner;

public class cls14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int n = sc.nextInt();

        int reverse = 0, temp = n;

        // Find the reverse
        while (temp != 0) {
            int d = temp % 10;

            reverse = reverse * 10 + d;
            temp /= 10;
        }

        // Now check if the original number is equal to the reverse
        if (n == reverse)
            System.out.println("Yes, the no. is palindrome");
        else
            System.out.println("No, the no. is not palindrome");

        sc.close();
    }
}
