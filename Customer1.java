import java.util.ArrayList;

/**
 * Customer Class
 * <b>Nice Customer</b>
 * <p></p>
 * @author Harshdeep and Lovepreet
 * @version 1.1
 * @since Today's evening
 */
public class Customer {
    private String cName;
    private double balance;
    private ArrayList<Product>bought;
    /**
     * @param cName
     * @param balance
     */
    public Customer(String cName, double balance) {
        this.cName = cName;
        this.balance = balance;
    }



    public Customer() {
        this.bought = new ArrayList<Product>();
    }
    public void addToCart(Product p){
        if(balance >0.0) {
            this.bought.add(p);
        }else{
            System.out.println("Low Balance");
        }if(balance >0.0){
            balance -=5;
            this.bought.add(p);
        }if (balance < 5){
            System.out.println("WARNING: Low Balance");
        }
           else{
                System.out.println("Success");
            }

    }
    public void displayCart(){
        for(Product p:this.bought){
            System.out.println(p.getName());
        }
    }

}
