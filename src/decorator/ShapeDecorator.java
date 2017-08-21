package decorator;

/**
 * Created with Intellij IDEA.
 * Description:
 * User: baby
 * Date: 2017/8/21
 * Time: 19:08
 */
public class ShapeDecorator implements Shape{

    /**
     * The Decorated shape.
     */
    protected Shape decoratedShape;

    /**
     * Instantiates a new Shape decorator.
     *
     * @param decoratedShape the decorated shape
     */
    public ShapeDecorator(Shape decoratedShape){
        this.decoratedShape = decoratedShape;
    }

    @Override
    public void draw() {
        decoratedShape.draw();
    }
}
