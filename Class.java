import java.util.Scanner;

public class Class {
    int n;

    public void input() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no. of terms:");
        this.n = sc.nextInt();
    }

    public double sum() {
        double sum = 0;

        double a = 1;

        for (int i = 1; i <= n; i++) {
            double factorial = 1;
            for (int j = 1; j <= a; j++)
                factorial *= j;

            double term = i / factorial;

            sum += term;
            a += 2;
        }

        return sum;
    }

    public static void main(String[] args) {
        Class obj = new Class();

        obj.input();
        double sum = obj.sum();

        System.out.println("Sum of the series: " + sum);
    }
}
