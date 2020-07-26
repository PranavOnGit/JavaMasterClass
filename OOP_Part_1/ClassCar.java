package OOP_Part_1;

//CLASS

public class ClassCar {
    private int wheels;
    private String color;
    private String model;
    private int doors;

    //Setter methods
    public void setColor(String color) {
        this.color = color;
    }
    public void setModel(String model){
        String modelCheck = model.toLowerCase();
        if (modelCheck.equals("porsche")|| modelCheck.equals("audi")){
            this.model = model;
        }else {
            this.model = "unknown";
        }
    }

    //Getter methods
    public String getColor() {
        return color;
    }
    public String getModel(){
        return model;
    }

    public static void main(String[] args) {
        ClassCar porsche = new ClassCar();
        porsche.setColor("Blue");
        porsche.setModel("Audi");

        System.out.println(" Model of the car is: "+porsche.getModel());
        System.out.println(" Color of the car is: "+porsche.getColor());
    }
}
