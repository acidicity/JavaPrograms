import java.util.Scanner;

public class Initial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String line = sc.nextLine() + " ";

        int len = line.length();

        String temp = "";
        for (int i = 0; i < len; i++) {
            char ch = line.charAt(i);

            if (ch != ' ') {
                temp += ch;
            } else {
                System.out.print(temp.charAt(0) + " ");

                temp = "";
            }
        }
    }
}
