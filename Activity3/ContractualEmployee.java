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
        double overtimepay;
        double overtimehrs;
        double regularPay;
        final double regularHrs = 8;

        if(getHoursWrk() <= regularHrs){
            return getHoursWrk()*getHourlyRate();//9*90 = 810
        } else {
            regularPay = regularHrs*getHourlyRate();//8*90 = 720
            overtimehrs = getHoursWrk() - regularHrs;//9-8 = 1
            overtimepay = overtimehrs * (getHourlyRate()*getOvertime());//1*(90*1.25) = 112.5
            return regularPay + overtimepay; //720 + 112.5 = 832.5
        }

    }
}
