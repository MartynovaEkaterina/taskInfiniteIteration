import java.util.Iterator;
import java.util.Random;

public class Randoms implements Iterable<Integer> {
    protected Random random = new Random();
    private int diff = 0;
    private int min = 0;
    private int max = 0;
    private int number = 0;

    public Randoms(int min, int max) {
        this.max = max;
        this.min = min;
        this.diff = max - min;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            @Override
            public boolean hasNext() {
                return true;
            }

            @Override
            public Integer next() {
                while (true) {
                    int number = (random.nextInt(diff + 1) + min);
                    return number;
                }
            }
        };
    }
}