// Node.java
public class Node {

    private int data;
    private Node left;
    private Node right;

    // Constructor
    public Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }

    // Getters
    public int getData() {
        return data;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }

    // Setters
    public void setLeft(Node left) {
        this.left = left;
    }

    public void setRight(Node right) {
        this.right = right;
    }
}
