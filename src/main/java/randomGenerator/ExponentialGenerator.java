package randomGenerator;

import org.apache.commons.math3.distribution.ExponentialDistribution;

public class ExponentialGenerator {

    private long mean;
    private long seed;
    private ExponentialDistribution exponentialDistribution;
    public ExponentialGenerator(long mean, long seed) {
        this.mean = mean;
        this.seed = seed;
        this.exponentialDistribution = new ExponentialDistribution(this.mean);
        exponentialDistribution.reseedRandomGenerator(this.seed);
    }

    public long generateTimestamp(long old) {
        return (long) (old + this.exponentialDistribution.sample());
    }


}
