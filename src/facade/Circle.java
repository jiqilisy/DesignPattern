package facade;

/**
 * Created with Intellij IDEA.
 * Description:
 * User: baby
 * Date: 2017/8/27
 * Time: 11:40
 */
public class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("Circle::draw()");
    }
}
