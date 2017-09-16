package helloshopper;
import java.util.Scanner;
        
public class HelloShopper {
    public static void main(String[] args) {
        String username;
        
        //Print to screen, asking user to input their name
        System.out.println("Hello shopper, what is your name?");
        
        //Function to allow user to input their name
        Scanner name = new Scanner(System.in);
        
        //don't allow any input but a name (no numbers!)
        while (!name.hasNext("[A-Za-z]+")) {
        //print out error message if incorrect input
        System.out.println("Nope, that's not it!");
        //accept correct input
        name.next();
    }
        //save correct input to variable
        username = name.next();
        
        //Print to screen: comment with the user's name
        System.out.println("Thank you " + username + ". "
        + "It is my pleasure to help you today.");
        
        //stop the program
        System.exit(0);
    }
}
