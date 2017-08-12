package builder;

/**
 * Created with Intellij IDEA.
 * Description:
 * User: baby
 * Date: 2017/8/12
 * Time: 13:33
 */
public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "Chicken Burger";
    }

    @Override
    public float price() {
        return 50.0f;
    }
}
