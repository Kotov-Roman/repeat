package multithreading;


import java.util.concurrent.TimeUnit;

public class StopThread {
    private static boolean stopRequested;

    public static void main(String[] args)
            throws InterruptedException {
        Thread backgroundThread = new Thread(new Runnable() {
            public void run() {
                int i = 0;
                int a =0;
                while (!stopRequested) {
                    i++;
                    if (i==Integer.MAX_VALUE){
                        a++;
                        System.out.println(i);
                        System.out.println(stopRequested);
                        System.out.println(a);
                    }
//                    System.out.println(i);
//                    System.out.println(stopRequested);
                }
            }
        });
        backgroundThread.start();
        TimeUnit.SECONDS.sleep(1);
        stopRequested = true;
    }
}
