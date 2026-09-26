import java.util.Scanner;
public class assignmentTwo {
    public static void main(String[] args) {
        int rent = 0;
        double entertainment = 0;
        long groceries = 0;
        long savings = 0;
        long debt = 0;
        short income = 0;
        short transport = 0;
        short school = 0;
        byte internet = 0;
        byte phone = 0;
        byte subscriptions = 0;

        double remaining = 0;
        boolean withinBudget = true;
        char currency = '$';

        Scanner input = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = input.nextLine();
        System.out.println("Hello " + name + "!" + "Input your monthly income");
            income = input.nextShort();
        System.out.println("How much do you spend on rent?");
            rent = input.nextInt();
        System.out.println("How much do you spend on groceries");
            groceries = input.nextLong();
        System.out.println("How much do you spend on transportation?");
            transport = input.nextShort();
        System.out.println("How much do you spend on your phone?");
            phone = input.nextByte();
        System.out.println("How much do you spend on internet?");
            internet = input.nextByte();
        System.out.println("How much do you spend on entertainment?");
            entertainment = input.nextDouble();
        System.out.println("How much do you spend on school expenses?");
            school = input.nextShort();
        System.out.println("How much do you spend on savings?");
            savings = input.nextLong();
        System.out.println("How much do you spend on debt repayment?");
            debt = input.nextLong();
        System.out.println("How much do you spend on subscriptions?");
            subscriptions = input.nextByte();

        double expenses = rent+entertainment+groceries+savings+debt+transport+school+internet+phone+subscriptions;
        remaining = income - expenses;
        double weekly = expenses/4;
        System.out.println("\n\tYour total monthly expenses are " + currency + expenses);
        System.out.println("\n\tYour total weekly expenses are " + currency + weekly);
        System.out.println("\n\tYou have " + currency + remaining + " left this month");
        System.out.println("\n\tYou spend " + (expenses/income)*100 + "% of your income");

    }

}
