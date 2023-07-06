import java.util.Scanner;
import java.io.*;

public class Check {

    int a; // to store an integer

    public Check() {
        this.a = 0;
    }

    public void input() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a no.");
        this.a = sc.nextInt();

        sc.close();
    }

    public boolean find() {
        boolean check = false;

        for (int i = 1; i <= 2; i++) {
            int temp = a;
            check = false;

            while (temp != 0) {
                int d = temp % 10;

                if (d == i) {
                    check = true;
                    break;
                }

                temp /= 10;
            }

            if (!check)
                break;
        }

        return check;
    }

    public static void main(String[] args) {
        Check obj = new Check();

        obj.input();
        System.out.println(obj.find());
    }
}
