package hello;

public class IfElse {

    public static void main(String[] args) {
        new IfElse().run();
    }

    public void run() {

        /*
         * If statements and logical expressions
         *
         * If statements use logical expressions (that evaluate to true or false)
         * in order to define a path through the code.
         *
         * If statements and logical expressions are the basic building blocks
         * of programming.
         */
        boolean condition = true;
        if (condition) {
            System.out.println("The condition in the if statement is true");
        }
        else {
            System.out.println("The condition in the if statement is false");
        }

        /*
         * Logical expressions are used to create conditions, by convention
         * the brackets () in an if statement hold the logical expression
         * to be evaluated.
         */
        int a = 5;
        int b = 6;
        System.out.println("a = " + a + ", b = " + b);

        if (a > b) {
            System.out.println("a is bigger");
        }
        else {
            System.out.println("b is bigger");
        }

        // Notice that the code above does not deal with equals! If they
        // are equal, then it will say that b is bigger.

        // If statements can be nested inside of each other to
        // produce more complex logic
        b = 5;
        System.out.println("a = " + a + ", b = " + b);
        if (a == b) {
            System.out.println("a = b");
        }
        else {
            if (a > b) {
                System.out.println("a is bigger");
            }
            else {
                System.out.println("b is bigger");
            }
        }

        // Alternately, the brackets can be removed around the second
        // part of the if statement in order to make an else if
        if (a == b) {
            System.out.println("a = b");
        }
        else if (a > b) {
            System.out.println("a is bigger");
        }
        else {
            System.out.println("b is bigger");
        }

        // By convention, the else if would only be used if the same
        // variables are being tested for another condition.  Using
        // complex else if statements on different variables can
        // create confusion in debugging

        /*
         * Logical Expressions
         *
         * Logical expressions use the following comparator values which
         * bind in the following order of precedence (similar to BEDMAS).
         *
         * Test for        Symbol
         * (any math operator binds higher than any relational operator)
         * Relational       >, >=, <, <=
         * Equivalent       ==, !=    (not a single = which means set the variable)
         * And              &&
         * Or               ||
         */
        a = 3;
        b = 4;
        int c = 5;
        int d = 6;

        System.out.println("a = " + a + ", b = " + b + ", c = " + c + ", d = " + d);

        // When evaluating math in an if statement, the math is always done first, then
        // the comparisons in the order listed
        System.out.println("a+b = " + (a+b) + ", c+d = " + (c+d));
        // NOTE: brackets are required ^^^

        if (a + b > c + d) {
            System.out.println("a+b  is bigger");
        }
        else {
            System.out.println("c+d  is bigger");
        }

        // In a complex if statement, > binds tighter then &&
        // and && binds tighter than ||
        if (a > 2 && b < 7 || c > 3 && d < 6) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        if (a > 2 && (b < 7 || c > 3) && d < 6) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        // Logical expressions can be evaluated OUTSIDE of If statements !!!!
        boolean result = a > 2 && (b < 7 || c > 3) && d < 6;
        System.out.println(result);
        

    }
}
