package Test.MergeSort;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MergeSort implements Callable<ArrayList<Integer>> {
    private ExecutorService es;
    private ArrayList<Integer> arrayList;
    MergeSort(ExecutorService es, ArrayList<Integer> unsortedlist)
    {
        this.es = es;
        this.arrayList = unsortedlist;
    }


    @Override
    public ArrayList call() throws Exception {

        if(arrayList.size() <=1)
            return arrayList;
        ArrayList<Integer> firsthalf = new ArrayList<>();
        ArrayList<Integer> secondhalf = new ArrayList<>();
        for(int i = 0; i < arrayList.size(); i++)
        {
            if(i < arrayList.size()/2)
            {
                firsthalf.add(arrayList.get(i));
            } else {
                secondhalf.add(arrayList.get(i));
            }
        }
        MergeSort leftsort = new MergeSort(es,firsthalf );
        MergeSort rightsort = new MergeSort(es, secondhalf);
        Future<ArrayList<Integer>> leftpromise =         es.submit(leftsort);
        Future<ArrayList<Integer>> rightpromise =    es.submit(rightsort);
        ArrayList<Integer> leftsorted  =  leftpromise.get();
        ArrayList<Integer> rightsorted  =  rightpromise.get();

        ArrayList<Integer> sortedList = new ArrayList<>();
        int leftIndex = 0;
        int rightIndex = 0;
        while(leftsorted.size() > leftIndex && rightsorted.size() > rightIndex)
        {
            if(leftsorted.get(leftIndex) < rightsorted.get(rightIndex))
            {
                sortedList.add(leftsorted.get(leftIndex));
                leftIndex++;
            } else {
                sortedList.add(rightsorted.get(rightIndex));
                rightIndex++;
            }
        }
        while(leftIndex < leftsorted.size())
        {
            sortedList.add(leftsorted.get(leftIndex));
            leftIndex++;            
        }
        while(rightIndex < rightsorted.size())
        {
            sortedList.add(rightsorted.get(rightIndex));
            rightIndex++;
        }
        return sortedList;
    }
}
