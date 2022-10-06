import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {

    @org.junit.jupiter.api.Test
    void addToCart() {
        Customer c = new Customer("harsh",10.00);




    }

    @org.junit.jupiter.api.Test
    void displayCart() {
        Customer c1 = new Customer("gill",9.9);
        c1.displayCart();

    }
}