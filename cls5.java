import java.util.Scanner;

public class cls5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                if (j % 2 == 1)
                    System.out.print("*");
                else
                    System.out.print("#");
            }
            System.out.println();
        }
    }
}
