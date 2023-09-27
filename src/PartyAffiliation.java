import java.util.Locale;
import java.util.Scanner;

public class PartyAffiliation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your party Affiliation, D, R, or I. (Democrat, Republican, or Independent");
        String party = scan.nextLine();
        party = party.toUpperCase();
        if(party.equals("D")){
            System.out.println("you get a Democrat Donkey.");
        }else if(party.equals("R")){
            System.out.println("You get a Republican Elephant.");
        }else if(party.equals("I")){
            System.out.println("You get a Independent Person.");
        }else{
            System.out.println("Error: you did not enter a party Affiliation.");
        }

    }
}