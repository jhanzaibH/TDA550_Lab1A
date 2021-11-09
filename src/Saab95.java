import java.awt.*;
/**
 * A class of a car Saab95
 */
public class Saab95 extends Car{

    /**
     * Turbo
     */
    protected boolean turboOn;

    /**
     * Creates a car of the type Saab95
     */
    public Saab95(){
        nrDoors = 2;
        color = Color.red;
        enginePower = 125;
        turboOn = false;
        modelName = "Saab95";
        stopEngine();
    }

    /**
     * Turns on turbo
     */
    public void setTurboOn(){
        turboOn = true;
    }
    /**
     * Turns off turbo off
     */
    public void setTurboOff(){
        turboOn = false;
    }

    /**
     * Gives true if turbo in on
     * @return boolean
     */
    public boolean getTurbo(){
        return turboOn;
    }

    @Override
    public double speedFactor(){
        double turbo = 1;
        if(turboOn) turbo = 1.3;
        return enginePower * 0.01 * turbo;
    }

    @Override
    protected void incrementSpeed(double amount){
        currentSpeed = getCurrentSpeed() + speedFactor() * amount;
    }

    @Override
    protected void decrementSpeed(double amount){
        currentSpeed = getCurrentSpeed() - speedFactor() * amount;
    }


    // TODO fix this method according to lab pm
    @Override
    public void gas(double amount){
        incrementSpeed(amount);
    }

    // TODO fix this method according to lab pm
    @Override
    public void brake(double amount){
        decrementSpeed(amount);
    }

}