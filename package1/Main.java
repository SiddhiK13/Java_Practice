package package1;

public class Main {
    public static void main(String[] args) {
        HelloThread t1 = new HelloThread();
        HelloThread t2 = new HelloThread();

        t1.start();
        t2.start();
    }
}
