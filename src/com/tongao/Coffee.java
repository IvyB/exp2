package com.tongao;

/**
 *
 * The class Coffee models a coffee product. It extends class Product.
 *
 * @author  佟骜   20154905
 * @date 2016/10/14
 * @version  1.0.0
 */
public class Coffee extends Product {

    private String origin;
    private String roast;
    private String flavor;
    private String aroma;
    private String acidity;
    private String body;

    /**
     * This method is a constructor of class Coffee
     * @param initialCode	code of coffee
     * @param initialDescription	the description of a coffee
     * @param initialPrice	the price of the coffee
     * @param initialOrigin	the origin of the coffee
     * @param initialRoast	the method of making the coffee
     * @param initialFlavor	the flavor of the coffee
     * @param initialAroma the aroma of the coffee
     * @param initialAcidity the acidity of the coffee
     * @param initialBody the body of the coffee
     */
    public Coffee( String initialCode, String initialDescription, double initialPrice, String initialOrigin, String initialRoast, String initialFlavor, String initialAroma, String initialAcidity, String initialBody) {

        super(initialCode, initialDescription, initialPrice);
        this.origin = initialOrigin;
        this.roast = initialRoast;
        this.flavor = initialFlavor;
        this.aroma = initialAroma;
        this.acidity = initialAcidity;
        this.body = initialBody;
    }

    /**
     * @return the value of instance variable origin.
     */
    public String getOrigin() {

        return this.origin;
    }

    /**
     * @return the value of instance variable roast.
     */
    public String getRoast() {

        return this.roast;
    }

    /**
     * @return the value of instance variable flavor.
     */
    public String getFlavor() {

        return this.flavor;
    }

    /**
     * @return the value of instance variable aroma.
     */
    public String getAroma() {

        return this.aroma;
    }

    /**
     * @return the value of instance variable acidity.
     */
    public String getAcidity() {

        return this.acidity;
    }

    /**
     * @return Returns the value of instance variable body.
     */
    public String getBody() {

        return this.body;
    }

    /**
     *  Overrides the method toString in the class Object. Returns the string representation of a Coffee object. The String returned has the following format:
     *  code_description_price_origin_roast_flavor_aroma_acidity_body
     *  The fields are separated by an underscore ( _ ). You can assume that the fields themselves do not contain any underscores.
     * @return code_description_price_origin_roast_flavor_aroma_acidity_body
     */
    public String toString() {

        return super.toString() + "_" + origin + "_" + roast + "_" + flavor + "_" + aroma + "_" + acidity + "_" + body;
    }
}
