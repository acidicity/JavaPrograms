public class Playground {
    public static void main(String[] args) {
        int x = 5;
        String s = "Malayalam";

        System.out.println("Java".charAt(1) + 65);
        System.out.println("Java" + (double) x);

        System.out.println(s.charAt(3) + s.indexOf('a') + s.substring(5, 8));

        int a[] = { 5, 8, 7, 3, 2 };
        a[1] = a[3];
        a[2] = a[4];
        a[3] = a[1] + a[2];

        for (int i = 0; i < 5; i++)
            System.out.print(a[i] + ",");

        String temp = "30";

        System.out.println(Integer.parseInt(temp));
    }
}