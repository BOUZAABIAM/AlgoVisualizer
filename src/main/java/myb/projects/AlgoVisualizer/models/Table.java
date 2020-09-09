package myb.projects.AlgoVisualizer.models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Table {
    private List<Integer> arr = new ArrayList<>();
    private int size;

    public Table(int size) {
        this.size = size;
        this.fillArray();
        this.shuffleArray();
        this.printArray();
    }

    public List<Integer> getArr() {
        return arr;
    }

    public void setArr(List<Integer> arr) {
        this.arr = arr;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void fillArray(){
        for(int i=1;i<=this.size;i++){
            this.arr.add(i);
        }
    }
    public void shuffleArray(){
        Collections.shuffle(this.arr);
    }

    public int getElementAtIndex(int i){
        return this.arr.get(i);
    }

    public void setElementAtIndex(int i, int element){
        this.arr.set(i,element);
    }

    public void printArray(){
        System.out.println(this.arr);
    }
}
