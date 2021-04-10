import java.lang.Thread.UncaughtExceptionHandler;

public class Main {
    public static void main(String[] args) throws InterruptedException{
        Thread thread= new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("We are on new thread : "+ Thread.currentThread().getName());
                System.out.println("Priority of the thread : "+Thread.currentThread().getPriority());
            }
        });
        thread.setName("bilal thread");
        thread.setPriority(Thread.MAX_PRIORITY);
        System.out.println("We are on thread : "+Thread.currentThread().getName()+ " - Before new thread");
        thread.start();
        System.out.println("We are on thread : "+Thread.currentThread().getName()+ " - Before new thread");
        Thread.sleep(1000);
    }
}
