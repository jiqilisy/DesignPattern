package builder;

/**
 * Created with Intellij IDEA.
 * Description:
 * User: baby
 * Date: 2017/8/12
 * Time: 13:36
 */
public class Pepsi extends ColdDrink{
    @Override
    public float price() {
        return 35.0f;
    }

    @Override
    public String name() {
        return "Pepsi";
    }

}
