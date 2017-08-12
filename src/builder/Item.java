package builder;

/**
 * Created with Intellij IDEA.
 * Description:创建一个表示食物条目和食物包装的接口。
 * User: baby
 * Date: 2017/8/12
 * Time: 13:24
 */
public interface Item {
    /**
     * Name string.
     *
     * @return the string
     */
    String name();

    /**
     * Packing packing.
     *
     * @return the packing
     */
    Packing packing();

    /**
     * Price float.
     *
     * @return the float
     */
    float price();
}
