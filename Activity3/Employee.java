public class Employee extends Person{
   
   protected int idNo;
   protected int hoursWrk;
   protected int hourlyRate;
   protected String position;
   protected String department;
   
   public int getIdNo(){
      return idNo;
   }
   public int getHoursWrk(){
      return hoursWrk;
   }
   public int getHourlyRate(){
      return hourlyRate;
   }
   public String getPosition(){
      return position;
   }
   public String getDepartment(){
      return department;
   }
   
   public void setIdNo(int idNo){
      this.idNo = idNo;
   }
   public void setHoursWrk(int hoursWrk){
      this.hoursWrk = hoursWrk;
   }
   public void setHourlyRate(int hourlyRate){
      this.hourlyRate = hourlyRate;
   }
   public void setPosition(int position){
      this.position = position;
   }
   public void setDepartment(int department){
      this.department = department;
   }
   
}
