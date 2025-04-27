public class Worker implements Runnable {
    private final TaskBoard taskBoard;
    private final String name;

    public Worker(TaskBoard taskBoard, String name) {
        this.taskBoard = taskBoard;
        this.name = name;
    }

    @Override
    public void run() {
        while (true) {
            Runnable task = taskBoard.getTask();
            System.out.println(name + " is executing task...");
            task.run(); // запускаем задачу!
        }
    }
}