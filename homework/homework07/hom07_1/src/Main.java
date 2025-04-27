public class Main {
    public static void main(String[] args) {
        TaskBoard taskBoard = new TaskBoardImpl1(5);

        Thread manager = new Thread(new Manager(taskBoard, 20));
        Thread worker1 = new Thread(new Worker(taskBoard, "Worker-1"));
        Thread worker2 = new Thread(new Worker(taskBoard, "Worker-2"));

        worker1.start();
        worker2.start();
        manager.start();
    }
}