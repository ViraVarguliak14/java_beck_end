
//Компания разрабатывает систему мониторинга
// производительности веб-сервисов.
// Один из важных показателей — минимальная задержка ответа (latency) от сервера.
// Нужно реализовать компонент LatencyMonitor,
// который отслеживает самое минимальное время отклика,
// полученное из множества параллельных потоков,
// поступающих от разных серверов/кластеров.
// Задержка - случайное целое число (мс),
// в диапазоне от 0 до Integer.MAX_VALUE.
// Каждый из N потоков-серверов генерирует это число и вызывает метод
// updateLatency(double latency) класса LatencyMonitor.
// Реализация не должна использовать synchronized или
// блокировки — только атомарные структуры (Atomic*).

public class Main {
    public static void main(String[] args) throws InterruptedException{
        LatencyMonitor monitor = new LatencyMonitor();

        Thread[] threads = new Thread[100];
        for (int i = 0; i < 100; i++) {
            threads[i] = new Thread(() -> {
                long latency = (long) (Math.random() * 1000); // задержка от 0 до 999
                monitor.updateLatency(latency);
            });
            threads[i].start();
        }

        for (Thread t : threads) {
            t.join();
        }

        System.out.println("Минимальная задержка: " + monitor.getMinLatency() + " мс");
    }
}