import java.util.Random;

public class Loader implements Runnable{


    private String name;
    private int nBox;
    private int capacity;
    private Warehouse warehouse1;
    private Warehouse warehouse2;
    private int done = 0;

    private static boolean winnerDeclared = false;
    private static final Object winnerLock = new Object();


    public Loader(String name, int nBox, int capacity, Warehouse warehouse1, Warehouse warehouse2){
        this.name = name;
        this.nBox = nBox;
        this.capacity = capacity;
        this.warehouse1 = warehouse1;
        this.warehouse2 = warehouse2;
    }

    @Override
    public void run() {
        while (done<nBox) {
            if (nBox - done >= 2) {
                // Якщо залишилось хоча б 2 коробки
                warehouse1.addValue(1);
                warehouse2.addValue(1);
                done += 2;
            } else if (nBox - done == 1) {
                warehouse1.addValue(1);
                done += 1;
            }

            try {
                Thread.sleep(5 + new Random().nextInt(11));
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println(name + " finished. Delivered: " + done + " boxes");

        synchronized (winnerLock) {
            if (!winnerDeclared) {
                winnerDeclared = true;
                System.out.println(" " + name + " is the FIRST to finish and wins a bonus!");
            }
        }
    }
}
