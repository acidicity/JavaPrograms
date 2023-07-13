import java.util.Scanner;

public class Pronic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int n = sc.nextInt();

        boolean flag = false;
        for (int i = 1; i <= n / 2; i++) {
            int x = n / i;

            if (x == i + 1) {
                flag = true;
                System.out.println("Yes, the no. is pronic");
                break;
            }
        }

        if (!flag) {
            System.out.println("No, the no. is not pronic");
        }

        sc.close();
    }
}
