package flyweight;

import java.util.HashMap;

/**
 * Created with Intellij IDEA.
 * Description:
 * User: baby
 * Date: 2017/9/6
 * Time: 19:33
 */
public class ShapeFactory {
    private static final HashMap<String, Shape> circleMap = new HashMap<>();

    public static Shape getCircle(String color) {
        Circle circle = (Circle)circleMap.get(color);

        if(circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Creating circle of color : " + color);
        }
        return circle;
    }
}
