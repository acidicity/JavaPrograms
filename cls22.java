import java.util.Scanner;

public class cls22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        int m = Math.min(n1, n2);
        for (int i = 1; i <= m; i++) {
            if (n1 % i == 0 && n2 % i == 0)
                System.out.println("Common factor: " + i);
        }
    }
}