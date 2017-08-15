package bridge;

/**
 * Created with Intellij IDEA.
 * Description:
 * User: baby
 * Date: 2017/8/15
 * Time: 17:27
 */
public abstract class Shape {
    protected DrawAPI drawAPI;
    protected Shape(DrawAPI drawAPI){
        this.drawAPI = drawAPI;
    }
    public abstract void draw();
}
