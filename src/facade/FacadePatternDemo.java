package facade;

/**
 * Created with Intellij IDEA.
 * Description:
 * User: baby
 * Date: 2017/8/27
 * Time: 11:41
 */
public class FacadePatternDemo {
    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}
