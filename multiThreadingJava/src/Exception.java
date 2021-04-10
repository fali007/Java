public class Exception {
    public static void main(String[] args) throws InterruptedException{
        Thread thread= new Thread(new Runnable() {
            @Override
            public void run() {
                throw new RuntimeException("Intensional Exception occured");
            }
        });
        thread.setName("bilal bad thread");

        thread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler(){
            @Override
            public void uncaughtException(Thread t, Throwable e) {
                System.out.println("A critical error occured : - \n Thread name -" + t.getName() + "\n Error Message -"+e.getMessage());
            }
        });
        thread.start();
    }
}