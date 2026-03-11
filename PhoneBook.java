package DATASTRUC_Activities;
import java.util.*;

class PhoneContact {
    String firstname, lastname, company, alias, phone, email;

    public PhoneContact(String firstname, String lastname, String company, String alias, String phone, String email){
        this.firstname = firstname;
        this.lastname = lastname;
        this.company = company;
        this.alias = alias;
        this.phone = phone;
        this.email = email;
    }

    public void display(){
        System.out.println("=== Display ===");
        System.out.println("Name: "+firstname+" "+lastname);
        System.out.println("Company: "+company);
        System.out.println("Alias: "+alias);
        System.out.println("Phone: "+phone);
        System.out.println("Email: "+email);
        System.out.println();
    }

    static Scanner input = new Scanner(System.in);
    static ArrayList<PhoneContact> contacts = new ArrayList<>();

    public static void addContact(){
        System.out.println("=== Add Contact ===");
        System.out.print("First Name: ");
        String fname = input.nextLine();
        System.out.print("Last Name: ");
        String lname = input.nextLine();
        System.out.print("Company: ");
        String company = input.nextLine();
        System.out.print("Alias: ");
        String alias = input.nextLine();
        System.out.print("Pnone: ");
        String phone = input.nextLine();
        System.out.print("Email: ");
        String email = input.nextLine();

        contacts.add(new PhoneContact(fname,lname,company,alias,phone,email));
        System.out.println("Contact added successfully!");
        System.out.println();
    }

    public static void updateContact(){
        System.out.println("=== Update Contact ===");
        System.out.print("Enter the fullname to update: ");
        String name = input.nextLine().trim();

        for(PhoneContact c : contacts){
            String fullname = c.firstname +" "+ c.lastname;

            if((fullname.equalsIgnoreCase(name))){
                System.out.print("Updating contact: " + fullname);
                input.nextLine();
                System.out.print("First Name: ");
                c.firstname = input.nextLine();
                System.out.print("Last Name: ");
                c.lastname = input.nextLine();
                System.out.print("Company: ");
                c.company = input.nextLine();
                System.out.print("Alias: ");
                c.alias = input.nextLine();
                System.out.print("Phone: ");
                c.phone = input.nextLine();
                System.out.print("Email: ");
                c.email = input.nextLine();
                System.out.println("Update Complete!");
                System.out.println();
                return;
            }
        }
        System.out.print("Contact not found!");
    }

    public static void searchContact(){
        System.out.println("=== Search Contact ====");
        System.out.print("Enter the fullname to search: ");
        String name = input.nextLine().trim();

        for(PhoneContact c : contacts){
            String fullname = c.firstname +" "+ c.lastname;
            if(fullname.equalsIgnoreCase(name)){
                c.display();
            }
        }
        System.out.println();
    }

    public static void deleteContact(){
        System.out.println("=== Delete Contact ===");
        System.out.print("Enter the fullname to search: ");
        String name = input.nextLine().trim();
        boolean found = false;
            
        for(int i = 0; i < contacts.size(); i++){
            PhoneContact c = contacts.get(i);
            String fullname = c.firstname +" "+ c.lastname;

            if(fullname.equalsIgnoreCase(name)){
                contacts.remove(i);
                System.out.print("Contact Deleted!");
                found = true;
                break;
            }
        }   
        if(!found){
            System.out.print("Contact not found!");
        }
        System.out.println();
    }
    
    public static void displayAllContact(){
        System.out.println("=== All Contacts ===");
        if(contacts.isEmpty()){
            System.out.print("No Contacts!");
        } else {
            contacts.forEach(PhoneContact::display);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("=== Phone Book ===");
            System.out.println("1. Add \n2. Update \n3. Search \n4. Delete \n5. Display \n0. Exit");
            System.out.print("Choice: ");
            choice = Integer.parseInt(input.nextLine());
            System.out.println();

            switch (choice) {
                case 1 -> addContact();
                case 2 -> updateContact();
                case 3 -> searchContact();
                case 4 -> deleteContact();
                case 5 -> displayAllContact();
                case 0 -> System.out.println("You've exited from Phone Book!");
                default -> System.out.println("Invalid choice.\n");
            }
        } while (choice != 0);
        
    }

}

