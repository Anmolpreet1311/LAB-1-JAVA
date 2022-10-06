/**
 * Donuts Class
 * <b>Hello</b>
 * <p></p>
 * @author Harshdeep and Lovepreet
 * @version 1.1
 * @since Today's evening
 */
public class Donuts extends Product{

    public Donuts() {
    }

    /**
     *
     * @param cash
     * @return
     */
    public int howManyDonuts(double cash){
        double total = cash/getDonutsPrice();
        return 0 ;
    }
}
