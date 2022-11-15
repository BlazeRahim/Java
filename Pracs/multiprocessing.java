package Pracs;

public class multiprocessing {
    static public void main(String... args) {
        Thread t1 = new Thread() {
            public void run() {
                for (int i = 1; i < 10; i++) {
                    System.out.print(i + "-");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        Thread t2 = new Thread(){
            public void run() {
                for (int i = 1; i < 10; i++) {
                    System.out.println(i * i + ",");
                    try {
                        Thread.sleep(1100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        t1.start();
        t2.start();
    }
}
