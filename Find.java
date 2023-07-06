public class Find {
    public void find(int a, int b) {
        int div = Math.min(a, b);
        int dvdnd = Math.max(a, b);
        int rem = 0;
        do {
            rem = dvdnd % div;
            dvdnd = div;
            div = rem;
        } while (rem != 0);

        System.out.println("HCF: " + dvdnd);
    }

    public static void main(String[] args) {
        Find obj = new Find();

        obj.find(68, 16);
    }
}