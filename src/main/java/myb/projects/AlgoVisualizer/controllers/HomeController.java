package myb.projects.AlgoVisualizer.controllers;

import myb.projects.AlgoVisualizer.models.Table;
import myb.projects.AlgoVisualizer.services.InsertionSort;
import myb.projects.AlgoVisualizer.services.QuickSort;
import myb.projects.AlgoVisualizer.services.SelectionSort;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class HomeController {

    private int size = 200;

    @RequestMapping("/")
    public String home(ModelMap modelMap){
        return "home";
    }

    @RequestMapping(value = "/insertionsort")
    public String insertionSortView(ModelMap model) {
        Table arr = new Table(this.size);
        InsertionSort insertionSort = new InsertionSort();
        insertionSort.sort(arr);

        model.addAttribute("currentTable",insertionSort.tables);
        return "sortview";
    }

    @RequestMapping(value = "/mergesort")
    public String mergeSortView(ModelMap model) {
        return "sortview";
    }

    @RequestMapping(value = "/quicksort")
    public String quickSortView(ModelMap model) {
        Table arr = new Table(this.size);
        QuickSort quickSort = new QuickSort();
        quickSort.sort(arr);

        model.addAttribute("currentTable",quickSort.tables);
        return "sortview";
    }

    @RequestMapping(value = "/selectionsort")
    public String selectionSortView(ModelMap model) {
        Table arr = new Table(this.size);
        SelectionSort selectionSort = new SelectionSort();
        selectionSort.sort(arr);

        model.addAttribute("currentTable",selectionSort.tables);
        return "sortview";
    }
}
