package com.tongao;

/**
 *
 *Class CoffeeBrewer models a coffee brewer. It extends class Product.
 *
 * @author  佟骜   20154905
 * @date 2016/10/14
 * @version  1.0.0
 */
public class CoffeeBrewer extends Product {

    String model;
    String waterSupply;
    int numberOfCups;

    /**
     * This method is a constructor of class CoffeeBrewer
     * @param initialCode	code of CoffeeBrewer
     * @param initialDescription	the description of a CoffeeBrewer
     * @param initialPrice	the price of the CoffeeBrewer
     * @param initialModel	the model of the CoffeeBrewer
     * @param initialWaterSupply	the source of water
     * @param initialNumberOfCups	the number of cups
     */
    public CoffeeBrewer( String initialCode, String initialDescription, double initialPrice, String initialModel, String initialWaterSupply, int initialNumberOfCups) {

        super( initialCode, initialDescription, initialPrice);
        this.model = initialModel;
        this.waterSupply = initialWaterSupply;
        this.numberOfCups = initialNumberOfCups;
    }

    /**
     * @return the value of instance variable model.
     */
    public String getModel() {

        return this.model;
    }

    /**
     * @return the value of instance variable waterSupply.
     */
    public String getWaterSupply() {

        return this.waterSupply;
    }

    /**
     * @return the value of instance variable numberOfCups.
     */
    public int getNumberOfCups() {

        return this.numberOfCups;
    }

    /**
     *  Overrides the method toString in the class Object. Returns the string representation of a CoffeeBrewer object. The String returned has the following format:
     *  code_description_price_model_waterSupply_numberOfCups
     *  The fields are separated by an underscore ( _ ). You can assume that the fields themselves do not contain any underscores.
     * @return code_description_price_model_waterSupply_numberOfCups
     */
    public String toString() {

        return super.toString() + "_" + model + "_" + waterSupply + "_" + numberOfCups;
    }
}
