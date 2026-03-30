package DATASTRUC_Activities.Reservation;

import java.util.Stack;

class Reservation {

    int resNum;
    String name;
    String date;
    int numPer;

    public Reservation(int resNum, String name, String date, int numPer) {
        this.resNum = resNum;
        this.name = name;
        this.date = date;
        this.numPer = numPer;
    }

    // ADD RESERVATION
    public static void addReservation(Stack<Reservation> stack, Reservation reservation) {
        stack.push(reservation);
        System.out.println("Reservation added successfully!");
    }

    // CANCEL RESERVATION
    public static void cancelReservation(Stack<Reservation> stack) {
        System.out.println("\n=== Cancelling Reservation ===");

        if (!stack.isEmpty()) {
            stack.pop();
            System.out.println("Reservation cancelled successfully!");
        } else {
            System.out.println("No reservations to cancel.");
        }
    }

    // DISPLAY ALL RESERVATIONS
    public static void displayAll(Stack<Reservation> stack) {
        if (stack.isEmpty()) {
            System.out.println("No reservations available.");
        } else {
            System.out.println("\n=== All Reservations ===");

            for (int i = stack.size() - 1; i >= 0; i--) {
                Reservation r = stack.get(i);

                System.out.println("\nReservation no.: " + r.resNum);
                System.out.println("Name: " + r.name);
                System.out.println("Date: " + r.date);
                System.out.println("Number of Persons: " + r.numPer);
            }
        }
    }
}
