package myb.projects.AlgoVisualizer.controllers;

import myb.projects.AlgoVisualizer.models.Table;
import myb.projects.AlgoVisualizer.services.BubbleSort;
import myb.projects.AlgoVisualizer.services.InsertionSort;
import myb.projects.AlgoVisualizer.services.QuickSort;
import myb.projects.AlgoVisualizer.services.SelectionSort;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class HomeController {

    private int size = 10;

    @PostMapping("/")
    public String save(@ModelAttribute("size")int s, ModelMap model) {
        model.addAttribute("size", s);
        this.size = s;
        return "sortview";
    }

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

    @RequestMapping(value = "/bubblesort")
    public String mergeSortView(ModelMap model) {
        Table arr = new Table(this.size);
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.sort(arr);

        model.addAttribute("currentTable",bubbleSort.tables);
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
