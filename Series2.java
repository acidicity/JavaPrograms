import java.util.Scanner;

public class Series2 {

    int n;
    double sum;

    public Series2(int no, double s) {
        n = no;
        sum = s;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the no. of terms");
        n = sc.nextInt();

        sc.close();
    }

    public void calculate() {
        for (double i = 1; i <= n; i++) {
            double term = (i + i + 1) / (i * (i + 1));

            sum += term;
        }
    }

    public void display() {
        System.out.println("Sum: " + sum);
    }

    public static void main(String[] args) {
        Series2 obj = new Series2(0, 0.0);

        obj.input();
        obj.calculate();
        obj.display();
    }
}
