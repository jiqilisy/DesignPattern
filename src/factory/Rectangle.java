package factory;

/**
 * Created with Intellij IDEA.
 * Description:
 * User: baby
 * Date: 2017-08-11
 * Time: 10:40
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
