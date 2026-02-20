package DATASTRUC_Activities.Activity2;

public class RegularEmployee extends Employee {
    
    public double bonus;
    
    public RegularEmployee(String firstname, String lastname, String idNo, double hoursWrk, double hourlyRate, String position, String department, double bonus){
      super(firstname, lastname, idNo, hoursWrk, hourlyRate, position, department);
      this.bonus = bonus;
    }

    public double getBonus(){
        return bonus;
    }

    public void setBonus(double bonus){
        this.bonus = bonus;
    }

    @Override 
    public double iComputeSalary(){
        return (getHoursWrk() * getHourlyRate()+bonus);
    }
}
