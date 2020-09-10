package myb.projects.AlgoVisualizer.services;

import myb.projects.AlgoVisualizer.models.Table;

import java.util.ArrayList;
import java.util.List;

public class QuickSort implements Sort{
    public List<List<Integer>> tables = new ArrayList<>();

    @Override
    public void sort(Table arr) {
        List aux = new ArrayList();
        for(int c:arr.getArr()) aux.add(c);
        tables.add(aux);
        int n = arr.getSize();
        int[] ar =arr.getArr().stream()
                .mapToInt(Integer::intValue)
                .toArray();
        startSort(ar, 0, n-1);
    }

    void startSort(int arr[], int low, int high)
    {
        if (low < high)
        {
            /* pi is partitioning index, arr[pi] is
              now at right place */
            int pi = partition(arr, low, high);

            // Recursively sort elements before
            // partition and after partition
            startSort(arr, low, pi-1);
            startSort(arr, pi+1, high);
        }
    }

    /* This function takes last element as pivot,
       places the pivot element at its correct
       position in sorted array, and places all
       smaller (smaller than pivot) to left of
       pivot and all greater elements to right
       of pivot */
    int partition(int arr[], int low, int high)
    {
        List aux = new ArrayList();
        int pivot = arr[high];
        int i = (low-1); // index of smaller element
        for (int j=low; j<high; j++)
        {
            // If current element is smaller than the pivot
            if (arr[j] < pivot)
            {
                i++;

                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                aux = new ArrayList();
                for(int c:arr) aux.add(c);
                tables.add(aux);
            }
        }

        // swap arr[i+1] and arr[high] (or pivot)
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        aux = new ArrayList();
        for(int c:arr) aux.add(c);
        tables.add(aux);

        return i+1;
    }
}
