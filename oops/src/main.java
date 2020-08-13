public class main {
    public static void main(String[] args){
        Car porsche = new Car();
        System.out.println(porsche.getDoor());
        System.out.println(porsche.getModel());
        porsche.setDoor(4);
        porsche.setModel("Maruti");
        System.out.println(porsche.getDoor());
        System.out.println(porsche.getModel());
    }
}
