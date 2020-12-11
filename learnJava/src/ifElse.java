public class ifElse {
    public static void main(String[] args){
        String s1=new String("Hello");
        String s2=new String("Hello");

        if(s1.equals(s2)){
            System.out.println(true);
        }
        if(s1==s2){
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
}
