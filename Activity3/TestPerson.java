package DATASTRUC_Activities.Activity2;

public class TestPerson {
    
    public static void main(String[] args) {
        
        RegularEmployee regularEmployee = new RegularEmployee("Christina", "Benson", 
                                                                "122787", 8.0, 500, 
                                                                "Accountant", "Finance", 300.0);
        ContractualEmployee contractualEmployee = new ContractualEmployee("Danica", "Putan", 
                                                                "120604", 8.0, 400,
                                                                "Student Teacher", "Math", 100.0);
        Student student = new Student("Leo", "Benson", 
                                        "042313", "Civil Engineering", "Engineering");  
                                        
        System.out.println("----------NAME----------|-------SALARY-------");
        System.out.println(regularEmployee.displayInfo()+"      |  "+regularEmployee.iComputeSalary());
        System.out.println(contractualEmployee.displayInfo()+"          |  "+contractualEmployee.iComputeSalary());
        System.out.println("------STUDENT-NAME------|-------COURSE-------");
        System.out.println(student.displayInfo()+"            |  "+student.getCourse());
        
        



    }
}
