import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class WatterBottleTest {

    WaterBottle waterBottle = new WaterBottle();

    @Test
    public void canDrink(){
        waterBottle.drink();
        assertEquals(90, waterBottle.getVolume());
    }

    @Test
    public void canEmpty(){
        waterBottle.empty();
        assertEquals(0, waterBottle.getVolume());
    }

    @Test
    public void canFill(){
        waterBottle.drink();
        waterBottle.fill();
        assertEquals(100, waterBottle.getVolume());
    }
}
