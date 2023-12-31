package lab7;
import java.util.concurrent.Callable;

public class CallableClass implements Callable<Integer> {
    private final int[] slice;

    public CallableClass(int[] slice) {
        this.slice = slice;
    }
    public Integer call() {
        int sum = 0;
        for (int i : slice) {
            sum += i;
        }
        return sum;
    }
}
