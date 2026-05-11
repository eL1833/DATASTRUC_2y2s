// BinaryTree.java
import java.util.Scanner;

public class BinaryTree {

    private Node root;

    // Constructor
    public BinaryTree() {
        root = null;
    }

    // getRoot()
    public Node getRoot() {
        return root;
    }

    // createNode()
    public Node createNode(int value) {
        return new Node(value);
    }

    // insert()
    public void insert(int value) {

        Node newNode = createNode(value);

        // If tree is empty
        if (root == null) {
            root = newNode;
            return;
        }

        Node current = root;
        Node parent = null;

        while (current != null) {

            parent = current;

            // Go to left subtree
            if (value < current.getData()) {
                current = current.getLeft();
            }

            // Go to right subtree
            else if (value > current.getData()) {
                current = current.getRight();
            }

            // Duplicate value
            else {
                System.out.println("Duplicate value not allowed.");
                return;
            }
        }

        // Insert to left
        if (value < parent.getData()) {
            parent.setLeft(newNode);
        }

        // Insert to right
        else {
            parent.setRight(newNode);
        }
    }

    // getInput()
    public void getInput() {

        Scanner sc = new Scanner(System.in);

        System.out.print("How many values to insert? ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            System.out.print("Enter value " + i + ": ");
            int value = sc.nextInt();

            insert(value);
        }
    }

    // searchValue()
    public void searchValue(int value) {

        Node current = root;
        String path = "";

        while (current != null) {

            // Value found
            if (current.getData() == value) {

                if (path.equals("")) {
                    System.out.println(value + " is found at the ROOT.");
                } else {
                    System.out.println(value + " is found.");
                    System.out.println("Path: " + path);
                }

                return;
            }

            // Move left
            if (value < current.getData()) {

                current = current.getLeft();

                if (path.equals("")) {
                    path = "Left";
                } else {
                    path += " -> Left";
                }
            }

            // Move right
            else {

                current = current.getRight();

                if (path.equals("")) {
                    path = "Right";
                } else {
                    path += " -> Right";
                }
            }
        }

        System.out.println(value + " is NOT found in the tree.");
    }

    // displayTree()
    public void displayTree() {

        System.out.println("\nTree Elements (Preorder Traversal):");

        preorder(root);

        System.out.println();
    }

    // preorder traversal
    private void preorder(Node node) {

        if (node != null) {

            // Root
            System.out.print(node.getData() + " ");

            // Left
            preorder(node.getLeft());

            // Right
            preorder(node.getRight());
        }
    }
}
