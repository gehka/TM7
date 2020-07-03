import randomGenerator.ExponentialGenerator;

public class SimpleEvent extends Event {

    public SimpleEvent(long eventTimestamp, Scheduler scheduler, ExponentialGenerator exponentialGenerator) {
        super(eventTimestamp, scheduler, exponentialGenerator);
    }

    public void execute() {
        super.getScheduler().addEvent(new SimpleEvent(super.getExponentialGenerator().generateTimestamp(super.getScheduler().getTimestamp()), super.getScheduler(), super.getExponentialGenerator()));
    }

}
