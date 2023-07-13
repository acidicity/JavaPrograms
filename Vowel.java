import java.util.Scanner;

public class Vowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string");
        String st = sc.nextLine();

        int len = st.length();
        int loc1 = 0, loc2 = 0;

        char vowels[] = new char[len];
        char consonants[] = new char[len];

        for (int i = 0; i < len; i++) {
            char ch = st.charAt(i);

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
                    vowels[loc1++] = ch;
                    break;
                default:
                    if (Character.isLetter(ch))
                        consonants[loc2++] = ch;
            }
        }

        System.out.println("Vowels:");
        for (int i = 0; i < loc1; i++) {
            System.out.println(vowels[i]);
        }

        System.out.println("Consonants:");
        for (int i = 0; i < loc2; i++) {
            System.out.println(consonants[i]);
        }
    }
}
