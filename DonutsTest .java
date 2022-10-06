import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DonutsTest {

    @Test
    void howManyDonuts() {
        Donuts d = new Donuts();
        d.howManyDonuts(2.2);
        assertNotEquals(2.2,d.howManyDonuts(3.5));
    }
}