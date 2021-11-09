import org.junit.Test;
import java.awt.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class testSaab95 {
    Saab95 saab = new Saab95();
    @Test
    public void testSaab95Constructor(){
        assertEquals("Saab95", saab.getModelName() );
    }
    @Test
    public void testTurboOn(){
        saab.setTurboOn();
        assertTrue(saab.getTurbo());
    }
    @Test
    public void testTurboOff() {
        saab.setTurboOff();
        assertTrue(saab.getTurbo());
    }
    @Test
    public void testGetTurbo() {
        saab.setTurboOn();
        assertTrue(saab.getTurbo());

    }

}
