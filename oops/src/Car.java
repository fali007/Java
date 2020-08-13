public class Car {
    private int door;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    public void setDoor(int door){
        this.door=door;
    }
    public void setWheels(int wheels){
        this.wheels=wheels;
    }
    public void setModel(String model){
        this.model=model;
    }
    public void setEngine(String engine){
        this.engine=engine;
    }
    public void setColor(String color){
        this.color=color;
    }

    public int getDoor() {
        return this.door;
    }
    public int getWheels(){
        return this.wheels;
    }
    public String getEngine(){
        return this.engine;
    }
    public String getColor(){
        return this.color;
    }
    public String getModel(){
        return this.model;
    }

}
