package prototype;

/**
 * Created with Intellij IDEA.
 * Description:
 * User: baby
 * Date: 2017/8/13
 * Time: 14:13
 */
public class Circle extends Shape{
    /**
     * Instantiates a new Circle.
     */
    public Circle(){
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
