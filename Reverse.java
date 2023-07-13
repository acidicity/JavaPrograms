import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the sentence:");
        String line = sc.nextLine() + ' ';

        int len = line.length();

        String temp = "", result = "";
        for (int i = 0; i < len; i++) {
            char ch = line.charAt(i);

            if (ch != ' ') {
                temp += ch;
            } else {
                int templen = temp.length();

                for (int j = templen - 1; j >= 0; j--) {
                    result += temp.charAt(j);
                }
                result += " ";
                temp = "";
            }
        }

        System.out.println("Result: " + result.trim());

        sc.close();
    }
}
