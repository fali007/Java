public class swith {
    public void swith(int num){
        switch(num){
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4: case 5: case 6:
                System.out.println("4, 5 or 6");
                break;
            default:
                System.out.println("Neither 1, 2 or 3");
                break;
        }
    }
}
