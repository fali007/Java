//interrupt
public class Workbook2 {
    public static void main(String[] args){
        Thread thread=new Thread(new Blocking());
        thread.start();
        thread.interrupt();
    }
    private static class Blocking implements Runnable{
        @Override
        public void run() {
            try {
                Thread.sleep(100000);
            }
            catch (InterruptedException e){
                System.out.println(e.getMessage() + " Blocking Thread, Exiting");
            }
        }
    }
}
