package Activities;

import java.util.Scanner;

public class TestWedding {
    
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the bride's first name >> ");
        String brideFirst = input.nextLine();
        System.out.print("Enter the bride's last name >> ");
        String brideLast = input.nextLine();

        System.out.print("Enter the groom's first name >> ");
        String groomFirst = input.nextLine();
        System.out.print("Enter the groom's last name >> ");
        String groomLast = input.nextLine();

        System.out.print("Enter the Wedding date(mm/dd/yy) >> ");
        String localDate = input.nextLine();

        System.out.print("Enter the Wedding venue >> ");
        String venue = input.nextLine();

        Person bride = new Person(brideFirst, brideLast);
        Person groom = new Person(groomFirst, groomLast);
        Couple couple = new Couple(bride, groom);
        Wedding wedding = new Wedding(couple, localDate, venue);

        System.out.println("\n-----WEDDING DETAILS-----");
        System.out.println("Congratulations to " 
                            + wedding.getCouple().getBride().getFirstName() +" "+ wedding.getCouple().getBride().getLastName() + " & "
                            + wedding.getCouple().getGroom().getFirstName() +" "+ wedding.getCouple().getGroom().getLastName()  + "\n"
                            + "This " + wedding.getLocalDate() + " at " + wedding.getVenue()
        );
        input.close();
    }
}
