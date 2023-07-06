import java.util.Scanner;

public class cls {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three nums");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int ad = a % 10;
        int bd = b % 10;
        int cd = c % 10;

        int max, min, mid;
        if (ad > bd && ad > cd)
            max = a;
        else if (bd > ad && bd > cd)
            max = b;
        else
            max = c;

        if (ad < bd && ad < cd)
            min = a;
        else if (bd < ad && bd < cd)
            min = b;
        else
            min = c;

        mid = (a + b + c) - (max + min);

        System.out.println(min + ", " + mid + ", " + max);
    }
}