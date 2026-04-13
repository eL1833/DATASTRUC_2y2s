package DATASTRUC_Activities.Reservation;

public class ReservationQ {

    int resNum;
    String name;
    String date;
    int numPer;

    static ReservationQ[] queue = new ReservationQ[100];
    static int front, rear;

    // CONSTRUCTOR (for data)
    public ReservationQ(int resNum, String name, String date, int numPer) {
        this.resNum = resNum;
        this.name = name;
        this.date = date;
        this.numPer = numPer;
    }

    // INITIALIZE
    public ReservationQ() {
        front = -1;
        rear = -1;
    }

    // CHECK IF FULL
    public static boolean isFull() {
        return (front == 0 && rear == queue.length - 1);
        //for circular queue:
        // return (rear + 1) % SIZE == front;
    }

    // CHECK IF EMPTY
    public static boolean isEmpty() {
        return (front == -1);
    }

    // ENQUEUE (ADD)
    public static void enqueue(ReservationQ r) {

        if (isFull()) {
            System.out.println("Queue is full");
        } else {

            if (front == -1) {
                front = 0; //the first element
            }

            rear++;
            //for circular queue:
            /*if (front == -1) { // first element
                 front = 0;
                 rear = 0;
             } else {
                 rear = (rear + 1) % SIZE;
             }*/
            queue[rear] = r;//stored as a new reservation

            System.out.println("Reservation added.");
        }
    }

    // DEQUEUE (CANCEL)
    public static ReservationQ dequeue() {

        if (isEmpty()) {
            System.out.println("Queue is empty");
            return null;
        } else {

            ReservationQ temp = queue[front];

            // if only one element left
            if (front == rear) {
                front = -1;//then queue is empty again
                rear = -1;
            } else {//if not only one element left
                front++;//the front moves
            }

            System.out.println("Reservation cancelled.");
            return temp;
        }
    }

    // PEEK (VIEW FRONT)
    public static ReservationQ peek() {

        if (isEmpty()) {
            return null;
        } else {
            return queue[front];
        }
    }

    // DISPLAY
    public static void displayAll() {

        if (isEmpty()) {
            System.out.println("Empty Queue");
        } else {

            System.out.println("\nFront index -> " + front);
            System.out.println("\n=== Reservations ===");

            for (int i = front; i <= rear; i++)
               if (queue[i] != null) {
                   System.out.println("Reservation No: " + queue[i].resNum);
                   System.out.println("Name: " + queue[i].name);
                   System.out.println("Date: " + queue[i].date);
                   System.out.println("Persons: " + queue[i].numPer);
                   System.out.println("-------------------");
               }

            System.out.println("Rear index -> " + rear);
        }
    }
}
