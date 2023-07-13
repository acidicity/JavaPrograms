import java.util.Scanner;

public class Vowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string:");
        String st = sc.nextLine();

        String lower = st.toLowerCase();

        int count = 0;
        for (int i = 0; i < lower.length(); i++) {
            char ch = lower.charAt(i);

            switch (ch) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    count++;
            }
        }

        System.out.println("Count: " + count);

        sc.close();
    }
}
