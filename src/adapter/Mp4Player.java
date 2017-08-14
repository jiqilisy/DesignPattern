package adapter;

/**
 * Created with Intellij IDEA.
 * Description:
 * User: baby
 * Date: 2017/8/14
 * Time: 18:21
 */
public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        //nothing to do.
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("playing mp4 file. Name: " + fileName);
    }
}
