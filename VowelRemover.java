import java.util.Scanner;

public class VowelRemover {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a word:");
        String word = sc.next();

        String result = "";

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);

            switch (ch) {
                case 'A':
                case 'a':
                case 'E':
                case 'e':
                case 'I':
                case 'i':
                case 'O':
                case 'o':
                case 'U':
                case 'u':
                    continue;
            }

            result += ch;
        }

        System.out.println(result);

        sc.close();
    }
}
