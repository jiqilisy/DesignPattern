package decorator;

/**
 * Created with Intellij IDEA.
 * Description:
 * User: baby
 * Date: 2017/8/21
 * Time: 19:10
 */
public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw(){
        decoratedShape.draw();

    }

    private void setRedBorder(Shape decoratedShape){
        System.out.println("Border Color: Red");
    }
}
