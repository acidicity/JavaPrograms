import java.util.Scanner;

public class Series {

    int n;

    public void input() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no. of terms");
        this.n = sc.nextInt();

        sc.close();
    }

    public double sum() {
        int x = 1, fact = 1;
        double ssum = 0, term = 0;

        for (int i = 1; i <= n; i++) {

            fact = 1;

            for (int j = 1; j <= x; j++) {
                fact *= j;
            }

            term = (double) i / fact;

            ssum += term;
            x += 2;
        }

        return ssum;
    }

    public static void main(String[] args) {
        Series s = new Series();

        s.input();
        double s_sum = s.sum();

        System.out.println("Sum of the series: " + s_sum);
    }
}
