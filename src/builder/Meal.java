package builder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with Intellij IDEA.
 * Description:
 * User: baby
 * Date: 2017/8/12
 * Time: 13:35
 */
public class Meal {
    private List<Item> items = new ArrayList<Item>();

    /**
     * Add item.
     *
     * @param item the item
     */
    public void addItem(Item item){
        items.add(item);
    }

    /**
     * Get cost float.
     *
     * @return the float
     */
    public float getCost(){
        float cost = 0.0f;
        for (Item item : items) {
            cost += item.price();
        }
        return cost;
    }

    /**
     * Show items.
     */
    public void showItems(){
        for (Item item : items) {
            System.out.print("Item : "+item.name());
            System.out.print(", Packing : "+item.packing().pack());
            System.out.println(", Price : "+item.price());
        }
    }

}
