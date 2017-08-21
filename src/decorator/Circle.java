package decorator;

/**
 * Created with Intellij IDEA.
 * Description:
 * User: baby
 * Date: 2017/8/21
 * Time: 19:07
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Shape: Circle");
    }
}
