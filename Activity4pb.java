package DATASTRUC_Activities.Activity4;
import java.util.*;

class PhoneBook {
    private Scanner input = new Scanner(System.in);
    private ArrayList<PhoneContact> contacts = new ArrayList<>();

    public void addContact(){
        System.out.println("\n=== Add Contact ===");
        System.out.print("First Name: ");
        String fname = input.nextLine();

        System.out.print("Last Name: ");
        String lname = input.nextLine();

        System.out.print("Company: ");
        String comp = input.nextLine();

        System.out.print("Alias: ");
        String alias = input.nextLine();

        System.out.print("Phone: ");
        String phone = input.nextLine();

        System.out.print("Email: ");
        String email = input.nextLine();

        PhoneContact contact = new PhoneContact(fname, lname, comp, alias, phone, email);
        contacts.add(contact);

        System.out.println("Contact is added successfully!");
    }

    public void updateContact(){
        System.out.println("\n=== Update Contact ===");
        System.out.print("Enter full name to update: ");
        String name = input.nextLine();

        for (PhoneContact con : contacts) {
            String fullname = con.getFirstname()+" "+con.getLastname();

            if (fullname.equalsIgnoreCase(name)) {

                System.out.print("First Name: " );
                con.setPhone(input.nextLine());

                System.out.print("Last Name: ");
                con.setPhone(input.nextLine());

                System.out.print("New Company: ");
                con.setPhone(input.nextLine());

                System.out.print("New Alias: ");
                con.setPhone(input.nextLine());
                
                System.out.print("New Phone: ");
                con.setPhone(input.nextLine());

                System.out.print("New Email: ");
                con.setEmail(input.nextLine());

                System.out.println("Contact updated!");
                return;
            }
        }
        System.out.println("Contact not found.");
    }
    

    public void searchContact(){
        System.out.println("\n=== Search Contact ====");
        System.out.print("Enter the full name to search: ");
        String name = input.nextLine();

        for(PhoneContact con : contacts){
            String fullname = con.getFirstname()+" "+con.getLastname();

            if (fullname.equalsIgnoreCase(name)){
                con.displayContact();
                return;
            }
        }
        System.out.println("Contact not found.");
    }

    public void deleteContact(){
        System.out.println("\n=== Delete Contact ===");
        System.out.print("Enter the full name to delete: ");
        String name = input.nextLine();

        for(PhoneContact con : contacts){
            String fullname = con.getFirstname()+" "+con.getLastname();

            if(fullname.equalsIgnoreCase(name)){
                contacts.remove(con);
                System.out.print("Contact deleted successfully!");
                return;
            }
        }
        System.out.print("Contact not found.");
    }

    public void displayAllContacts(){
        System.out.println("\n=== All Contacts ===");
        if(contacts.isEmpty()){
            System.out.println("PhoneBook is Empty.");
            return;
        }

        for(PhoneContact con : contacts){
            con.displayContact();
        }
    }

    public static void main(String[] args) {
        int choice; 

        PhoneBook pbook = new PhoneBook();
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("\nPHONE BOOK MENU");
            System.out.println("1. Add Contact");
            System.out.println("2. Update Contact");
            System.out.println("3. Search Contact");
            System.out.println("4. Delete Contact");
            System.out.println("5. Display All Contacts");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");
            choice = input.nextInt();
            input.nextLine(); 

            switch(choice){
                case 1 -> pbook.addContact();
                case 2 -> pbook.updateContact();
                case 3 -> pbook.searchContact();
                case 4 -> pbook.deleteContact();
                case 5 -> pbook.displayAllContacts();
                case 0 -> System.out.println("You've exited from Phone Book!");
                default -> System.out.println("Invalid choice.\n");
            } 
        } while (choice != 0);
        input.close();
    }
}

