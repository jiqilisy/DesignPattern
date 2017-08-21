package composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with Intellij IDEA.
 * Description:
 * User: baby
 * Date: 2017/8/18
 * Time: 11:51
 */
public class Employee {
    private String name;
    private String dept;
    private int salary;
    private List<Employee> subordinates;

    /**
     * Instantiates a new Employee.
     *
     * @param name the name
     * @param dept the dept
     * @param sal  the sal
     */
//构造函数
    public Employee(String name,String dept, int sal) {
        this.name = name;
        this.dept = dept;
        this.salary = sal;
        subordinates = new ArrayList<Employee>();
    }

    /**
     * Add.
     *
     * @param e the e
     */
    public void add(Employee e) {
        subordinates.add(e);
    }

    /**
     * Remove.
     *
     * @param e the e
     */
    public void remove(Employee e) {
        subordinates.remove(e);
    }

    /**
     * Get subordinates list.
     *
     * @return the list
     */
    public List<Employee> getSubordinates(){
        return subordinates;
    }

    public String toString(){
        return ("Employee :[ Name : "+ name
                +", dept : "+ dept + ", salary :"
                + salary+" ]");
    }
}
