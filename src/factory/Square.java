package factory;

/**
 * Created with Intellij IDEA.
 * Description:
 * User: baby
 * Date: 2017-08-11
 * Time: 10:41
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
