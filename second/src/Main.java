public class Main {
    public static void main(String[] args){
//        calculateScore(true,800,5,100);
//        calculateScore(false,200,3,100);
//        checkNumber(7);
//        checkNumber(-4);
//        checkNumber(0);
//        checkNumber(2,4);
//        swith a=new swith();
//        a.swith(1);
        loop lop =new loop();
        lop.loop(5);
        lop.whiile(5);

    }
    public static void calculateScore(boolean b,int score, int level,int bonus){
        if(b) {
            int total = score + level * bonus;
            System.out.println("Total score is : " + total);
        }
        else{
            System.out.println("Game not over");
        }
    }
    public static void checkNumber(int num){
        if(num==0){
            System.out.println("Number is Zero");
        }
        else if(num>0){
            System.out.println("Number is Positive");
        }
        else if(num<0) {
            System.out.println("Number is Negative");
        }
    }
    public static void checkNumber(int num, int bon){
        System.out.println(num+bon);
    }
}
