import randomGenerator.ExponentialGenerator;

public class EndEvent extends Event {
    public EndEvent(long eventTimestamp, Scheduler scheduler, ExponentialGenerator exponentialGenerator) {
        super(eventTimestamp, scheduler, exponentialGenerator);
    }

    @Override
    public void execute() {
        super.getScheduler().abroad();
    }
}
