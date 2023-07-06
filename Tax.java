import java.util.Scanner;

public class Tax {
    String gender;
    int age;
    double TI, tax;

    public void input() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your gender:");
        this.gender = sc.nextLine();

        System.out.println("Enter your age:");
        this.age = sc.nextInt();

        System.out.println("Enter your Taxable Income:");
        this.TI = sc.nextDouble();

        sc.close();
    }

    public void compute() {
        if (gender.equalsIgnoreCase("male") && age <= 65) {
            if (TI <= 160000) {
                tax = 0.0;
            } else if (TI <= 500000) {
                tax = (TI - 160000) * 10 / 100.0;
            } else if (TI <= 800000) {
                tax = ((TI - 500000) * 20 / 100.0) + 34000;
            } else {
                tax = ((TI - 800000) * 30 / 100.0) + 94000;
            }

            System.out.println("Payable Income Tax: " + this.tax);
        } else {
            System.out.println("Wrong Category");
        }
    }

    public static void main(String[] args) {
        Tax obj = new Tax();

        obj.input();
        obj.compute();
    }
}