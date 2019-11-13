package hello;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraysAndLists {

    public static void main(String[] args) {
        new ArraysAndLists().run();
    }

    public void run() {

        /*
         * Arrays
         *
         * Arrays are a group of objects of the same type.
         *
         * The notation for arrays is to use square brackets
         * in the declaration of the array
         */
        int [] fiveIntArray = new int [5];

        // This declares an array of 5 integers.  Once declared,
        // an array never changes length.

        // The length of any array can be found using the .length variable
        System.out.println("fiveIntArray length = " + fiveIntArray.length);

        // Arrays in Java are zero based.  In other words, the
        // first element of an array is accessed at address zero.
        // For example:
        int firstInt  = fiveIntArray[0];
        int secondInt = fiveIntArray[1];
        // etc.

        // Declaring an array of a native type sets the initial values
        // of the elements of the array to the default value for the
        // type:
        //    boolean                 false
        //    int, long, double       0
        //    char                    hex(0) (not equal to space)
        //    String or other class   null
        System.out.println("fiveIntArray = [ " +
                fiveIntArray[0] + ", " +
                fiveIntArray[1] + ", " +
                fiveIntArray[2] + ", " +
                fiveIntArray[3] + ", " +
                fiveIntArray[4] + " ]");

        String [] fiveStringArray = new String [5];

        System.out.println("fiveStringArray = [ " +
                fiveStringArray[0] + ", " +
                fiveStringArray[1] + ", " +
                fiveStringArray[2] + ", " +
                fiveStringArray[3] + ", " +
                fiveStringArray[4] + " ]");

        // Since the array has a length of 5 and is zero-based,
        // there is no element at the 5th index - it is past
        // the end of the array.  Trying to access the
        // element at index 5 will throw an index out of
        // bounds array
        try {
            int sixthInt = fiveIntArray[5];  // Throws an ArrayIndexOutOfBoundsException
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        // You can also set the value of the elements at the time
        // of creation using a list inside of braces
        int []  anotherFiveIntArray = new int [] { 0, 100, 200, 300, 400 };

        // or you can set the values individually
        anotherFiveIntArray[0] = 1;

        System.out.println("anotherFiveIntArray = [ " +
                anotherFiveIntArray[0] + ", " +
                anotherFiveIntArray[1] + ", " +
                anotherFiveIntArray[2] + ", " +
                anotherFiveIntArray[3] + ", " +
                anotherFiveIntArray[4] + " ]");

        System.out.println();
        /*
         * Lists (java.util package)
         *
         * A list object is a more versatile interface than the Array types.
         * Lists are part of the Java Collections package
         *
         * Just like Arrays, lists are collections of objects of the same type
         * and behave in many ways similar to Arrays, but with one major difference
         * the size of a list can be increased at any time!
         *
         * In order to declare the "type" of data held in a list, you specify
         * the class name in <> brackets after the List class.
         *
         * The most commonly used type of List is an ArrayList
         */
        List<Integer> intList = new ArrayList<>();
        // Note the Integer specification in the <> of List, this indicates
        // that the list contains Integers.  Only class names can
        // be used for List types, so native types int, long, double cannot
        // be used.

        // The initial size of the list is zero, and the list is empty
        System.out.println("intList = " + intList);

        // Adding values to a list can be done using the add method
        System.out.println("Add some values");
        intList.add(0);
        intList.add(1);
        intList.add(2);
        intList.add(3);
        intList.add(4);
        intList.add(5);
        intList.add(6);  // you can keep going - the limit is when you run out of memory

        System.out.println("intList = " + intList);

        // You can get the an individual member of the list
        // using the get() function
        System.out.println("The fourth value is : " + intList.get(4));

        // You can replace a value in the list by giving it
        // a new object using the set() method.  The first
        // number is the index in the list, and the second number
        // is a new object.
        System.out.println("Set the number at index 5 to 7");
        intList.set(5, 7);
        System.out.println("intList = " + intList);

        // The Collections class for List objects has some fun features
        System.out.println("Shuffle");
        Collections.shuffle(intList);
        System.out.println("intList = " + intList);

        System.out.println("Sort");
        Collections.sort(intList);
        System.out.println("intList = " + intList);

        System.out.println("Test for contains");
        System.out.println("intList contains 3 = " + intList.contains(3));
        System.out.println("intList contains 5 = " + intList.contains(5));

        // The difference between arrays and lists is that
        // arrays are fixed where lists can grow or shrink.
        System.out.println("Add more elements");
        intList.add(100);
        intList.add(11);
        System.out.println("intList = " + intList);

        System.out.println("Remove the first element");
        int removedElement = intList.remove(0);
        System.out.println("intList = " + intList);
        System.out.println("removed value = " + removedElement);

        /*
         * Make a list of strings.
         */
        List<String> stringList = new ArrayList<>();

        System.out.println();
        System.out.println("stringList = " + stringList);
        // Note that there are no null values in the new list of Strings

        System.out.println("Add some random fridge magnet words");
        String randomWords = "walk time it and of very wish " +
                "run person I that in quite ed " +
                "play year you but to rather ing " +
                "read way he or for the er " +
                "learn day they as with more dog " +
                "be thing we if on most cat " +
                "have man she when at less mom " +
                "do world who than from least dad " +
                "say life them because by too the " +
                "get hand me while about so grandma " +
                "make part him where as just aunt " +
                "go child one after into enough uncle " +
                "know eye her so like indeed seem " +
                "take woman us though through still feel " +
                "see place something since after almost try " +
                "come work nothing until over fairly leave " +
                "think week anything whether between really call";

        String [] randomWordArray = randomWords.split(" ");

        // Convert an array to a list using the Arrays.asList() method
        stringList.addAll(Arrays.asList(randomWordArray));

        System.out.println(stringList);

        System.out.println("Make random fridge magnet sentences");

        Collections.shuffle(stringList);
        System.out.println(stringList.subList(0, 8));

        Collections.shuffle(stringList);
        System.out.println(stringList.subList(0, 10));

        Collections.shuffle(stringList);
        System.out.println(stringList.subList(0, 7));

        Collections.shuffle(stringList);
        System.out.println(stringList.subList(0, 9));

        Collections.shuffle(stringList);
        System.out.println(stringList.subList(0, 8));

    }
}
