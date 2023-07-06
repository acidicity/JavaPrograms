import java.util.Scanner;

public class cls4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 100; i++) {
            int factors = 0;

            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    factors++;
                }
            }

            if (factors == 2) {
                System.out.println(i);
            }
        }
    }
}
