/**
 * Product Class
 * <b>Hello</b>
 * <p></p>
 * @author anmolpreet kaur 
 */


public abstract class Product {
    protected String name;
    protected static double coffeePrice = 1.50;
    protected static double bagelsPrice = 2.50;
    protected static double donutsPrice = 2.00;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static double getCoffeePrice() {
        return coffeePrice;
    }

    public static void setCoffeePrice(double coffeePrice) {
        Product.coffeePrice = coffeePrice;
    }

    public static double getBagelsPrice() {
        return bagelsPrice;
    }

    public static void setBagelsPrice(double bagelsPrice) {
        Product.bagelsPrice = bagelsPrice;
    }

    public static double getDonutsPrice() {
        return donutsPrice;
    }

    public static void setDonutsPrice(double donutsPrice) {
        Product.donutsPrice = donutsPrice;
    }
}
