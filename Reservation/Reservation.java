package DATASTRUC_Activities.Reservation;

class Reservation {

    int resNum;
    String name;
    String date;
    int numPer;

    static Reservation[] stack = new Reservation[100];//create a stack og set sa limit 
    static int top = -1;//initialize the stack to empty

    // CONSTRUCTOR
    public Reservation(int resNum, String name, String date, int numPer) {
        this.resNum = resNum;
        this.name = name;
        this.date = date;
        this.numPer = numPer;
    }

    // PUSH (ADD)
    public static void push(Reservation r) {
        if (top == 99) {
            System.out.println("Stack is full.");
        } else {
            top++;
            stack[top] = r;
            System.out.println("Reservation added.");
        }
    }

    // POP (CANCEL)
    public static Reservation pop() {
        if (top == -1) {
            System.out.println("No reservations to cancel.");
            return null;
        } else {
            return stack[top--];
        }
    }

    // PEEK (VIEW TOP)
    public static Reservation peek() {
        if (top == -1) {
            return null;
        } else {
            return stack[top];
        }
    }

    // DISPLAY ALL
    public static void displayAll() {
        if (top == -1) {
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
