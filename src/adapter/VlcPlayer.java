package adapter;

/**
 * Created with Intellij IDEA.
 * Description:
 * User: baby
 * Date: 2017/8/14
 * Time: 18:20
 */
public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("playing vlc file. Name: " + fileName);
    }

    @Override
    public void playMp4(String fileName) {
        //nothing to do.
    }
}
