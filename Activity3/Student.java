package DATASTRUC_Activities.Activity2;

public class Student extends Person{
    
    private String idNo;
    private String course;
    private String department;

    public Student(String firstname, String lastname, String idNo, String course, String department){
        super(firstname, lastname);
        this.idNo = idNo;
        this.course = course;
        this.department = department;
    }
    
    public String getIdNo(){
        return idNo;
    }
    public String getCourse(){
        return course;
    }
    public String getDepartment(){
        return department;
    }
}
