public class loop {
    public static void loop(int number){
        for(int i=0;i<number;i++){
            System.out.println("number is : "+i);
        }
    }
    public static void whiile(int number){
        int i=0;
        while(i<number){
            System.out.println("number is : "+i);
            i+=1;
        }
    }
    public static void do_while(int number){
        int i=0;
        do{
            System.out.println("The number is : "+i);
            i+=1;
            if(i>number){
                break;
            }
        }while(i<number);
    }
}
