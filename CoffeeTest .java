import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CoffeeTest {

    @Test
    void howManyCoffee() {
        Coffee c = new Coffee(2,4);
        c.getNumOfCream();
        assertEquals(2,c.getNumOfCream());
    }

}