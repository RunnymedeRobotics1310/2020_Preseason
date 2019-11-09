package adventofcode.y2018;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AdventOfCodeTemplate {

    private boolean debug   = true;
    private Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Never use the static context.
        new AdventOfCodeTemplate().solve();
    }

    private void solve() {

        List<String> input = getInput();

        solvePart1(input);
        solvePart2(input);
    }

    private List<String> getInput() {

        List<String> input = new ArrayList<>();

        while (true) {
            String s = scanner.nextLine().trim();
            if (s.isEmpty()) {
                break;
            }
            input.add(s);
        }

        if (debug) {
            System.out.println(input);
        }

        return input;
    }

    public void solvePart1(List<String> input) {
        // Put your solution here
    }

    public void solvePart2(List<String> input) {
        // Put your solution here
    }
}
