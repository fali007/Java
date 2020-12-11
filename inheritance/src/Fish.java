public class Fish extends Animal{
    private int gills;
    private int fins;
    private int eyes;
    public Fish(String name, int size, int weight, int gills, int eyes, int fins){
        super(name,1,1,size, weight);
        this.fins=fins;
        this.eyes=eyes;
        this.gills=gills;
    }
    public int getGills() { return gills; }
    public void setGills(int gills) { this.gills = gills; }
    public int getFins() { return fins; }
    public void setFins(int fins) { this.fins = fins; }
    public int getEyes() { return eyes; }
    public void setEyes(int eyes) { this.eyes = eyes; }

    private void rest(){
        System.out.println("called Fish.rest()");
    }
    private void moveMuscles(){
        System.out.println("called Fish.moveMuscles()");
    }
    public void swim(int speed){
        moveMuscles();
        backFin();
        super.move(speed);
    }
    private void backFin(){
        System.out.println("Called Fish.backFin()");
    }
}
//super used when method overriding and and call parent call members.
//This is used to call current class members. this is required when we have a parameter with same name as an instance variable.
//this usually used in getters and setters.
//super prevents recursive calls.
//super() must be the first statement of a constructor.
//avoid code duplication using proper implementation od constructors.

//static vs instance
//static methods are declared using static modifier.
//static methods cant access instance methods and instance variables directly.
//it doesn't require initialisation of object
//instance method require initialisation of class first before using the method.