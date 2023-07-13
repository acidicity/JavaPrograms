import java.util.Scanner;

public class Path {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the full path to the file:");
        String path = sc.nextLine();

        int len = path.length();

        String extension = "", name = "", location = "";

        int x = 0, i = 0;
        for (i = len - 1; i >= 0; i--) {
            char ch = path.charAt(i);

            if (ch == '.') {
                extension = path.substring(i + 1, len);
                x = i;
            }

            if (ch == '\\') {
                name = path.substring(i + 1, x);
                location = path.substring(0, i + 1);
                break;
            }
        }

        System.out.println("Path:\t" + location);
        System.out.println("File Name:\t" + name);
        System.out.println("Extension:\t" + extension);

        sc.close();
    }
}
