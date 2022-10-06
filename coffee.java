/**
 * Product Class
 * <b>Hello </b>
 * <p></p>
 * @ author anmolpreet kaur 
 */
public class Coffee extends Product{
    public int numOfCream;
    public int numOfSugar;

    /**
     * @param name
     * @param numOfCream
     * @param numOfSugar
     */
    public Coffee(String name,int numOfCream, int numOfSugar) {
        this.name = name;
        this.numOfCream = numOfCream;
        this.numOfSugar = numOfSugar;}

    /**
     *
     * @param numOfCream
     * @param numOfSugar
     */

    public Coffee(int numOfCream, int numOfSugar) {
        this.numOfCream = numOfCream;
        this.numOfSugar = numOfSugar;
    }

    /**
     *
     * @param cash
     * @return
     */
    public int howManyCoffee(double cash) {
        double total = cash / getCoffeePrice();
        return 0;
    }

    public int getNumOfCream() {
        return numOfCream;
    }

    public void setNumOfCream(int numOfCream) {
        this.numOfCream = numOfCream;
    }

    public int getNumOfSugar() {
        return numOfSugar;
    }

    public void setNumOfSugar(int numOfSugar) {
        this.numOfSugar = numOfSugar;
    }
}
