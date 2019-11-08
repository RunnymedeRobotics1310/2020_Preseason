package ccc.y2019;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class J2 {

    private boolean debug   = true;
    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Never use the static context.
        new J2().solve();
    }

    private void solve() {

        /*
         * Read the input
         */
        List<String> inputs = new ArrayList<>();

        int lines = Integer.valueOf(scanner.nextLine());

        for (int i=0; i<lines; i++) {
            inputs.add(scanner.nextLine());
        }

        if (debug) {
            System.out.println(inputs);
        }

        /*
         * Put your solution here
         */

    }

}
