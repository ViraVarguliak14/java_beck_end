public class Main {
    private static final int N_BOX = 1000;
    private static final int CAPACITY = 1;

    public static void main(String[] args) {

        Warehouse warehouse1 = new Warehouse("#1");
        Warehouse warehouse2 = new Warehouse("#2");
        Thread[] loaders = {
                new Thread(new Loader("Jack",N_BOX,CAPACITY,warehouse1, warehouse2)),
                new Thread(new Loader("Max",N_BOX,CAPACITY,warehouse1, warehouse2)),
                new Thread(new Loader("Alex",N_BOX,CAPACITY,warehouse1, warehouse2)),
                new Thread(new Loader("John",N_BOX,CAPACITY,warehouse1, warehouse2)),
                new Thread(new Loader("Nick",N_BOX,CAPACITY,warehouse1, warehouse2)),
        };

        for (Thread thread : loaders){
            thread.start();
        }

        for (Thread thread: loaders){
            try {
                thread.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }


        System.out.println(warehouse1);
        System.out.println(warehouse2);
    }
}