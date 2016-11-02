package com.tongao;
/**
 *
 * The class Order maintains a list of order items. This class implements the interface Iterable<OrderItem> to being able to iterate through the items using the for-each loop.
 *
 * @author  吴卓峰   20155024
 * @date 2016/10/11
 * @version  2.0.0
 */

import java.util.ArrayList;
import java.util.Iterator;

public class Order implements Iterable<OrderItem> {

    ArrayList<OrderItem> items = new ArrayList<OrderItem>();

    /**
     * Creates the collection items, which is initially empty.
     */
    public Order() {

    }

    /**
     *  Adds the specified order item to the collection items.
     *@param orderItem the orderItem which you want to add.
     */
    public void addItem( OrderItem orderItem) {

        items.add(orderItem);
    }

    /**
     * Removes the specified order item from the collection items.
     *@param orderItem the orderItem which you want to remove from the ArrayList(by reference)
     */
    public void removeItem( OrderItem orderItem) {

        items.remove(orderItem);
    }

    /**
     * @return an iterator over the instances in the collection items.
     */
    public Iterator<OrderItem> iterator() {

        return items.iterator();
    }

    /**
     *@param product the product reference which you want to find in the items(ArrayList)
     *@return a reference to the OrderItem instance with the specified product and return null if there are no items in the order with the specified product.
     */
    public OrderItem getItem( Product product) {

        for(OrderItem item : items) {
            if(item.getProduct().equals(product)) {
                return item;
            }
        }
        return null;
    }

    /**
     *@return the number of instances in the collection items.
     */
    public int getNumberOfItems() {

        return items.size();
    }

    /**
     *@return the total cost of the order.
     */
    public double getTotalCost() {

        double TotalCost = 0;

        for(OrderItem item : items) {
            TotalCost += item.getProduct().getPrice() * item.getQuantity();
        }
        return TotalCost;
    }
}
