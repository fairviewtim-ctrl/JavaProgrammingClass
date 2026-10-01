import java.util.Scanner;
import java.util.Random;
public class AssignmentThree {
    public void main(String[] args) {


        byte word = Random()
        byte correct =
        byte letters = word - correct;
        byte chance = 10;
        char guess = 'a';


        System.out.println("Your word is:");
        System.out.println("_____");
        System.out.println("You have " + letters + " letters remaining");
        Scanner input = new Scanner(System.in);

        //while statement asks for letter guess while chances are greater than 0
        while chance > 0 {
        System.out.println("Guess a letter:");
        char guess = input.next().charAt(0);

        System.out.println ("You entered: " + guess);
        /* Placeholder:
            if guess is correct
                Display character in spot
            else


         */





    }
}
