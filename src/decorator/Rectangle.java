package decorator;

/**
 * Created with Intellij IDEA.
 * Description:
 * User: baby
 * Date: 2017/8/21
 * Time: 19:06
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Shape: Rectangle");
    }
}
