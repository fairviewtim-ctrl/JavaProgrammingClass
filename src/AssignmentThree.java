import java.util.Scanner;
import java.util.Random;

public class AssignmentThree {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         Random rand = new Random();
         String[] words = {"apple", "quiet", "water", "money", "plant"};
         String word = words[rand.nextInt(5)].toUpperCase();
         byte chance = 10;
         char guess = 'a';
         char[] display = new char[word.length()];
         for (int i = 0; i < word.length(); i++)
             display[i] = '_';

         System.out.println("\nYour Word Is:");
         System.out.println("******************************************");
         System.out.println("\n                  " + new String(display));
         System.out.println("\n******************************************");


         while (chance > 0) {
             boolean found = false;
             System.out.println("\nGuess a Letter:");
             guess = Character.toUpperCase(input.next().charAt(0));
             System.out.println("You Entered: " + guess);

             for (int i = 0; i < word.length(); i++) {
                 if (word.charAt(i) == guess) {
                     display[i] = guess;
                     found = true;
                 }
             }
             System.out.println("\n******************************************");
             System.out.println("                  " + new String(display));
             System.out.println("******************************************");

             if (new String(display).equals(word)) {
                 System.out.println("\nYou won! The word was: " + word);
                 break;
             }
             if (found) {
                 System.out.println("Correct!");
                 continue;


             } else {
                 chance--;
                 System.out.println("\nIncorrect! Try Again! (" + chance + " Chances Remaining");
                 continue;

             }
         }

         if (chance == 0) {
             System.out.println("You Lost! Better Luck Next Time!");
         }
     }
        }


