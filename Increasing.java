import java.util.Scanner;

public class Increasing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence: ");
        String line = sc.nextLine() + " ";

        int len = line.length(), count = 0;

        String word = "";
        for (int i = 0; i < len; i++) {
            char ch = line.charAt(i);

            if (ch != ' ') {
                word += ch;
            } else {
                count++;

                for (int j = 1; j <= count; j++)
                    System.out.print(word + " ");

                System.out.println();
                word = "";
            }
        }

        sc.close();
    }
}
