import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int roll[] = new int[3];
        double physics[] = new double[3];
        double chemistry[] = new double[3];
        double biology[] = new double[3];

        for (int i = 1; i <= 3; i++) {
            System.out.println("Enter the details for Student " + i + ":");
            System.out.print("\tRoll No: ");
            roll[i - 1] = sc.nextInt();

            System.out.print("\tPhysics Marks: ");
            physics[i - 1] = sc.nextDouble();

            System.out.print("\tChemistry Marks: ");
            chemistry[i - 1] = sc.nextDouble();

            System.out.print("\tBiology Marks: ");
            biology[i - 1] = sc.nextDouble();
        }

        System.out.println("** ROLL NO WISE AVERAGE ** ");
        for (int i = 0; i < 3; i++) {
            System.out
                    .println("Average for Roll No. " + roll[i] + ": " + (physics[i] + chemistry[i] + biology[i]) / 3.0);
        }

        System.out.println("** PER SUBJECT AVERAGE **");
        int physum = 0, chemsum = 0, biosum = 0;
        for (int i = 0; i < 3; i++) {
            physum += physics[i];
            chemsum += chemistry[i];
            biosum += biology[i];
        }
        System.out.println("Physics: " + physum / 3.0);
        System.out.println("Chemistry: " + chemsum / 3.0);
        System.out.println("Biology: " + biosum / 3.0);
    }
}
