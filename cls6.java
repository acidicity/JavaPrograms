import java.util.Scanner;

public class cls6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int n = sc.nextInt();

        boolean flag = false;
        while (n != 0) {
            int d = n % 10;

            if (d == 0) {
                flag = true;
                System.out.println("Yes, the no. is duck");
                break;
            }
            n /= 10;
        }

        if (!flag) {
            System.out.println("No, the no. is not duck");
        }
    }
}
