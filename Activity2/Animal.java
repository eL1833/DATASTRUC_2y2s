package DATASTRUC_Activities.Activity2;

public class Animal {
    
    public static void main(String[] args) {
        clsCat c; //these variable names are created to hold the memory address of the concrete object,
        clsDog d; //so although, a reference to an abstract superclass object is not concrete,
        clsParrot p;; //you can store a concrete subclass object reference there.
        c = new clsCat("Mario", "House", "Orange", 3);
        d = new clsDog("Rocky", "House", "Brown", 4);
        p = new clsParrot("Chie", "House", "Red", 5);

        c.displayInfo();
        d.displayInfo();
        p.displayInfo();
    }
}
