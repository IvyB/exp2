package com.tongao;

/**
 *
 * The class Product models a generic product in the store.
 * @author  佟骜   20154905
 * @date 2016/10/14
 * @version  1.0.0
 */
public class Product {

    private String code;
    private String description;
    private double price;

    /**
     * Overrides the method equals in the class Object. Two Product objects are equal if their codes are equal.
     * @param obj	the instance which you want to test if the same product as this instance
     * @return boolean	if the instance which you want to test is the same as this instance(by code),return ture,else return false
     */
    public boolean equals( Object obj) {

        if( obj instanceof Product) {
            Product product = (Product) obj;
            if( this.code.equals(product.getCode())) {
                return true;
            }
        }
        return false;
    }

    /**
     * This method is a constructor of class Product
     * @param initialCode	code of product
     * @param initialDescription	the description of a product
     * @param initialPrice	the price of the product
     */
    public Product( String initialCode,String initialDescription, double initialPrice) {

        this.code = initialCode;
        this.description = initialDescription;
        this.price = initialPrice;
    }

    /**
     * @return the value of instance variable code.
     */
    public String getCode() {

        return this.code;
    }

    /**
     * @return the value of instance variable description.
     */
    public String getDescription() {

        return this.description;
    }

    /**
     * @return the value of instance variable price.
     */
    public double getPrice() {

        return this.price;
    }

    /**
     * Overrides the method toString in the class Object. Returns the string representation of a Product object. The String returned has the following format:
     * code_description_price
     * The fields are separated by an underscore ( _ ). You can assume that the fields themselves do not contain any underscores.
     * @return code_description_price
     */
    public String toString() {

        return this.code + "_" + this.description + "_" + this.price;
    }
}
