public class cls18 {
    public static void main(String[] args) {
        for (int i = 1; i <= 7; i++) {
            int factorial = 1, sum = 0;
            for (int j = 1; j <= i; j++) {
                factorial *= j;
            }

            sum += factorial;
        }
    }
}
