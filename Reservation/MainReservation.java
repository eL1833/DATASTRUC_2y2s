package DATASTRUC_Activities.Reservation;
import java.util.*;

public class MainReservation {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Stack<Reservation> stack = new Stack<>();
        int choice;
        int cResNum = 1;

        do{
            System.out.println("\n=== Reservation System ===");
            System.out.println("1. Add Reservation"+
                            "\n2. Cancel Reservation"+
                            "\n3. Display All Reservation"+
                            "\n4. Exit");
            System.out.print("\nEnter your choice: ");
            choice = input.nextInt();
            input.nextLine();

            switch(choice) {
                case 1: 
                    int resnum = cResNum++;
                    System.out.println("\n=== Add Reservation ===");
                    System.out.println("Reservation Number: "+resnum);
                    System.out.print("Enter Name: ");
                    String name = input.nextLine();
                    System.out.print("Enter Date: ");
                    String date = input.nextLine();
                    System.out.print("Enter the number of persons: ");
                    int numPer = input.nextInt();
                    input.nextLine();

                    Reservation r = new Reservation(cResNum, name, date, numPer);
                    stack.push(r);

                    System.out.println("The reservation is added successfully!\n");
                    break;

                case 2:
                    System.out.println("\n=== Cancelling Reservation ===");
                    if (!stack.isEmpty()) {
                        Reservation removed = stack.pop();
                        System.out.println("Reservation Cancelled :");
                        removed.display();
                    } else {
                        System.out.println("No reservations to cancel.");
                    }
                    break;

                case 3:
                     if (stack.isEmpty()) {
                        System.out.println("No reservations available.");
                    } else {
                        System.out.println("\n=== All Reservations ===");
                        for (int i = stack.size() - 1; i >= 0; i--) {
                            stack.get(i).display();
                            System.out.println();
                        }
                    }
                    break;

                case 4:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while(choice != 4);

        input.close();
    }
}
