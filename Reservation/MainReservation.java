package DATASTRUC_Activities.Reservation;

import java.util.*;

public class MainReservation {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Stack<Reservation> stack = new Stack<>();
        int iResNum = 1;
        int choice;

        do {
            System.out.println("\n=== Reservation System ===");
            System.out.println("1. Add Reservation");
            System.out.println("2. Cancel Reservation");
            System.out.println("3. Display All Reservation");
            System.out.println("4. Exit");
            System.out.print("\nEnter your choice: ");

            choice = input.nextInt();
            input.nextLine();

            switch (choice) {

                case 1:
                    int resnum = iResNum++;

                    System.out.println("\n=== Add Reservation ===");
                    System.out.println("Reservation Number: " + resnum);

                    System.out.print("Enter Name: ");
                    String name = input.nextLine();

                    System.out.print("Enter Date: ");
                    String date = input.nextLine();

                    System.out.print("Enter number of persons: ");
                    int numPer = input.nextInt();
                    input.nextLine();

                    Reservation reservation =
                            new Reservation(resnum, name, date, numPer);

                    Reservation.addReservation(stack, reservation);
                    break;

                case 2:
                    Reservation.cancelReservation(stack);
                    break;

                case 3:
                    Reservation.displayAll(stack);
                    break;

                case 4:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 4);

        input.close();
    }
}
