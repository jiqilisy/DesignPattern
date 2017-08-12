package builder;

/**
 * Created with Intellij IDEA.
 * Description:创建实现 Item 接口的抽象类，该类提供了默认的功能
 * User: baby
 * Date: 2017/8/12
 * Time: 13:28
 */
public abstract class Burger implements Item{

    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
