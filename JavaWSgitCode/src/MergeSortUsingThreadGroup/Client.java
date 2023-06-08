package MergeSortUsingThreadGroup;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;


public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException  {
        List<Integer> listTosort = Arrays.asList(1,3,2,87,5,9);

        /*Number of threads without the Executor service , its 2 * (n-1)*/
        ExecutorService es = Executors.newFixedThreadPool(15);
        MergeSorter sorter = new MergeSorter(listTosort, es);
        Future<List<Integer>> promiseOfSort =  es.submit(sorter);

        List<Integer> sortedList = promiseOfSort.get();


        System.out.println(sortedList);
        es.shutdown();

    }
}
