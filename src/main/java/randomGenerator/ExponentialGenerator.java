package randomGenerator;

import org.apache.commons.math3.distribution.ExponentialDistribution;
import org.apache.commons.math3.random.JDKRandomGenerator;

public class ExponentialGenerator {

    private JDKRandomGenerator randomGenerator;
    private long mean;
    private long seed;
    private ExponentialDistribution exponentialDistribution;

    public ExponentialGenerator(long mean, long seed) {
        this.mean = mean;
        this.seed = seed;
        this.exponentialDistribution = new ExponentialDistribution(this.mean);
        exponentialDistribution.reseedRandomGenerator(this.seed);
        this.randomGenerator = new JDKRandomGenerator(100);
    }

    public ExponentialGenerator(long mean) {
        this.mean = mean;
        this.exponentialDistribution = new ExponentialDistribution(this.mean);
        this.randomGenerator = new JDKRandomGenerator(100);
    }

    public long generateTimestamp(long old) {
        return (long) (old + this.exponentialDistribution.sample());
    }

    public void randomizeSeed() {
        this.exponentialDistribution.reseedRandomGenerator(this.randomGenerator.nextInt(10000));
    }

    public void setSeed(long seed) {
        this.exponentialDistribution.reseedRandomGenerator(seed);
    }
}
