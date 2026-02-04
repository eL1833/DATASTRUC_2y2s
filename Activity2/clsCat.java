package DATASTRUC_Activities.Activity2;

public class clsCat extends clsAnimalKingdom {
    
    //subclass default constructor
    public clsCat(){
        super();
    }

     //subclass constructor
    public clsCat(String n, String h, String c, int a){
        super(n, h, c, a);
    }

    //every subclass must contain the abstract method of the parent class
    public void displayInfo(){
        System.out.println("The Cat's name is "+super.getName()+", it lives in the "+super.getHabitat()+", with a color of "+super.getColor()+" and its age is "+super.getAge());
    }

}
