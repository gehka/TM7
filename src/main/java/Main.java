import org.apache.commons.math3.random.JDKRandomGenerator;
import org.apache.commons.math3.random.RandomDataGenerator;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        JDKRandomGenerator myGen1 = new JDKRandomGenerator();
        myGen1.setSeed(100);
        RandomDataGenerator rdg1 = new RandomDataGenerator(myGen1);

        JDKRandomGenerator myGen2 = new JDKRandomGenerator();
        myGen2.setSeed(100);
        RandomDataGenerator rdg2 = new RandomDataGenerator(myGen2);

        for (int i = 0; i < 15; i++) {
            System.out.println(rdg1.nextInt(0,100));
            System.out.println(rdg2.nextInt(0,100));
        }
    }
}
