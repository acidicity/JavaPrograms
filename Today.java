public class Today {
    public static void main(String[] args) {
        String st = "TODAY";
        int len = st.length();

        for (int i = len - 1; i >= 0; i--) {
            System.out.println(st.substring(i));
        }
    }
}
