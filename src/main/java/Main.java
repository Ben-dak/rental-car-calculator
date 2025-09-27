import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.print("Enter pickup date: ");
        String pickupDate = myScanner.nextLine();

        System.out.print("Enter days to rent: ");
        int rentalDays = Integer.parseInt(myScanner.nextLine());

        System.out.print("Want electronic toll tag? ($3.95/day) (yes/no): ");
        String tollTagInput = myScanner.nextLine().toLowerCase();

        System.out.print("Do you want a GPS? ($2.95/day) (yes/no): ");
        String gpsInput = myScanner.nextLine().toLowerCase();

        System.out.print("Roadside assistance? ($3.95/day) (yes/no): ");
        String roadsideInput = myScanner.nextLine().toLowerCase();

        System.out.print("Enter your age: ");
        int age = Integer.parseInt(myScanner.nextLine());
        double baseRate = 29.99;
        double tollTagRate = 3.95;
        double gpsRate = 2.95;
        double roadsideRate = 3.95;
        double basicRental = baseRate * rentalDays;
        double optionsCost = 0;

        switch (tollTagInput) {
            case "yes":
                optionsCost += tollTagRate * rentalDays;
                break;
            case "no":
                break;
        }
        switch (gpsInput) {
            case "yes":
                optionsCost += gpsRate * rentalDays;
                break;
            case "no":
                break;
        }
        switch (roadsideInput) {
            case "yes":
                optionsCost += roadsideRate * rentalDays;
                break;
            case "no":
                break;
        }
        double underageSurcharge = 0;
        if (age < 25) {
            underageSurcharge = basicRental * 0.30;
        }
        double totalCost = basicRental + optionsCost + underageSurcharge;

        System.out.println("=== Rental Car Estimate ===");
        System.out.println("Pickup Date: " + pickupDate);
        System.out.printf("Basic Car Rental: $%.2f%n", basicRental);
        System.out.printf("Options Cost: $%.2f%n", optionsCost);
        System.out.printf("Underage Surcharge: $%.2f%n", underageSurcharge);
        System.out.printf("Total Cost: $%.2f%n", totalCost);
    }
}
