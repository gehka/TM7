package randomGenerator;

import org.apache.commons.math3.random.JDKRandomGenerator;

import java.util.ArrayList;
import java.util.List;

public class MyGenerator {

    private JDKRandomGenerator generator;

    public MyGenerator(int seed) {
        this.generator = new JDKRandomGenerator(seed);
    }

    public List<Integer> constructRandomList() {
        List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 20; i++) {
            list.add(generator.nextInt(100));
        }
        return list;
    }
}
