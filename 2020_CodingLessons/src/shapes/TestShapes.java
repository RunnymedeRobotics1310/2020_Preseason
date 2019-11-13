package shapes;

import java.util.ArrayList;
import java.util.List;

public class TestShapes {

    public static void main(String[] args) {
        new TestShapes().run();
    }

    public void run() {

        List<Shape> shapes = new ArrayList<>();

        shapes.add(new Shape());

        System.out.println(shapes);

    }

}
