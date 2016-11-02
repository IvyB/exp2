package com.tongao;

/**
 *
 * The class Sales maintains a list of the orders that have been completed. This class implements the interface Iterable<Order> to being able to iterate through the orders using the for-each loop.
 *
 * @author  佟骜   20154905
 * @date 2016/10/14
 * @version  1.0.0
 */
import java.util.ArrayList;
import java.util.Iterator;

public class Sales implements Iterable<Order> {

    ArrayList<Order> orders = new ArrayList<Order>();

    /**
     * Creates the collection orders, which is initially empty.
     */
    public Sales() {

    }

    /**
     *  Adds the specified order to the collection orders.
     *@param order the order which you want to add in the ArrayList
     */
    public void addOrder(Order order) {

        orders.add(order);
    }

    /**
     * @return  an iterator over the instances in the collection orders.
     */
    public Iterator<Order> iterator() {

        return orders.iterator();
    }

    /**
     *@return the number of instances in the collection orders.
     */
    public int getNumberOfOrders() {

        return orders.size();
    }
}
