import java.util.Scanner;

public class ConvertFeetAndMeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        for (int i = 0; i == 0; i++) {
            System.out.println("Chương trình chuyển đổi Meter sang Feet hoặc Feet sang Meter!");
            System.out.println("1.Meter sang Feet");
            System.out.println("2.Feet sang Meter");
            System.out.println("0.Exit");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Nhập số meter cần đổi: ");
                    double meter = sc.nextDouble();
                    double feetConverted = feetToMeter(meter);
                    System.out.print(meter + " meter = " + feetConverted + " feet.");
                    break;
                case 2:
                    System.out.println("Nhập số feet cần đổi: ");
                    double feet = sc.nextDouble();
                    double meterConverted = meterToFeet(feet);
                    System.out.println(feet + " feet = " + meterConverted + " meter.");
                    break;
                case 0:
                    return;
            }
        }
    }

    public static double feetToMeter(double feet) {
        double meter = 0.305 * feet;
        return meter;
    }

    public static double meterToFeet(double meter) {
        double feet = 3.279 * meter;
        return feet;
    }
}
