package prototype;

/**
 * Created with Intellij IDEA.
 * Description:
 * User: baby
 * Date: 2017/8/13
 * Time: 14:12
 */
public abstract class Shape implements Cloneable{

    private String id;
    /**
     * The Type.
     */
    protected String type;

    /**
     * Draw.
     */
    abstract void draw();

    /**
     * Get type string.
     *
     * @return the string
     */
    public String getType(){
        return type;
    }

    /**
     * Gets id.
     *
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(String id) {
        this.id = id;
    }

    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }
}
