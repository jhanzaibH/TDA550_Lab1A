import java.awt.*;
/**
 * This is the abstract class inherited by different car models.
 *
 * @author Alvin
 * @author Simon
 * @author Jhanzaib
 */
public abstract class Car implements Movable{ // the class can be abstract as objects of this class is not created
    // By using an abstract class instead of an interface the instance variables can also be inherited
    /** Number of doors of the car */
    protected int nrDoors; // Number of doors on the car
    /** Engine power of the car */
    protected double enginePower; // Engine power of the car
    /** Current speed of tha car */
    protected double currentSpeed; // The current speed of the car
    /** Color of the car */
    protected Color color; // Color of the car
    /** Model name of the car */
    protected String modelName; // The car model name
    /** Direction of the car */
    protected int direction = 0; // 0: positive x direction, 1: positive y direction, 2: negative x direction, 3: negative y direction
    /** Position of the car */
    protected double[] position = {0,0};

    /** Length of the car */
    protected final int length = 10;
    /** Width of the car */
    protected final int width = 5;

    /**
     * Returns the modelname of the car
     * @return String
     */
    public String getModelName(){
        return modelName;
    }

    /**
     * Get number of doors
     * @return int
     */
    public int getNrDoors(){
        return nrDoors;
    }
    /**
     * Returns the engine power
     * @return double
     */
    public double getEnginePower(){
        return enginePower;
    }
    /**
     * Returns the current speed of the car
     * @return double
     */
    public double getCurrentSpeed(){
        return currentSpeed;
    }
    /**
     * Returns the color of the car
     * @return Color
     */
    public Color getColor(){
        return color;
    }
    /**
     * Sets the color of the car
     * @param clr new color of the car
     */
    public void setColor(Color clr){
        color = clr;
    }
    /**
     * Starts the engine
     */
    public void startEngine(){
        currentSpeed = 0.1;
    }
    /**
     * Sets the current speed to 0
     */
    public void stopEngine(){ currentSpeed = 0; }
    /**
     * Speed factor
     * @return double
     */
    public abstract double speedFactor();
    // TODO probably change this comment
    /**
     * Increments speed
     * @param amount is speed to be increased
     */
    protected abstract void incrementSpeed(double amount);
    // TODO probably change this comment
    /**
     * Uses the method incrementSpeed
     * @param amount increase speed by amount
     */
    // TODO fix this method according to lab pm
    public void gas(double amount){ incrementSpeed(amount); }
    // TODO probably change this comment
    /**
     * Decrements speed
     * @param amount the speed is to be decreased
     */
    protected abstract void decrementSpeed(double amount);
    // TODO probably change this comment
    /**
     * Decrements speed
     * @param amount decrements the speed with amount
     */
    // TODO fix this method according to lab pm
    public void brake(double amount){ decrementSpeed(amount); }

    /**
     * Gives current direction
     * @return int
     */
    public int getDirection(){
        return direction;
    }

    /**
     * Gives current position
     * @return double[]
     */
    public double[] getPosition(){
        return position;
    }

    @Override
    public void move(){
        switch (direction) {
            case 0 -> position[0] += getCurrentSpeed();
            case 1 -> position[1] += getCurrentSpeed();
            case 2 -> position[0] -= getCurrentSpeed();
            case 3 -> position[1] -= getCurrentSpeed();
        }
    }

    @Override
    public void turnLeft() {
        direction += 1;
        direction = direction%4;
    }

    @Override
    public void turnRight() {
        direction -= 1;
        direction = (direction < 0)? direction+4 : direction;
    }
}