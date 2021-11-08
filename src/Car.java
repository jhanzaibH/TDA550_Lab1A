import java.awt.*;
/**
 * This is the abstract class inherited by different car models.
 *
 * @author Alvin
 */
public abstract class Car { // the class can be abstract as objects of this class is not created
    // By using an abstract class instead of an interface the instance variables can also be inherited
    public int nrDoors; // Number of doors on the car
    public double enginePower; // Engine power of the car
    public double currentSpeed; // The current speed of the car
    public Color color; // Color of the car
    public String modelName; // The car model name

    /**
     * EHEH
     *
     */
    public Car(){
        nrDoors = 4;
        color = Color.black;
        enginePower = 100;
        modelName = "Volvo240";
        stopEngine();
    }

    /**
     * Get number of doors
     * @return int
     */
    public int getNrDoors(){
        return nrDoors;
    }
    public double getEnginePower(){
        return enginePower;
    }
    public double getCurrentSpeed(){
        return currentSpeed;
    }
    public Color getColor(){
        return color;
    }

    public void setColor(Color clr){
        color = clr;
    }

    public void startEngine(){
        currentSpeed = 0.1;
    }

    public void stopEngine(){ currentSpeed = 0; }

    public abstract double speedFactor();

    protected abstract void incrementSpeed(double amount);
    // TODO fix this method according to lab pm
    public void gas(double amount){ incrementSpeed(amount); }

    protected abstract void decrementSpeed(double amount);
    // TODO fix this method according to lab pm
    public void brake(double amount){ decrementSpeed(amount); }

}