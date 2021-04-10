import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Workbook {
    public static final int MAX_PASSWORD=9999;
    public static void main(String[] args){
        System.out.println("welcome");
        Random random=new Random();
        Vault vault=new Vault(random.nextInt(MAX_PASSWORD));

        List<Thread> threads= new ArrayList<>();
        threads.add(new AscendingHackerThread(vault));
        threads.add(new DescendingHackerThread(vault));
        threads.add(new PoliceThread());

        for(Thread thread:threads){
            thread.start();
        }
    }

    public static class Vault{
        private int password;
        public Vault(int password){
            this.password=password;
        }
        public boolean isCorrect(int guess){
            try{
                Thread.sleep(5);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
            return guess==this.password;
        }
    }

    private static abstract class HackerThread extends Thread{
        protected Vault vault;
        public HackerThread(Vault vault){
            this.vault=vault;
            this.setName(this.getClass().getSimpleName());
            this.setPriority(Thread.MAX_PRIORITY);
        }

        @Override
        public void start() {
            System.out.println("Starting thread : "+this.getName());
            super.start();
        }
    }
    public static class AscendingHackerThread extends HackerThread{
        public AscendingHackerThread(Vault vault){
            super(vault);
        }

        @Override
        public void run() {
            for(int i=0;i<MAX_PASSWORD;i++){
                if(vault.isCorrect(i)){
                    System.out.println("Correct password is :"+ i + " by "+ this.getName());
                    System.exit(0);
                }
            }
        }
    }
    public static class DescendingHackerThread extends HackerThread{
        public DescendingHackerThread(Vault vault){
            super(vault);
        }

        @Override
        public void run() {
            for(int i=MAX_PASSWORD;i>0;i--){
                if(vault.isCorrect(i)){
                    System.out.println("Correct password is : "+ i+ " by "+ this.getName());
                    System.exit(0);
                }
            }
        }
    }
    public static class PoliceThread extends Thread{
        @Override
        public void run() {
            for(int i=20;i>0;i--){
                try{
                    Thread.sleep(1000);
                }
                catch (InterruptedException e){
                    System.out.println(e.getMessage());
                }
                System.out.println(i);
            }
            System.out.println("Game over Hacker");
            System.exit(0);
        }
    }
}
