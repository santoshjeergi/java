package Test.MergeSort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {
    public static void main(String[] args) throws Exception{
       // List<Integer> listTosort = Arrays.asList(1,3,2,87,5,9);

        List<Integer> arrayList = Arrays.asList(34, 2, 5, 61, 43);

        ExecutorService es  = Executors.newFixedThreadPool(15);
        ArrayList<Integer> arrayList1 = new ArrayList<>(arrayList);
        MergeSort sort = new MergeSort(es, arrayList1);
        Future<ArrayList<Integer>> arrayListFuture  = es.submit(sort);
        ArrayList<Integer> arrayList2 = arrayListFuture.get();

        System.out.println(arrayList2);
        es.shutdown();



    }
}
