package singleton;

/**
 * Created with Intellij IDEA.
 * Description:创建一个Singleton类
 * User: baby
 * Date: 2017-08-11
 * Time: 10:51
 */
public class SingleObject {

    //创建SingleObject的一个对象
    private static SingleObject instance = new SingleObject();

    //让构造函数为private ,这样该类就不会被实例化
    private SingleObject() {
    }

    /**
     * Gets instance.
     *
     * @return the instance
     */
//获得唯一可用的对象
    public static SingleObject getInstance() {
        return instance;
    }

    /**
     * Show message.
     */
    public void showMessage() {
        System.out.println("Hello World!");
    }
}
