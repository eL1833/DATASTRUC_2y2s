package DATASTRUC_Activities.Activity2;

public class Employee extends Person implements iCompute{
   
   private double hoursWrk;
   private double hourlyRate;
   private String idNo;
   private String position;
   private String department;

   public Employee(String firstname, String lastname, String idNo, double hoursWrk, double hourlyRate, String position, String department){
      super(firstname, lastname);
      this.idNo = idNo;
      this.hoursWrk = hoursWrk;
      this.hourlyRate = hourlyRate;
      this.position = position;
      this.department = department;
   }
   
   public String getIdNo(){
      return idNo;
   }
   public String getPosition(){
      return position;
   }
   public String getDepartment(){
      return department;
   }
   public double getHoursWrk(){
      return hoursWrk;
   }
   public double getHourlyRate(){
      return hourlyRate;
   }
   
   public void setIdNo(String idNo){
      this.idNo = idNo;
   }
   public void setPosition(String position){
      this.position = position;
   }
   public void setDepartment(String department){
      this.department = department;
   }
   public void setHoursWrk(double hoursWrk){
      this.hoursWrk = hoursWrk;
   }
   public void setHourlyRate(double hourlyRate){
      this.hourlyRate = hourlyRate;
   }

   @Override
   public double iComputeSalary(){
      return (getHoursWrk() * getHourlyRate());
   }
   
}
  
