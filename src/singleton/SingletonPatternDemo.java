package singleton;

/**
 * Created with Intellij IDEA.
 * Description:
 * User: baby
 * Date: 2017-08-11
 * Time: 10:54
 */
public class SingletonPatternDemo {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        //获得唯一可用对象
        SingleObject object = SingleObject.getInstance();

        //显示消息
        object.showMessage();
    }
}
