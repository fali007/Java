public class Hello {
    public static void main(String[] args){
        System.out.println("Hello World");

        int myFirstNumber = 5;
        int mySecondNumber = 12;
        int myThirdNumber = 6;
        int myTotal=myFirstNumber+mySecondNumber+myThirdNumber;
        System.out.println(myTotal);
        int last=1000;
        System.out.println(last-myTotal);

        int minValue = Integer.MIN_VALUE;
        int maxValue = Integer.MAX_VALUE;
        System.out.println("Max value : "+ maxValue);
        System.out.println("Min value : "+ minValue);

        byte b_minValue = Byte.MIN_VALUE;
        byte b_maxValue = Byte.MAX_VALUE;
        System.out.println("Byte Max value : "+ b_maxValue);
        System.out.println("Byte Min value : "+ b_minValue);

        short name=200;
        int age=200000;
        short tot= (short) (name+age);
        System.out.println(tot);

        typeLong typeLong=new typeLong();
        typeLong.tLong();

        poundToKilo kilo=new poundToKilo();
        System.out.println(kilo.poundToKilo(200));

        typeChar Char= new typeChar();
        Char.tChar();

        string nam=new string();
        nam.string();

        ifThen var1=new ifThen();
        var1.ifThen();

        ternary ter=new ternary();
        ter.ternary();
    }
}
