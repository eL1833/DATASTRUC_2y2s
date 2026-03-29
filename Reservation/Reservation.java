package DATASTRUC_Activities.Reservation;

class Reservation{
    
    int resNum;
    String name;
    String date;
    int numPer; 

    public Reservation(int resNum, String name, String date, int numPer){
        this.resNum = resNum;
        this.name = name;
        this.date = date;
        this.numPer = numPer;
    }

    public void display(){
        System.out.println("\nReservation no.: "+resNum);
        System.out.println("Name: "+name);
        System.out.println("Date: "+date);
        System.out.println("Number of Persons: "+numPer);
    }
}
