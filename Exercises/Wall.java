package Exercises;

//Main Concept: Constructor
//Please refer Wall.txt for problem statement.
public class Wall {
    private double width;
    private double height;

    //No-arg constructor
    public Wall(){
        this(0.0, 0.0);
    }

    //arg constructor
    public Wall(double width, double height){
        if(width < 0){
            this.width = 0;
        }else {
            this.width = width;
        }

        if(height < 0){
            this.height = 0;
        }else {
            this.height = height;
        }
    }

    //Setter methods
    public void setWidth(double width) {
        if(width < 0){
            this.width = 0;
        }else {
            this.width = width;
        }
    }
    public void setHeight(double height) {
        if(height < 0){
            this.height = 0;
        }else {
            this.height = height;
        }
    }

    //Getter methods
    public double getWidth() {
        return width;
    }
    public double getHeight() {
        return height;
    }
    public double getArea(){
        return this.width * this.height;
    }

    public static void main(String[] args) {
        Wall area = new Wall();

        Wall wall = new Wall(5,4);
        System.out.println("area= " + wall.getArea());

        wall.setHeight(-1.5);
        System.out.println("width= " + wall.getWidth());
        System.out.println("height= " + wall.getHeight());
        System.out.println("area= " + wall.getArea());
    }
}
