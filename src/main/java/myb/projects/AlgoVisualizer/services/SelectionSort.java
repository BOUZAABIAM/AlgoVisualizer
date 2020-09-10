package myb.projects.AlgoVisualizer.services;

import myb.projects.AlgoVisualizer.models.Table;

import java.util.ArrayList;
import java.util.List;

public class SelectionSort implements Sort {
    public List<List<Integer>> tables = new ArrayList<>();
    @Override
    public void sort(Table arr) {

        List aux = new ArrayList();
        for(int c:arr.getArr()) aux.add(c);
        tables.add(aux);

        int n = arr.getSize();
        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++){
                if (arr.getElementAtIndex(j) < arr.getElementAtIndex(min_idx)) min_idx = j;
            }


            // Swap the found minimum element with the first
            // element
            int temp = arr.getElementAtIndex(min_idx);
            arr.setElementAtIndex(min_idx,arr.getElementAtIndex(i));
            arr.setElementAtIndex(i,temp);

            aux = new ArrayList();
            for(int c:arr.getArr()) aux.add(c);
            tables.add(aux);
        }
    }
}
