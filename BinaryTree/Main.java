// Main.java
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        BinaryTree tree = new BinaryTree();

        // Input values
        tree.getInput();

        // Display tree
        tree.displayTree();

        // Search value
        System.out.print("\nEnter value to search: ");
        int search = sc.nextInt();

        // Search node
        tree.searchValue(search);
    }
}
