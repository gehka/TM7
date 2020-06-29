public class Event {

    private long eventTimestamp;
    private Scheduler scheduler;

    public Event(long eventTimestamp, Scheduler scheduler) {
        this.eventTimestamp = eventTimestamp;
        this.scheduler = scheduler;
    }

    public void execute() {
        System.out.println(this.scheduler.getTimestamp());
        this.scheduler.addEvent(new Event(this.eventTimestamp + 10, this.scheduler));
    }

    public long getEventTimestamp() {
        return eventTimestamp;
    }
}
