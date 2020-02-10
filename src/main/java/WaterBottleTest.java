import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    private WaterBottle waterbottle;

    @Before
    public void before() {
        waterbottle = new WaterBottle(100);
    }

    @Test
    public void check_volume_of_waterbottle() {
        assertEquals(100, waterbottle.volume());
    }

    @Test
    public void check_drink_function_reducess_volume_by_10() {
        assertEquals(90,waterbottle.drink());
    }

    @Test
    public void check_empty_function_reduces_volume_to_zero() {
        waterbottle.empty();
        assertEquals(0, waterbottle.volume());
    }

    @Test
    public void check_refill_function_fills_volume_to_100() {
        waterbottle.refill();
        assertEquals(100, waterbottle.volume());
    }

}
