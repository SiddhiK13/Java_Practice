package package2;

public class Threadstate extends Thread {
    @Override
    public void run() {
        try {
            Thread.sleep(4000);
            System.out.printf("from inside run %s",getState());
        }catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
