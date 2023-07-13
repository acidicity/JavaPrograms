import java.util.Scanner;

public class Exam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a no.");
        int n = sc.nextInt();

        for (int i = 1; i <= 4; i++) {
            boolean present = false;
            int temp = n;
            while (temp != 0) {
                int d = temp % 10;

                if (d == i) {
                    present = true;
                    break;
                }

                temp /= 10;
            }

            System.out.println(i + ": " + present);

            sc.close();
        }
    }
}