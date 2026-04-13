package DATASTRUC_Activities.Reservation;

import java.util.Scanner;

public class MainReservationQ {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int choice;
        int resNum = 1;

        do {
            System.out.println("\n=== Reservation System ===");
            System.out.println("1. Add Reservation");
            System.out.println("2. Cancel Reservation");
            System.out.println("3. Display All Reservation");
            System.out.println("4. Exit");
            System.out.print("Enter option: ");

            choice = input.nextInt();
            input.nextLine();

            switch (choice) {

                case 1:
                    System.out.println("Reservation No.: "+resNum);
                
                    System.out.print("Enter name: ");
                    String name = input.nextLine();

                    System.out.print("Enter date: ");
                    String date = input.nextLine();

                    System.out.print("Enter number of persons: ");
                    int numPer = input.nextInt();
                    input.nextLine();

                    ReservationQ r = new ReservationQ(resNum, name, date, numPer);
                    resNum++;

                    ReservationQ.enqueue(r);//stores the new reservation to the queue
                    break;

                case 2:
                    ReservationQ removed = ReservationQ.dequeue();

                    if (removed != null) {
                        System.out.println("Reservation of " + removed.name + " is Cancelled.");
                    }
                    break;

                case 3:
                    ReservationQ.displayAll();
                    break;

                case 4:
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 4);

        input.close();
    }
}
