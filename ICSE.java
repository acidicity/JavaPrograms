public class ICSE {
    public static void main(String[] args) {

        String s1 = "ICSE", s2 = "TODAY";

        int len1 = s1.length(), len2 = s2.length();

        for (int i = len1; i >= 0; i--) {

            int limit = len2 - i;
            System.out.println(s1.substring(0, i).concat(s2.substring(0, limit)));
        }
    }
}
