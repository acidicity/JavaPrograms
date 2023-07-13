import java.util.Scanner;

public class HCF {

    public void calculate(int a, int b) {
        int div = Math.min(a, b);
        int dvdnd = Math.max(a, b);
        int rem = 0;

        while (true) {
            rem = dvdnd % div;
            if (rem == 0)
                break;

            dvdnd = div;
            div = rem;
        }

        System.out.println("HCF: " + div);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two no.s for which you want to find the HCF:");
        int a = sc.nextInt();
        int b = sc.nextInt();

        HCF obj = new HCF();
        obj.calculate(a, b);

        sc.close();
    }
}
