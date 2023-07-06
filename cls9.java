import java.util.Scanner;

public class cls9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value for a");
        int a = sc.nextInt();

        double sum = 0;

        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 1)
                sum += i;
            else
                sum -= a / 2;
        }

        System.out.println("Sum of the series: " + sum);

    }
}
