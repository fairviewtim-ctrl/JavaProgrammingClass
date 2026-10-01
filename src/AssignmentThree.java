import java.util.Scanner;
import java.util.Random;



public class AssignmentThree {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         Random rand = new Random();
         String[] words = {"apple", "quiet", "water", "money", "plant"};
         String word = words[rand.nextInt(5)];
         byte chance = 10;
         char guess = 'a';
         boolean found = false;
         char[] display = new char[word.length()];
         for (int i = 0; i < word.length(); i++)
             display[i] = '_';

         System.out.println("Your word is:");
         System.out.println(display);


         //while statement asks for letter guess while chances are greater than 0
         while (chance > 0) {
             System.out.println("You have " + chance + " chances remaining");
             System.out.println("Guess a letter:");
             guess = input.next().charAt(0);
             System.out.println("You entered: " + guess);

             for (int i = 0; i < word.length(); i++) {
                 if (word.charAt(i) == guess) {
                     display[i] = guess;
                     found = true;
                 }
             }
                 System.out.println(display);

             if (new String(display).equals(word)) {
                 System.out.println("You won! The word was: " + word);
                 break;
             }
             if (found) {
                 System.out.println("Correct!");
                 continue;


             } else {
                 chance--;
                 System.out.println("Incorrect! Try again!");
                 continue;

             }
         }

         if (chance == 0) {
             System.out.println("You lost! Better luck next time!");
         }
     }
        }


