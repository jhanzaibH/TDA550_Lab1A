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
    public void testSetTurboOn(){
        saab.setTurboOn();
        assertTrue(saab.getTurbo());
    }
    @Test
    public void testSetTurboOff() {
        saab.setTurboOff();
        assertTrue(!saab.getTurbo());
    }
    @Test
    public void testGetTurbo() {
        saab.setTurboOn();
        assertTrue(saab.getTurbo());

    }
    @Test
    public void testSpeedFactor() {
        saab.setTurboOn();
        assertEquals(saab.getEnginePower()*0.01*1.3, saab.speedFactor(),0.0);
    }
    @Test
    public void testIncrementSpeed(){
        saab.incrementSpeed(saab.currentSpeed+10);
        assertEquals(saab.getEnginePower(), saab.getCurrentSpeed(),0.0);
    }
    @Test
    public void testDecrementSpeed(){
        saab.decrementSpeed(saab.currentSpeed+10);
        assertEquals(0, saab.getCurrentSpeed(),0.0);
    }
}
