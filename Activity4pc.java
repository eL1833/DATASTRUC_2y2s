package DATASTRUC_Activities.Activity4;

class PhoneContact {

    private String firstname, lastname, company, alias, phone, email;

    public PhoneContact(String firstname, String lastname, String company, String alias, String phone, String email){
        this.firstname = firstname;
        this.lastname = lastname;
        this.company = company;
        this.alias = alias;
        this.phone = phone;
        this.email = email;
    }

    public String getFirstname(){
        return firstname;
    }
    public void setFirstname(String firstname){
        this.firstname = firstname;
    }

   public String getLastname(){
        return lastname;
    }
    public void setLastname(String lastname){
        this.lastname = lastname;
    }

    public String getCompany(){
        return company;
    }
    public void setCompany(String company){
        this.company = company;
    }

    public String getAlias(){
        return alias;
    }
    public void setAlias(String alias){
        this.alias = alias;
    }

    public String getPhone(){
        return phone;
    }
    public void setPhone(String phone){
        this.phone = phone;
    }

    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }

    public void displayContact(){
        System.out.println("\nName: "+firstname+" "+lastname);
        System.out.println("Company: "+company);
        System.out.println("Alias: "+alias);
        System.out.println("Phone: "+phone);
        System.out.println("Email: "+email);
    }
}


