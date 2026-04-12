package DATASTRUC_Activities.Reservation;

class Reservation {

    int resNum;
    String name;
    String date;
    int numPer;

    static Reservation[] stack = new Reservation[100]; // stack with limit
    static int top = -1; // initialize stack to empty

    // CONSTRUCTOR
    public Reservation(int resNum, String name, String date, int numPer) {
        this.resNum = resNum;
        this.name = name;
        this.date = date;
        this.numPer = numPer;
    }

    // CHECK IF EMPTY
    public static boolean isEmpty() {
        return top == -1;
    }

    // CHECK IF FULL
    public static boolean isFull() {
        return top == stack.length - 1;
    }

    // PUSH (ADD)
    public static void push(Reservation r) {
        if (isFull()) {
            System.out.println("Stack overflow.");
            return;
        }
        top++;
        stack[top] = r;
        System.out.println("Reservation added.");
    }

    // POP (CANCEL)
    public static Reservation pop() {
        if (isEmpty()) {
            System.out.println("No reservations to cancel.");
            return null;
        }
        return stack[top--];
    }

    // PEEK (VIEW TOP)
    public static Reservation peek() {
        if (isEmpty()) {
            return null;
        }
        return stack[top];
    }

    // DISPLAY ALL
    public static void displayAll() {
        if (isEmpty()) {
            System.out.println("No reservations.");
        } else {
            System.out.println("\n=== Reservations ===");
            for (int i = top; i >= 0; i--) {
                System.out.println("Reservation No: " + stack[i].resNum);
                System.out.println("Name: " + stack[i].name);
                System.out.println("Date: " + stack[i].date);
                System.out.println("Persons: " + stack[i].numPer);
                System.out.println("-------------------");
            }
        }
    }
}
