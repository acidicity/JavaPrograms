import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two words:");
        String wd1 = sc.next(); // bat
        String wd2 = sc.next(); // tab

        int len1 = wd1.length(), len2 = wd2.length();
        int c1 = 0, c2 = 0;

        boolean flag = true;

        for (char ch = 'a'; ch <= 'z'; ch++) {
            c1 = 0;
            c2 = 0;

            for (int i = 0; i < len1; i++) {
                char wch = wd1.charAt(i);

                if (wch == ch)
                    c1++;
            }

            for (int i = 0; i < len2; i++) {
                char wch = wd2.charAt(i);

                if (wch == ch)
                    c2++;
            }

            if (c1 != c2) {
                flag = false;
                System.out.println("Not anagram");
                break;
            }
        }

        if (flag == true)
            System.out.println("Yes, the two words are anagram");

        sc.close();

    }
}
