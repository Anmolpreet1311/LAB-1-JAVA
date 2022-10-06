/**
 * Donuts Class
 * <b>Hello</b>
 * <p></p>
 * @ author anmolpreet kaur 
 
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
