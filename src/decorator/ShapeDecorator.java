package decorator;

/**
 * Created with Intellij IDEA.
 * Description:
 * User: baby
 * Date: 2017/8/21
 * Time: 19:08
 */
public class ShapeDecorator implements Shape{

    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape){
        this.decoratedShape = decoratedShape;
    }

    @Override
    public void draw() {
        decoratedShape.draw();
    }
}
