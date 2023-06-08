package MergeSortUsingThreadGroup;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public class MergeSorter implements Callable<List<Integer>> {

    private List<Integer> listTosort;
    private ExecutorService es;

    MergeSorter(List<Integer> listTosort, ExecutorService es)
    {
        this.listTosort = listTosort;
        this.es = es;
    }

    @Override
    public List<Integer> call() throws Exception {

        System.out.println("Processing in :" + Thread.currentThread().getName());
        if(listTosort.size() <= 1)
                return listTosort;
       List<Integer> firstHalf = new ArrayList<>();
       List<Integer> secondHalf  = new ArrayList<>();

       for(int i = 0; i < listTosort.size();i++)
       {
           if(i < listTosort.size()/2)
           {
               firstHalf.add(listTosort.get(i));
           } else {
               secondHalf.add(listTosort.get(i));
           }
       }

       MergeSorter sorterLeft = new MergeSorter(firstHalf, es);
        MergeSorter sorterRight = new MergeSorter(secondHalf, es);

        /*The below just uses single thread ( 2 threads 1, main and another 1 in thread pool, which builds recursive
         stack */
       //List<Integer> leftSortedList = sorterLeft.call();
        //List<Integer> rightSortedList = sorterRight.call();

        /*Instead below uses effeciently thread in threadpool to run each of the independent subtask*/
        Future<List<Integer>> promiseOfLeftSort = es.submit(sorterLeft);
        Future<List<Integer>> promiseOfRightSort = es.submit(sorterRight);
        List<Integer> leftSortedList  = promiseOfLeftSort.get();
        List<Integer> rightSortedList = promiseOfRightSort.get();

        List<Integer> sortedlist = new ArrayList<>();

       int leftIndex = 0, rigthIndex = 0;
       while(leftIndex < leftSortedList.size() && rigthIndex <  rightSortedList.size())
       {
           if(leftSortedList.get(leftIndex) < rightSortedList.get(rigthIndex)) {
               sortedlist.add(leftSortedList.get(leftIndex));
               leftIndex++;
           } else {
               sortedlist.add(rightSortedList.get(rigthIndex));
               rigthIndex++;
           }

       }
        while(leftIndex < leftSortedList.size())
        {
            sortedlist.add(leftSortedList.get(leftIndex++));
        }
        while(rigthIndex < rightSortedList.size())
        {
            sortedlist.add(rightSortedList.get(rigthIndex++));
        }
        return sortedlist;
    }
}
