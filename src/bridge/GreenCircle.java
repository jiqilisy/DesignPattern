package bridge;

/**
 * Created with Intellij IDEA.
 * Description:
 * User: baby
 * Date: 2017/8/15
 * Time: 17:27
 */
public class GreenCircle implements DrawAPI {
    @Override
    public void drawCicle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: green, radius: "
                + radius +", x: " +x+", "+ y +"]");
    }
}
