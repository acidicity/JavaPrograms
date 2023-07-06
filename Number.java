import java.util.Scanner;

public class Number {

    int n;

    public void input() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        this.n = sc.nextInt();
    }

    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
