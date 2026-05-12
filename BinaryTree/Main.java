import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BinaryTree tree = new BinaryTree();

        int choice;

        do {

            System.out.println("\n===== BINARY SEARCH TREE MENU =====");
            System.out.println("1. Insert Values");
            System.out.println("2. Display Tree");
            System.out.println("3. Search Value");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    // Insert values
                    tree.getInput();
                    break;

                case 2:

                    // Display tree
                    tree.displayTree();
                    break;

                case 3:

                    // Search value
                    System.out.print("Enter value to search: ");
                    int search = sc.nextInt();

                    tree.searchValue(search);
                    break;

                case 4:

                    // Exit program
                    System.out.println("Program terminated.");
                    break;

                default:

                    System.out.println("Invalid choice. Try again.");
            }

        } while (choice != 4);

        sc.close();
    }
}
