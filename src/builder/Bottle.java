package builder;

/**
 * Created with Intellij IDEA.
 * Description:创建实现 Bottle 接口的实体类。
 * User: baby
 * Date: 2017/8/12
 * Time: 13:27
 */
public class Bottle implements Packing {
    @Override
    public String pack() {
        return "Bottle";
    }
}
