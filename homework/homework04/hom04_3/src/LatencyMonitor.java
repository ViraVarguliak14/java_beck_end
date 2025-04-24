import java.util.concurrent.atomic.AtomicLong;

public class LatencyMonitor {
    private AtomicLong minLatency = new AtomicLong(Long.MAX_VALUE);

    public void updateLatency(long latency) {
        while (true) {
            long current = minLatency.get();
            if(latency >= current) {
                return;
            }if(minLatency.compareAndSet(current,latency)){
                break;
            }

        }

    }

    public long getMinLatency() {
        return minLatency.get();
    }
}
