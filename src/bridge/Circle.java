package bridge;

/**
 * Created with Intellij IDEA.
 * Description:
 * User: baby
 * Date: 2017/8/15
 * Time: 17:28
 */
public class Circle extends Shape {

    private int x, y, radius;

    protected Circle(int x, int y, int radius,DrawAPI drawAPI) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        drawAPI.drawCicle(radius, x, y);
    }
}
