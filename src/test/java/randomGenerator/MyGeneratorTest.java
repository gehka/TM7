package randomGenerator;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MyGeneratorTest {
    @Test
    public void testForPseudoRNG() {
        MyGenerator gen1 = new MyGenerator(100);
        MyGenerator gen2 = new MyGenerator(100);
        List<Integer> generatedListOne = gen1.constructRandomList();
        List<Integer> generatedListTwo = gen2.constructRandomList();
        for(int i = 0; i < generatedListOne.size(); i++) {
            assertTrue(generatedListOne.get(i).equals(generatedListTwo.get(i)));
        }
    }

}