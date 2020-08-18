public class Car extends Vehicle{
    private int door;
    private int engineCapaciy;
    public Car(String name, int door, int engineCapaciy){
        super(name);
        this.door=door;
        this.engineCapaciy=engineCapaciy;
    }
}
