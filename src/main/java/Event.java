import randomGenerator.ExponentialGenerator;

public abstract class Event {

    private long eventTimestamp;
    private Scheduler scheduler;
    private ExponentialGenerator exponentialGenerator;

    public Event(long eventTimestamp, Scheduler scheduler, ExponentialGenerator exponentialGenerator) {
        this.exponentialGenerator = exponentialGenerator;
        this.eventTimestamp = eventTimestamp;
        this.scheduler = scheduler;
    }

    public long getEventTimestamp() {
        return eventTimestamp;
    }

    public abstract void execute();

    protected Scheduler getScheduler() {
        return scheduler;
    }

    protected ExponentialGenerator getExponentialGenerator() {
        return exponentialGenerator;
    }
}
