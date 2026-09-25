import java.util.Scanner; //This tells Java that we want to use the Scanner class
//Scanner allows us to get input from the user
public class Testy { //This is a class
    public static void main(String[] args) { //Main method, where the program starts
        //think of it as main()= "Start here
        //public = Access modifier: java access from outside the class
        /* static = Belongs to the class: java can run main without creating an object,
        this is important because Java is OOP (Object oriented program) */
        //void void = Return type, this method doesn't return a value
        //() parameters, anything the method received goes inside these parameters
        //String[] = array of Strings, a collection of text values
        //args: variable name: the name given to String[], name of the array
        Scanner input = new Scanner(System.in); //Created a scanner called "input"
        System.out.println("What is your name?"); //Means we want to receive info from keyboard
        String name = input.nextLine(); //waits for the user to type something
        // String means the variable stores what is provided in text
        // Name: is a variable, creating a box called name
        // =: assignment operator, assigns value to variable. Is not mathematical
        System.out.println("Hello, " + name + "!");
        //.: means access something inside or belongs to
        //out: standard output on the screen
        //println: print line, display something then move cursor to next time
        //print: print string on same line
        //+: concatenation, joins things together, usually used in Strings
        input.close(); //input is the Scanner name from line 13, closes the scanner



    }
}
