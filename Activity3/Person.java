package DATASTRUC_Activities.Activity2;

public abstract class Person{
   
   protected String lastname;
   protected String firstname;

   public Person(){
      lastname = "";
      firstname = " ";
   } 

   public Person(String firstname, String lastname){
      this.firstname = firstname;
      this.lastname = lastname;
   }
   
   public String getLastName(){
      return lastname;
   }
   public String getFirstName(){
      return firstname;
   }

   public void setLastName(String lastname){
      this.lastname = lastname;
   }
   public void setFirstName(String firstname){
      this.firstname = firstname;
   }

   public String displayInfo(){
      return " "+lastname+", "+firstname;
   };
}
