import java.util.Scanner;

public class BinaryTree {

    private Node root;

    public BinaryTree() {
        root = null;//initialized root to empty
    }

    public Node getRoot() {
        return root;
    }

    public Node createNode(int value) {
        return new Node(value);
    }
    
    
//add
      public void getInput() {
   
         Scanner sc = new Scanner(System.in);
   
         System.out.print("How many values to insert? ");
         int n = sc.nextInt();
   
         for (int i = 1; i <= n; i++) {
   
          System.out.print("Enter value " + i + ": ");
          int value = sc.nextInt();
   
          insert(value);//proceed to insert method
          }
       }


//insert 
    public void insert(int value) {

        Node newNode = createNode(value);

        if (root == null) {
            root = newNode;
            return;
        }

        Node current = root;
        Node parent = null;

        while (current != null) {

            parent = current;

            if (value < current.getData()) {
                current = current.getLeft();
            }

            else if (value > current.getData()) {
                current = current.getRight();
            }

            else {
                System.out.println("Duplicate value not allowed.");
                return;
            }
        }

        if (value < parent.getData()) {
            parent.setLeft(newNode);
        }

        else {
            parent.setRight(newNode);
        }
    }

//search   
    public void searchValue(int value) {

        Node current = root;
        String path = "";

        while (current != null) {

            if (current.getData() == value) {

                if (path.equals("")) {
                    System.out.println(value + " is found at the ROOT.");
                } else {
                    System.out.println(value + " is found.");
                    System.out.println("Path: " + path);
                }

                return;
            }

            if (value < current.getData()) {

                current = current.getLeft();

                if (path.equals("")) {
                    path = "Left";
                } else {
                    path += " -> Left";
                }
            }

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

    public void displayTree() {

        System.out.println("\nTree Elements (Preorder Traversal):");

        preorder(root);

        System.out.println();
    }

    private void preorder(Node node) {

        if (node != null) {

            System.out.print(node.getData() + " ");
            preorder(node.getLeft());
            preorder(node.getRight());
        }
    }
}
