import java.util.Scanner;

public class Count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a word");
        String word = sc.next();

        int lower = 0, upper = 0;
        int len = word.length();

        String result = "";
        for (int i = 0; i < len; i++) {
            char ch = word.charAt(i), rch;

            if (Character.isUpperCase(ch)) {
                upper++;
                rch = Character.toLowerCase(ch);
            } else {
                lower++;
                rch = Character.toUpperCase(ch);
            }

            result += rch;
        }

        System.out.println("No. of lowercase characters: " + lower);
        System.out.println("No. of uppercase characters: " + upper);
        System.out.println("New String: " + result);
    }
}