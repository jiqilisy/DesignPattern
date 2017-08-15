package bridge;

/**
 * Created with Intellij IDEA.
 * Description:
 * User: baby
 * Date: 2017/8/15
 * Time: 17:30
 */
public class BridgePatternDemo {
    public static void main(String[] args) {
        Shape redCircle = new Circle(100,100, 10, new RedCircle());
        Shape greenCircle = new Circle(100,100, 10, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();

    }

}
