package prototype;

/**
 * Created with Intellij IDEA.
 * Description:
 * User: baby
 * Date: 2017/8/13
 * Time: 14:13
 */
public class Square extends Shape{
    /**
     * Instantiates a new Square.
     */
    public Square(){
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
