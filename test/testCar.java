import org.junit.Assert;
import org.junit.Test;
import java.awt.*;
import java.util.Arrays;

import static org.junit.Assert.*;

public class testCar {
    Saab95 saab = new Saab95();

    @Test
    public void testGetNrDoors(){
        assertEquals(2, saab.getNrDoors());
    }

    @Test
    public void testGetEnginePower(){
        assertEquals(125.0, saab.getEnginePower(), 0.0);
    }

    @Test
    public void testGetCurrentSpeed(){
        assertEquals(0, saab.getCurrentSpeed(),0.0);
    }

    @Test
    public void testGetColor(){
        assertEquals(Color.red, saab.getColor());
    }

    @Test
    public void testSetColor(){
        saab.setColor(Color.green);
        assertEquals(0, saab.getCurrentSpeed(),0.0);
    }

    @Test
    public void testStartEngine(){
        saab.startEngine();
        assertEquals(0.1, saab.getCurrentSpeed(),0.0);
    }

    @Test
    public void testStopEngine(){
        saab.startEngine();
        saab.stopEngine();
        assertEquals(0, saab.getCurrentSpeed(),0.0);
    }

    @Test
    public void testGas(){
        saab.startEngine();
        saab.gas(1);
        // TODO change this
        // assertEquals(0, saab.getCurrentSpeed(),0.0);
    }

    @Test
    public void testBrake(){
        saab.brake(1);
        // TODO change this
        // assertEquals(0, saab.getCurrentSpeed(),0.0);
    }
    @Test
    public void testGetDirection(){
        assertEquals(0, saab.getDirection());
    }
    @Test
    public void testGetPosition(){
        Volvo240 volvo = new Volvo240();
        volvo.startEngine();
        volvo.move();
        assertEquals(0.1,volvo.getPosition()[0],0.0);
        assertEquals(0.0,volvo.getPosition()[1],0.0);
    }
    @Test
    public void testMove(){
        Volvo240 volvo = new Volvo240();
        volvo.startEngine();
        volvo.move();
        assertEquals(0.1,volvo.getPosition()[0],0.0);
        assertEquals(0.0,volvo.getPosition()[1],0.0);
    }
    @Test
    public void testTurnLeft(){
        saab.turnLeft();
        assertEquals(1, saab.getDirection());
        saab.turnRight();
    }
    @Test
    public void testTurnRight(){
        saab.turnRight();
        assertEquals(3, saab.getDirection());
        saab.turnLeft();
    }
}
