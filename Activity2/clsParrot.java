package DATASTRUC_Activities.Activity2;

public class clsParrot extends clsAnimalKingdom{

     public clsParrot(){
        super();
    }

     //subclass constructor
    public clsParrot(String n, String h, String c, int a){
        super(n, h, c, a);
    }

    //every subclass must contain the abstract method of the parent class
    public void displayInfo(){
        System.out.println("The Parrot's name is "+super.getName()+", it lives in the "+super.getHabitat()+", with a color of "+super.getColor()+" and its age is "+super.getAge());
    }

}

