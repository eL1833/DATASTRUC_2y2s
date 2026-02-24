package DATASTRUC_Activities.Activity2;

public class TestPerson {
    
    public static void main(String[] args) {
        
        RegularEmployee regularEmployee = new RegularEmployee("Christina", "Benson", 
                                                                "122787", 8.0, 80, 
                                                                "Accountant", "Finance", 300.0);
        ContractualEmployee contractualEmployee = new ContractualEmployee("Danica", "Putan", 
                                                                "120604", 9.0, 90,
                                                                "Student Teacher", "Math", 1.25);//overtime per hour
        Student student = new Student("Leo", "Benson", 
                                        "042313", "Civil Engineering", "Engineering");  
                                        
        System.out.println("----REG-EMPLOYEE-NAME---|-------SALARY-------");
        System.out.println(regularEmployee.displayInfo()+"      |  "+regularEmployee.iComputeSalary());
        System.out.println("");
        System.out.println("----CON-EMPLOYEE-NAME---|-------SALARY-------");
        System.out.println(contractualEmployee.displayInfo()+"          |  "+contractualEmployee.iComputeSalary());
        System.out.println("");
        System.out.println("------STUDENT-NAME------|-------COURSE-------");
        System.out.println(student.displayInfo()+"            |  "+student.getCourse());
        System.out.println("");
    }
}
