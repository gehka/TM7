public class Main {

    public static void main(String[] args) {
        Scheduler scheduler = new Scheduler(0);
        Event event = new Event(0, scheduler);
        Event event2 = new Event(2, scheduler);
        scheduler.addEvent(event);
        scheduler.addEvent(event2);
        scheduler.runSimulation();

    }
}
