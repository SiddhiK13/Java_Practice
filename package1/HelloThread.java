package package1;

import java.util.*;

public class HelloThread extends Thread {

    private int threadNumber;

    public void HelloThread (int threadNumber) {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        for (int i = 0; i<10; i++) {
            System.out.printf("(%d) Hello from thread-%d\n" ,threadNumber );  
        }
    }
}
