import java.util.Scanner;

class Calculate {

    int a, b;

    public Calculate(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int add() {
        return this.a + this.b;
    }
}

public class cls10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();

        Calculate cl = new Calculate(a, b);
        System.out.println("Addition: " + cl.add());
    }
}
