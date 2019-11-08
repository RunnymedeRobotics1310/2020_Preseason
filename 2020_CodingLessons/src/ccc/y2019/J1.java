package ccc.y2019;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class J1 {

    private boolean debug   = true;
    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Never use the static context.
        new J1().solve();
    }

    private void solve() {

        /*
         * Read the input
         */
        List<Integer> inputs = new ArrayList<>();

        for (int i=0; i<6; i++) {
            inputs.add(scanner.nextInt());
        }

        if (debug) {
            System.out.println(inputs);
        }

        /*
         * Put your solution here
         */

    }

}
