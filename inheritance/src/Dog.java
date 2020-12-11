public class Dog extends Animal{
    public Dog(String name, int size, int weight, String coat, int eyes, int legs, int tail) {
        super(name, 1, 1, size, weight);
    }
    private int eyes;
    private int legs;
    private int tail;
    private String coat;

    private void chew(){
        System.out.println("dog.chew() called");
    }
    @Override
    public void eat(){
        System.out.println("Dog.eat() called");
        chew();
        super.eat();
    }
    public void walk(){
        System.out.println("Dog.walk() called");
        super.move(5);
    }
    public void run(){
        System.out.println("Dog.run() called");
        move(10);
    }
    private void moveLegs(int speed){
        System.out.println("Dog.moveLegs() called");
    }
    @Override
    public void move(int speed){
        System.out.println("Dog.move called");
        moveLegs(speed);
        super.move(speed);
    }
}
