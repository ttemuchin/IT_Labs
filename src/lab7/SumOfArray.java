package lab7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class SumOfArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 5, 6, 1, 2, 3, 2};
        int sum = sumOfArray(array);
        System.out.println(sum);
        System.out.println(Arrays.stream(array).sum());
    }

    public static int sumOfArray(int[] array) {
        int count = array.length / 4 + 1;
        int sum = 0;
        if (count > 1) {
            ExecutorService pool  = Executors.newFixedThreadPool(count);
            ArrayList<Future<Integer>> futures = new ArrayList<>();
            for (int i = 0; i < count; i++) {
                int[] slice = Arrays.copyOfRange(array,i * count, (i+1) * count);
                futures.add(pool.submit(new CallableClass(slice)));
            }
            if (array.length % 4 != 0) {
                int[] slice  = Arrays.copyOfRange(array, 4 * (count - 1) + 1, array.length);
                futures.add(pool.submit(new CallableClass(slice)));
            }
            for (int i = 0; i < futures.size(); i++) {
                try {
                    sum += futures.get(i).get();
                } catch (InterruptedException | ExecutionException e) {
                    System.out.println(e.getMessage());
                }
            }
            pool.close();
            return sum;
        } else {
            for (int i : array) {
                sum += i;
            }
        }
        return sum;
    }
}
