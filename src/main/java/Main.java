import org.apache.commons.math3.random.JDKRandomGenerator;
import randomGenerator.ExponentialGenerator;

public class Main {

    public static void main(String[] args) {

        JDKRandomGenerator myGen = new JDKRandomGenerator(20);

        for (int i = 0; i < 100; i++) {
            Scheduler scheduler = new Scheduler(0);
            System.out.print(myGen.nextInt(100) + "       ");
            ExponentialGenerator exponentialGenerator = new ExponentialGenerator(10, myGen.nextInt(100));
            Event event1 = new NewEvent(0, scheduler, exponentialGenerator);
            Event event2 = new NewEvent(2, scheduler, exponentialGenerator);
            Event endEvent = new EndEvent(10000000, scheduler, exponentialGenerator);
            scheduler.addEvent(event1);
            scheduler.addEvent(event2);
            scheduler.addEvent(endEvent);
            scheduler.runSimulation();
            scheduler.printCounter();
        }
    }
}
