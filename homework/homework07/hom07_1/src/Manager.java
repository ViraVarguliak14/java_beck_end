public class Manager implements Runnable {
    private final TaskBoard taskBoard;
    private final int numberOfTasks;

    public Manager(TaskBoard taskBoard, int numberOfTasks) {
        this.taskBoard = taskBoard;
        this.numberOfTasks = numberOfTasks;
    }

    @Override
    public void run() {
        for (int i = 0; i < numberOfTasks; i++) {
            int taskId = i;
            taskBoard.setTask(() -> System.out.println("Running task " + taskId));
            System.out.println("Manager posted task " + taskId);
            /*try {
                Thread.sleep(100); // для красоты
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }*/
        }
    }
}