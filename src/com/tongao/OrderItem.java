package com.tongao;

/**
 *
 * Class OrderItem models an item in an order.
 *
 * @author  佟骜   20154905
 * @date 2016/10/14
 * @version  1.0.0
 */
public class OrderItem {

    private Product product;
    private int quantity;

    /**
     * Constructor that initializes the instance variables product and quantity.
     * @param initialProduct the Product which ordered
     * @param initialQuantity the quantity which you have ordered
     */
    public OrderItem( Product initialProduct, int initialQuantity) {

        product = initialProduct;
        this.quantity = initialQuantity;
    }


    /**
     *@return the value of the instance variable product, a reference to a Product object.
     */
    public Product getProduct() {

        return product;
    }

    /**
     *@return the value of the instance variable quantity.
     */
    public int getQuantity() {

        return this.quantity;
    }

    /**
     *@param newQuantity Sets the instance variable quantity to the value of parameter newQuantity.
     */
    public void setQuantity( int newQuantity) {

        quantity = newQuantity;
    }

    /**
     *@return the product of quantity and price.
     */
    public double getValue() {

        double value = product.getPrice() * quantity;
        return value;
    }

    /**
     * Overrides the method toString in the class Object. Returns the string representation of an OrderItem object. The String representation has the following format:
     * quantity product-code product-price
     * The fields are separated by a space. You can assume that the fields themselves do not contain any spaces.
     * @return quantity product-code product-price
     */
    public String toString() {

        return quantity + " " + product.getCode() + " " + product.getPrice();
    }
}
