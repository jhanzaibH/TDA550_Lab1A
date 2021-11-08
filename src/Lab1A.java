import java.util.Arrays;

public class Lab1A {
    public static void main(String[] args){
        Car c1 = new Saab95();
        c1.startEngine();
        System.out.println(Arrays.toString(c1.getPosition()));
        c1.move();
        System.out.println(Arrays.toString(c1.getPosition()));
        c1.turnLeft();
        System.out.println(c1.getDirection());
        c1.turnRight();
        System.out.println(c1.getDirection());
        c1.turnRight();
        System.out.println(c1.getDirection());
        c1.turnRight();
        System.out.println(c1.getDirection());
        c1.turnRight();
        System.out.println(c1.getDirection());
        c1.move();
        System.out.println(Arrays.toString(c1.getPosition()));
    }
}