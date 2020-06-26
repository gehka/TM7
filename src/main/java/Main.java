import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random rand1 = new Random(1000);
        Random rand2 = new Random(1000);

        for (int i = 0; i < 15; i++) {
            System.out.println(rand1.nextInt());
            System.out.println(rand2.nextInt());
        }
    }
}
