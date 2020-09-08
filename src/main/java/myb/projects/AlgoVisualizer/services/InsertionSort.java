package myb.projects.AlgoVisualizer.services;

import myb.projects.AlgoVisualizer.models.Table;

public class InsertionSort implements Sort {

    @Override
    public void sort(Table arr) {
        //arr = new Table(this.size);
        int n = arr.getSize();
        for (int i = 1; i < n; ++i) {
            int key = arr.getElementAtIndex(i);
            int j = i - 1;

            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && arr.getElementAtIndex(j) > key) {
                arr.setElementAtIndex(j+1,arr.getElementAtIndex(j));
                j = j - 1;
            }
            arr.setElementAtIndex(j+1,key);
        }
        arr.printArray();
    }


}
