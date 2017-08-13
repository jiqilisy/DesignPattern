package prototype;

/**
 * Created with Intellij IDEA.
 * Description:
 * User: baby
 * Date: 2017/8/13
 * Time: 14:12
 */
public class Rectangle extends Shape {
    /**
     * Instantiates a new Rectangle.
     */
    public Rectangle(){
        type = "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
