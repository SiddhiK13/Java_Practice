public class NeedOfMultiThreading {
    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();


        for (int i = 1; i <= 100; i++) {
            System.out.printf("%d* ",i);
        }
        System.out.println("\n * task complete");

        for (int i = 1; i <= 100; i++) {
            System.out.printf("%d$ ",i);
        }
        System.out.println("\n $ task complete");

        for (int i = 1; i <= 100; i++) {
            System.out.printf("%d# ",i);
        }
        System.out.println("\n # task complete");

        long endTime = System.currentTimeMillis();
        System.out.printf("Totle time taken: %d", (endTime - startTime));
    }
}
