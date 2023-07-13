import java.util.Scanner;

public class SecondDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int n = sc.nextInt();

        while (n > 99)
            n /= 10;

        if (n % 10 == 0)
            System.out.println("Yes, the second digit is zero");
        else
            System.out.println("No, the second digit is not zero");

        sc.close();
    }
}
