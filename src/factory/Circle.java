package factory;

/**
 * Created with Intellij IDEA.
 * Description:
 * User: baby
 * Date: 2017-08-11
 * Time: 10:42
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
