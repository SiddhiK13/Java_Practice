package package2;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        
        Threadstate t1 = new Threadstate();

        System.out.printf("create the thread %s", t1.getState());

        t1.start();
        t1.join();

        System.out.printf("thread finished %s",t1.getState());
    }
}
