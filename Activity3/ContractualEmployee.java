package DATASTRUC_Activities.Activity2;

public class ContractualEmployee extends Employee{
    
    protected double overtime;
    
    public ContractualEmployee(String firstname, String lastname, String idNo, double hoursWrk, double hourlyRate, String position, String department, double overtime){
      super(firstname, lastname, idNo, hoursWrk, hourlyRate, position, department);
      this.overtime = overtime;
    }

    public double getOvertime(){
        return overtime;
    }

    public void setOvertime(double overtime){
        this.overtime = overtime;
    }

    @Override 
    public double iComputeSalary(){
        return (getHoursWrk() * getHourlyRate() + overtime);
    }
}

