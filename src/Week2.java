import java.util.Scanner;
public class Week2 { //public means that the class can be accessed from outside the class

    public static void main(String[] args) { //main method, starts from here

        //number# is the scanner output
        //Scanner input is a string
        Scanner num = new Scanner(System.in);
        System.out.println("\tWhats the first number?"); //asks user for input
        double number1 = num.nextDouble();  //converts string to double
        System.out.println("\n \t What about the second number?");
        double number2 = num.nextDouble();

        double sum = number1 + number2;
        System.out.println("\n\t=== Addition ===");
        System.out.println(number1 + " + " + number2 + " + " + " = " + sum);

        System.out.println("\n\t=== Subtraction ===");
        System.out.println(number1 + " - " + number2 + " = " + (number1 - number2));

        System.out.println("\n\t=== Multiplication ===");
        System.out.println(number1 + " * " + number2 + " = " + (number1 * number2));

        System.out.println("\n\t=== Division ===");
        System.out.println(number1 + " / " + number2 + " = " + (number1 / number2));



    }
}
