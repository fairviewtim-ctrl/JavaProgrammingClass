import java.util.Scanner;
import java.util.Random;

public class Week3 {
    static void main(String[] args) { //Method, where the prog. starts
        Scanner input = new Scanner(System.in); //Creates a new scanner, new means new object
        //2nd scanner calls
        Random random = new Random(); //Creates an object using the Random class
        //random is the reference, //new Random() contructs the object

        System.out.println("WELCOME TO THE NUMBER GUESSING GAME!");

        System.out.print("Enter your name: ");
        String playerName = input.nextLine();
        String displayName = playerName.toUpperCase();//method, converts letters in string to uppercase
        //if playerName = "Martin", the displayName= "MARTIN"

        int nameLength = playerName.length();
        //example "martin", nameLength = 6. Remember that spaces count
        //example "martin Carls", nameLength = 12, includes the spaces
        int secretNumber = random.nextInt(20) + 1;
        //generates number between 1 and 20
        //our game requires a num 1-20, that's why we are adding 1. Nums start from 0 so actually 0-19
        //adding 1 shifts range from 0 to 19 to a new range which is 1 and 20

        int maxAttempts = 5;
        int attempts = 0;
        int guess = 0;
        int score = 100; //initiates score at 100 points, later we'll adjust
        //we would calc the final score based on num of attempts

        boolean won = false; //we use to understand if user guessed right

        System.out.println("\nHello, " + displayName + "!");
        System.out.println("Guess a number between 1 and 20.");
        System.out.println("You have " + maxAttempts + " attempts.");

        while (attempts < maxAttempts && !won) { //introducted the while loop
            //allows us to repeat instructions while a particular condition is true
            //attempts < maxAttempts, means the player still has attempts remaining
            //&& - Logical And: both conditions must be true
            //!won - means the player has not won yet, ! means not
            System.out.print("\nEnter your guess: ");
            guess = input.nextInt();

            //guess doesnt have int before it, bc guess was already declared

            if (guess < 1 || guess > 20) { //checks if the player enters a number outside of parimeter
                // || is the operator that means logical OR
                System.out.println("Enter a number from 1 to 20");
                continue; //looops control statement, skips remaining statement in the current to the loops condition.
            }

            attempts++; //adds 1 to attempts


            int difference = Math.abs(secretNumber - guess);//Math class
            //Math.abs() returns the absolute value of a number
            //if player guesses 18, and secretNumber is 15, then 15-18=-3, absolute diff is 3
            if (guess == secretNumber) {//==checks if two values are equal

                won = true;
                System.out.println("Correct! You found the number!");
            } else if (guess < secretNumber) {
                //only checked when og condition is false, checks whether guess is too low
                System.out.println("Too low!");

            } else { //executes when the previous condition is false
                System.out.println("Too high!");

            }
            if (!won && difference <= 2) {
                //checks two things: 1) if player hasnt won, and 2) if difference is less than or equal to 2
                System.out.println("Hints: You are very close!");
            }
        }
            if (won) { //checks if player won
                score = Math.max(0, 100 - (attempts - 1) * 20);
                //Math.max(0, comparing the zero with the calculated score
            } else {

                score = 0;
                System.out.println("\nGame over!");
                System.out.println("The secret number was " + secretNumber);


                //%-20s = left alligns
                //%.if displays a floating point number with 1 decimal point
                //%% displays a literal percent symbol
            }
            input.close();
        }
    }
