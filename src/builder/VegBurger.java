package builder;

/**
 * Created with Intellij IDEA.
 * Description:创建扩展了 Burger 和 ColdDrink 的实体类
 * User: baby
 * Date: 2017/8/12
 * Time: 13:32
 */
public class VegBurger extends Burger {
    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}
