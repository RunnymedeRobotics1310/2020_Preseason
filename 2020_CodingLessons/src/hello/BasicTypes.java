package hello;

public class BasicTypes {

    public static void main(String[] args) {
        new BasicTypes().run();
    }

    public void run() {

        // Comments

        // A double slash // starts a comment at any point in the
        // program and it runs to the end of the line
        int alphabetLength = 26;  // You can place a comment here

        // Comments are a useful way to tell others
        // about the code that you are writing.  In a comment
        // it is important to say WHY you are writing this code
        // or DESCRIBE the overall step in the code.

        // DO NOT WRITE a comment that tells you WHAT you are
        // about to write in code.

        // Example of a bad comment:
        // Declare variable xyz   <- I wish I could not have read that comment
        int xyz = 0;

        /*
         * Another way to mark a long running comment is using the /* to
         * begin a comment and * slash / to end the comment.
         *
         * In this way, the comment can span a lot of lines.
         */

        /* *****************************************************************
         * Native Types in Java (that we use commonly in FRC)
         *
         * Each native type has a paired helper class that can be used to
         * get the maximum value for the native type, or to convert from
         * a String to that type using the method valueOf();
         *
         * Native Type          Companion Class
         * boolean              Boolean
         * int                  Integer
         * long                 Long
         * double               Double
         * char                 Character
         * -                    String  (String is a class, not a native type)
         *
         * NOTE: there are more, but these are the ones used in FRC
         * *****************************************************************/

        /*
         * Boolean
         *
         * Booleans can have the values of true or false;
         * Booleans cannot have another value
         *
         */
        boolean a = true;
        boolean b = false;

        /*
         * Integer
         *
         * Integers hold any whole number.
         */
        int i = 0;
        int j = Integer.valueOf("1234567890");

        // The maximum value of an integer is
        System.out.println("Max int value " + Integer.MAX_VALUE);

        /*
         *  Long
         *
         *  A long also holds any integer value
         *  but is twice as long as an int
         */
        System.out.println("Max long value " + Long.MAX_VALUE);

        // Typically, long values are used for timers
        long startTime = System.currentTimeMillis();

        // Do something that you want to time
        long endTime   = System.currentTimeMillis();

        long elapsedTime = endTime - startTime;

        System.out.println("Elapsed Time " + elapsedTime);

        /*
         * Double
         *
         * Doubles are used for decimal numbers
         * In FRC, we use doubles to set the speed of a motor
         *
         * Historically, the type float was used for
         * floating point calculations.  Later, doubles
         * were introduced to hold big floating point numbers
         * (twice as big) and float fell out of fashion.
         */
        double pi = 3.1416;
        double leftMotorSpeed = 0.1;

        System.out.println("Max double value " + Double.MAX_VALUE);

        /*
         * Character
         *
         * Character values are single characters.  Their companion
         * class, String, holds an array of characters
         */
        char c = 'A';

        System.out.println("The value of c is " + c);

        /*
         * String
         *
         * A string NOT a native type, it is a Class in Java.  That
         * means that if you declare a string, and do not assign
         * a value to the string, the string value is null.
         */
        String nullString = null;

        System.out.println("String s = " + nullString);

        // Null is different than an empty string
        String emptyString = "";

        System.out.println("String emptyString = " + emptyString);

        // An empty string will have a length of 0, but a null string
        // will throw an exception if you try to get the length
        System.out.println("The length of emptyString is " + emptyString.length());

        // The length of the null string is a null pointer exception
        // Uncomment the following line to try it.
        //System.out.println("The length of nullString is " + nullString.length());

        /*
         * Useful String methods
         */
        String s = "Test String";
        System.out.println(s);

        // Get the first character of a string
        System.out.println("The first character is " + s.charAt(0));

        // Split a string at the space
        String [] subStrings = s.split(" ");
        System.out.println("There are " + subStrings.length + " words");
        System.out.println("The first word is " + subStrings[0]);
        System.out.println("The second word is " + subStrings[1]);

    }
}
