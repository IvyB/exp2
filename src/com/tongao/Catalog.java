package com.tongao;

/**
 *
 * The class Catalog models a product catalog. This class implements the interface Iterable<Product> to being able to iterate through the products using the for-each loop.
 * @author  佟骜   20154905
 * @date 2016/10/14
 * @version  1.0.0
 */

import java.util.ArrayList;
import java.util.Iterator;

public class Catalog implements Iterable<Product> {

    private ArrayList<Product> products = new ArrayList<Product>();

    /**
     * Creates the collection products, which is initially empty.
     */
    public Catalog() {

    }

    /**
     * Adds the specified product to the collection products.
     *@param product the product which you want to add
     */
    public void addProduct( Product product) {

        products.add(product);
    }

    /**
     * @return an iterator over the instances in the collection products.
     */
    public Iterator<Product> iterator() {

        return products.iterator();
    }

    /**
     *@param code the code which the product you want to search
     *@return a reference to the Product instance with the specified code and returns null if there are no products in the catalog with the specified code.
     */
    public Product getProduct( String code) {

        for( Product pro : products) {
            if( pro.getCode().equals(code)) {
                return pro;
            }
        }
        return null;
    }

    /**
     *@return the number of instances in the collection products.
     */
    public int getNumberOfProducts() {

        return products.size();
    }
}
