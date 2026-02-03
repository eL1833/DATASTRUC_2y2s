package DATASTRUC_Activities.Activity2;

public class Animal {
    
    public static void main(String[] args) {
        
        clsCat c = new clsCat("Mario", "House", "Orange", 3);
        clsDog d = new clsDog("Rocky", "House", "Brown", 4);
        clsParrot p = new clsParrot("Chie", "House", "Red", 5);
        c.displayInfo();
        d.displayInfo();
        p.displayInfo();
    }
}
