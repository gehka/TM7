import java.util.PriorityQueue;

public class Scheduler {

    private long timestamp;
    private PriorityQueue<Event> eventQueue;

    public Scheduler(long timestamp) {
        this.timestamp = timestamp;
        this.eventQueue = new PriorityQueue(new EventComparator());
    }

    public void addEvent(Event event) {
        this.eventQueue.add(event);
    }

    public void runSimulation() {
        while (true) {
            Event nextEvent = this.eventQueue.poll();
            this.timestamp = nextEvent.getEventTimestamp();
            nextEvent.execute();
        }
    }

    public long getTimestamp() {
        return timestamp;
    }

}
