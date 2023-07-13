import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean flag = false;
        System.out.println("Enter 10 no.s in descending order:");
        int arr[] = new int[10];

        for (int i = 0; i < 10; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the no. to be searched:");
        int n = sc.nextInt();

        int low = 0, high = 9, mid;

        while (low <= high) {
            mid = (low + high) / 2;

            System.out.println("Mid: " + mid + ", High: " + high + ", Low: " + low);

            if (n > arr[mid])
                high = mid - 1;
            else if (n < arr[mid])
                low = mid + 1;
            else {
                System.out.println("Search successful");
                flag = true;
                break;
            }
        }

        if (!flag)
            System.out.println("Search unsuccessful");

        sc.close();
    }
}
