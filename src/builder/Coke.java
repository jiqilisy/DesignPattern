package builder;

/**
 * Created with Intellij IDEA.
 * Description:
 * User: baby
 * Date: 2017/8/12
 * Time: 13:34
 */
public class Coke extends ColdDrink {
    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 30.0f;
    }
}
