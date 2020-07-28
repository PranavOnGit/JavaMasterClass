package Exercises;

//Main concept: Constructor
//Please refer Point.txt for problem statement.
public class Point {
    private int x;
    private int y;

    //Constructors
    public Point() {
    }
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //Setters
    public void setX(int x) {
        this.x = x;
    }
    public void setY(int y) {
        this.y = y;
    }

    //Getters
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }

    //Calculating distance
    public double distance() {
        // return Math.sqrt((this.getX() - 0) * (this.getX() - 0) + (this.getY() - 0) * (this.getY() - 0));
        return Math.sqrt(x*x+y*y);
    }
    public double distance(int x, int y) {
        // return Math.sqrt((x - this.getX() * x - this.getX()) + (y - this.getY()) * (y - this.getY()));
        return Math.sqrt((x - this.x) * (x - this.x) + (y - this.y) * (y - this.y));
    }
    public double distance(Point point) {
        // return Math.sqrt((this.getX() - point.getX()) * (this.getX() - point.getX()) + (this.getY() - point.getY()) * (this.getY() - point.getY()));
        return distance(point.x, point.y);
    }

    public static void main(String[] args) {
        Point first = new Point(6, 5);
        Point second = new Point(3, 1);

        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));

        Point point = new Point();
        System.out.println("distance()= " + point.distance());
    }
}



