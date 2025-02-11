import java.util.Scanner;

public class PartyAffiliation {
    public static void main(String[] args) {
        // Scanner + variable declaration
        Scanner in = new Scanner(System.in);
        String menuChoice = "";
        String menu = "D = Democrat\tR = Republican\tI = Independent\nChoose your party: ";

        // Display menu and get user input
        System.out.print(menu);
        menuChoice = in.nextLine();

        // Process and output
        if (menuChoice.equalsIgnoreCase("D")) {
            System.out.println("You get a Democratic Donkey.");
        }
        else if (menuChoice.equalsIgnoreCase("R")) {
            System.out.println("You get a Republican Elephant.");
        }
        else if (menuChoice.equalsIgnoreCase("I")) {
            System.out.println("You get an Independent Man.");
        }
        else {
            System.out.println("Invalid. You must choose D, R, or I, not: " + menuChoice);
        }
    }
}