public class cls17 {
    public static void main(String[] args) {
        int a = 0, b = 1, c = 0;

        System.out.print(a + ", " + b);
        while (c < 100) {
            c = a + b;
            a = b;
            b = c;
            System.out.print(", " + c);
        }
    }
}
