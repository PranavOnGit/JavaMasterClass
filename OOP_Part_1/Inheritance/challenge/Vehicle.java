package OOP_Part_1.Inheritance.challenge;

public class Vehicle {
    private String name;
    private String size;

    private int currentVelocity = 0;
    private int currentDirection = 0;

    public Vehicle(String name, String size) {
        this.name = name;
        this.size = size;
    }

    public void steer(int direction){
        this.currentDirection += direction;
        System.out.println("vehicle.steer(): steering at "+ currentDirection +" degrees");
    }
    public void move(int velocity, int direction){
        currentVelocity = velocity;
        currentDirection = direction;
        System.out.println("vehicle.move(): moving at "+ currentDirection +" in direction "+currentVelocity);
    }

    public String getName() {
        return name;
    }
    public String getSize() {
        return size;
    }
    public int getCurrentVelocity() {
        return currentVelocity;
    }
    public int getCurrentDirection() {
        return currentDirection;
    }
    public void stop(){
        this.currentVelocity = 0;
    }
}