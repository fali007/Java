import java.math.BigInteger;

public class Workbook3 {
    public static void main(String[] args){
        Thread thread=new Thread(new longMethod(new BigInteger("200000"), new BigInteger("1000000000")));
        thread.start();
        thread.interrupt();
    }
    private static class longMethod implements Runnable{
        private BigInteger base;
        private BigInteger power;
        @Override
        public void run() {
            System.out.println(base + "^"+power+"="+pow(base,power));
        }
        public longMethod(BigInteger base, BigInteger power){
            this.base=base;
            this.power=power;
        }
        private BigInteger pow(BigInteger base, BigInteger power){
            BigInteger result=BigInteger.ONE;
            for(BigInteger i =BigInteger.ONE;i.compareTo(power)!=0;i.add(BigInteger.ONE)){
                if(Thread.currentThread().isInterrupted()){
                    System.out.println("Premature interruption : "+result);
                    return BigInteger.ZERO;
                }
                result=result.multiply(base);
            }
            return result;
        }
    }
}
