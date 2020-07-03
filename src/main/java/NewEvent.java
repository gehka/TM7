import randomGenerator.ExponentialGenerator;

public class NewEvent extends Event {

    public NewEvent(long eventTimestamp, Scheduler scheduler, ExponentialGenerator exponentialGenerator) {
        super(eventTimestamp, scheduler, exponentialGenerator);
    }

    public void execute() {
        //System.out.println(super.getScheduler().getTimestamp());
        super.getScheduler().addEvent(new NewEvent(super.getExponentialGenerator().generateTimestamp(super.getScheduler().getTimestamp()), super.getScheduler(), super.getExponentialGenerator()));
    }

}
