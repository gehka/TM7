import org.apache.commons.math3.random.JDKRandomGenerator;
import randomGenerator.ExponentialGenerator;

public class SimpleSimulator implements Simulator {

    private Scheduler scheduler;
    private ExponentialGenerator generator;

    public SimpleSimulator() {
        this.generator = new ExponentialGenerator(10);
    }

    @Override
    public void runSimulation(int count) {
        JDKRandomGenerator randomGenerator = new JDKRandomGenerator(100);
        for (int i = 0; i < count; i++) {
            this.generator.setSeed(randomGenerator.nextInt());
            this.prepareSimulation();
            this.scheduler.run();
            this.scheduler.printCounter();
        }
    }

    private void prepareSimulation() {
        this.scheduler = new Scheduler(0);
        Event end = new EndEvent(1000000, this.scheduler, this.generator);
        Event event1 = new SimpleEvent(0, this.scheduler, this.generator);
        Event event2 = new SimpleEvent(0, this.scheduler, this.generator);
        this.scheduler.addEvent(event1);
        this.scheduler.addEvent(event2);
        this.scheduler.addEvent(end);
    }
}
