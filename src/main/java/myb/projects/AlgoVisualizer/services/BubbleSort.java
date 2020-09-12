package myb.projects.AlgoVisualizer.services;

import myb.projects.AlgoVisualizer.models.Table;

import java.util.ArrayList;
import java.util.List;

public class BubbleSort implements Sort {
    public List<List<Integer>> tables = new ArrayList<>();

    @Override
    public void sort(Table arr) {
        List aux = new ArrayList();
        int n = arr.getSize();
        for (int i = 0; i < n-1; i++){
            for (int j = 0; j < n-i-1; j++){
                if (arr.getElementAtIndex(j) > arr.getElementAtIndex(j+1)) {
                    // swap arr[j+1] and arr[i]
                    int temp = arr.getElementAtIndex(j);
                    arr.setElementAtIndex(j,arr.getElementAtIndex(j+1));
                    arr.setElementAtIndex(j+1,temp);

                    aux = new ArrayList();
                    for(int c:arr.getArr()) aux.add(c);
                    tables.add(aux);
                }
            }
        }
    }
}
