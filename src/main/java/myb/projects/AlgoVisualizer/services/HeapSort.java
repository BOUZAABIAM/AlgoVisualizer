package myb.projects.AlgoVisualizer.services;

import myb.projects.AlgoVisualizer.models.Table;

import java.util.ArrayList;
import java.util.List;

public class HeapSort implements Sort {

    public List<List<Integer>> tables = new ArrayList<>();

    @Override
    public void sort(Table a) {
        List aux = new ArrayList();
        int count = a.getSize();
        //first place a in max-heap order
        int[] ar =a.getArr().stream()
                .mapToInt(Integer::intValue)
                .toArray();
        heapify(ar, count);
        int end = count - 1;
        while(end > 0){
            //swap the root(maximum value) of the heap with the
            //last element of the heap
            int tmp = a.getElementAtIndex(end);
            a.setElementAtIndex(end,a.getElementAtIndex(0));
            a.setElementAtIndex(0,tmp);

            aux = new ArrayList();
            for(int c:a.getArr()) aux.add(c);
            tables.add(aux);

            //put the heap back in max-heap order
            ar =a.getArr().stream()
                    .mapToInt(Integer::intValue)
                    .toArray();
            siftDown(ar, 0, end - 1);
            //decrement the size of the heap so that the previous
            //max value will stay in its proper place
            end--;
        }
    }

    public void heapify(int[] a, int count){
        //start is assigned the index in a of the last parent node
        int start = (count - 2) / 2; //binary heap
        while(start >= 0){
            //sift down the node at index start to the proper place
            //such that all nodes below the start index are in heap
            //order
            siftDown(a, start, count - 1);
            start--;
        }
        //after sifting down the root all nodes/elements are in heap order
    }

    public void siftDown(int[] a, int start, int end){
        List aux = new ArrayList();
        //end represents the limit of how far down the heap to sift
        int root = start;
        while((root * 2 + 1) <= end){      //While the root has at least one child
            int child = root * 2 + 1;           //root*2+1 points to the left child
            //if the child has a sibling and the child's value is less than its sibling's...
            if(child + 1 <= end && a[child] < a[child + 1])
                child = child + 1;           //... then point to the right child instead
            if(a[root] < a[child]){     //out of max-heap order
                int tmp = a[root];
                a[root] = a[child];
                a[child] = tmp;
                root = child;                //repeat to continue sifting down the child now

                aux = new ArrayList();
                for(int c:a) aux.add(c);
                tables.add(aux);
            }else
                return;
        }
    }
}
