package myb.projects.AlgoVisualizer.services;

import myb.projects.AlgoVisualizer.models.Table;

import java.util.*;

public class InsertionSort implements Sort {
    public List<List<Integer>> tables = new ArrayList<>();
    @Override
    public void sort(Table arr) {
        int n = arr.getSize();
        List aux = new ArrayList();
        for(int c:arr.getArr()) aux.add(c);
        tables.add(aux);
        for (int i = 1; i < n; ++i) {
            int key = arr.getElementAtIndex(i);
            int j = i - 1;

            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && arr.getElementAtIndex(j) > key) {
                arr.setElementAtIndex(j+1,arr.getElementAtIndex(j));
                aux = new ArrayList();
                for(int c:arr.getArr()) aux.add(c);
                tables.add(aux);
                j = j - 1;

            }
            arr.setElementAtIndex(j+1,key);
            aux = new ArrayList();
            for(int c:arr.getArr()) aux.add(c);
            tables.add(aux);
        }

        //for(List<Integer> l :tables) System.out.println(l);
    }


}
