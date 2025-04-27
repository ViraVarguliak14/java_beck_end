import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class TaskBoardImpl1 implements TaskBoard {
    private final BlockingQueue<Runnable> tasks;

    public TaskBoardImpl1(int capacity) {
        tasks = new ArrayBlockingQueue<>(capacity);
    }

    @Override
    public void setTask(Runnable task) {
        try {
            tasks.put(task);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new RuntimeException("Interrupted while setting task", e);
        }
    }

    @Override
    public Runnable getTask() {
        try {
            return tasks.take();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new RuntimeException("Interrupted while getting task", e);
        }
    }
}