package hello;

import java.util.Scanner;

public class ConsoleIO {

    public static void main(String[] args) {
        new ConsoleIO().run();
    }

    public void run() {

        /*
         * Console Output
         */

        // The way to output a string to the console is
        System.out.println("Hello World!");

        // NOTE: the println command can be used to print
        //       any native type value
        System.out.println("Circumference of a circle of radius 1 = " + (2 * Math.PI * 1));

        System.out.println("a = 1, b = 1");
        int a = 1;
        int b = 1;

        // Print the value of the sum of a + b
        System.out.println(a + b);

        // If there is another string in the list, then the
        // plus operator '+' turns into append.
        // This statement will print 11.
        System.out.println("a + b = " + a + b);

        // By using print instead of println, the values are printed on the same line
        System.out.print("a + b = ");
        System.out.print(a + b);
        // At the end of the line insert a carriage return
        System.out.println();


        /*
         * Console input
         *
         * Use the Scanner class to read input lines
         *
         * Sanners can be used to read from files, or byte streams, or from the console input
         */

        // System.in is the console input
        Scanner scanner = new Scanner(System.in);

        // Put up a prompt
        System.out.println("Enter your name (and press enter) :");

        // Read a line of input from the input stream
        String name = scanner.nextLine();

        System.out.println("Hello " + name + "!");

        // The scanner has methods to read the next string or the next integer on the input stream
        System.out.println("Enter a number and I will guess it : ");
        int intValue = scanner.nextInt();
        System.out.println("You entered " + intValue + " - I am AMAZING at guessing numbers!");

    }

}
