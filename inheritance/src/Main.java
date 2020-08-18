import java.net.SocketTimeoutException;

public class Main {
    public static void main(String[] args) {
//        Dog dog=new Dog("Hachi", 20, 55, "fur", 2, 4 , 1);
//        dog.eat();
////        dog.walk();
//        dog.run();
//        Fish fish =new Fish("goku", 5, 2 , 2, 2, 4);
//        fish.swim(5);

        staticInstance a = new staticInstance("Felix", "Anju");
        System.out.println(a.name);
        System.out.println(a.var);
        System.out.println(staticInstance.name);
//        System.out.println(staticInstance.var); shows error cause it is not static. it require object to get initialised
    }
}
