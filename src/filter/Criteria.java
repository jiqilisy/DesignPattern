package filter;

import java.util.List;

/**
 * Created with Intellij IDEA.
 * Description:
 * User: baby
 * Date: 2017/8/17
 * Time: 14:25
 */
public interface Criteria {
    List<Person> meetCriteria(List<Person> persons);
}
