import java.util.Scanner;
import java.util.ArrayList;

public class assignmentFive {
    //program will ask for budget, and grocery items needed to make a grocery list
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Let's make a grocery list!");
        System.out.print("What's your name?");
        String name = input.nextLine();

        System.out.print("What's your budget?");
        double budget = input.nextDouble();
        input.nextLine();

        double total = 0;
        String more = "yes";
        ArrayList<String> list = new ArrayList<>();

        while (more.equalsIgnoreCase("yes")) {
            System.out.print("\nEnter a grocery item:");
            String item = input.nextLine();

            System.out.print("Enter the price:");
            double price = input.nextDouble();
            input.nextLine();
            total = total + price;

            if (price > 0) {
                System.out.println("\n" + item + " added to your list");
                list.add(item);
                if (total > budget) {
                    System.out.println("You are over budget ($" + total + ")");
                } else {
                    System.out.println("You are still within budget ($" + total + ")");
                }

            } else {
                System.out.println("Invalid price! Item wasn't added.");
            }
            System.out.print("Do you have more to add? (yes/no)");
            more = input.nextLine();

        }
        System.out.println("Would you like to print out your shopping list? (yes/no)");
        String print = input.nextLine();

        if (print.equalsIgnoreCase("yes")){
            System.out.println("Here's your list, " + name + "! Your total is going to be " + total);
            for (String items : list) {
                System.out.println(items);
            }


            if (total <= budget) {
                System.out.println("Your list is within budget! Great job");
            } else {
                System.out.println("Your list is over budget. You might want to rethink your life");
            }

        } else {
            System.out.println("Hope you can remember!");

        }
    }
}
