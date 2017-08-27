package facade;

/**
 * Created with Intellij IDEA.
 * Description:
 * User: baby
 * Date: 2017/8/27
 * Time: 11:39
 */
public class Square implements Shape{
    @Override
    public void draw() {
        System.out.println("Square::draw()");
    }
}
