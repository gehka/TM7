import java.util.PriorityQueue;

public class Scheduler {

    private long timestamp;
    private PriorityQueue<Event> eventQueue;
    private int counter;

    public Scheduler(long timestamp) {
        this.timestamp = timestamp;
        this.eventQueue = new PriorityQueue(new EventComparator());
        this.counter = 0;
    }

    public void addEvent(Event event) {
        this.eventQueue.add(event);
    }

    public void runSimulation() {
        while (!this.eventQueue.isEmpty()) {
            Event nextEvent = this.eventQueue.poll();
            this.timestamp = nextEvent.getEventTimestamp();
            nextEvent.execute();
            this.counter++;
        }
    }

    public long getTimestamp() {
        return timestamp;
    }

    void abroad() {
        this.eventQueue.clear();
    }

    public void printCounter() {
        System.out.println(this.counter);
    }
}
