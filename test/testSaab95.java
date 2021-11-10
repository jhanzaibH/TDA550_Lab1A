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

    @Test
    public void testGas() {
        saab.startEngine();
        double startSpeed = saab.getCurrentSpeed();
        saab.gas(0.5);
        assertEquals(startSpeed + saab.speedFactor() * 0.5, saab.getCurrentSpeed(),0.0);
    }
    @Test
    public void testBrake() {
        saab.startEngine();
        saab.gas(0.9);
        double startSpeed = saab.getCurrentSpeed();// before braking

        saab.brake(0.4);
        assertEquals(startSpeed, saab.getCurrentSpeed(),0.0);
    }
}
