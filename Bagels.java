/**
 * Bagels Class
 * <b>Hello</b>
 * <p></p>
 * @author Harshdeep and Lovepreet
 * @version 1.1
 * @since Today's evening
 */
public class Bagels extends Product{
    public boolean toasted;
    public boolean creamChesse;
    public boolean butter;

    public Bagels() {
    }

    /**
     *
     * @param toasted
     * @param creamChesse
     * @param butter
     */

    public Bagels(boolean toasted, boolean creamChesse, boolean butter) {
        this.toasted = toasted;
        this.creamChesse = creamChesse;
        this.butter = butter;
    }

    /**
     *
     * @param cash
     * @return
     */
    public int howManyBagels(double cash){
        double total = cash/getBagelsPrice();
        return 0;
    }

    public boolean isToasted() {
        return toasted;
    }

    public void setToasted(boolean toasted) {
        this.toasted = toasted;
    }

    public boolean isCreamChesse() {
        return creamChesse;
    }

    public void setCreamChesse(boolean creamChesse) {
        this.creamChesse = creamChesse;
    }

    public boolean isButter() {
        return butter;
    }

    public void setButter(boolean butter) {
        this.butter = butter;
    }
}
