package DATASTRUC_Activities.Activity2;

public abstract class clsAnimalKingdom {
    //abstract classes cannot instantiate objects, its purpose is only to extend from

    //abstract classes usually contains atleast one empty abstract methods.no curly brackets/statements, just semi-colon
    public abstract void displayInfo();

    protected String name, habitat, color;
    protected int age;

    //superclass constructor: initializes the data fields, doesn't require arguments
    public clsAnimalKingdom(){
        name = " ";
        habitat =" ";
        color = " ";
        age = 0;
    }

    //another constructor that requires arguments
    public clsAnimalKingdom(String name, String h, String c, int a){
        this.name = name;
        habitat = h;
        color = c;
        age = a;
    }

    //get methods
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
    public String getHabitat(){
        return habitat;
    }
    public String getColor(){
        return color;
    }

    //set methods
    public void setName(String n){
        name = n;
    }
    public void setHabitat(String h){
        habitat = h;
    }
    public void setColor(String c){
        color = c;
    }
    public void setAge(int a){
        age = a;
    }
}
