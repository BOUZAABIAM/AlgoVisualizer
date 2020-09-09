package myb.projects.AlgoVisualizer.controllers;

import myb.projects.AlgoVisualizer.models.Table;
import myb.projects.AlgoVisualizer.services.InsertionSort;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home(ModelMap modelMap){
        return "home";
    }

    @RequestMapping(value = "/insertionsort")
    public String insertionSortView(ModelMap model) {
        Table arr = new Table(10);
        InsertionSort insertionSort = new InsertionSort();
        insertionSort.sort(arr);
        model.addAttribute("currentTable",arr.getArr());
        return "sortview";
    }

    @RequestMapping(value = "/mergesort")
    public String mergeSortView(ModelMap model) {
        return "sortview";
    }

    @RequestMapping(value = "/quicksort")
    public String quickSortView(ModelMap model) {
        return "sortview";
    }

    @RequestMapping(value = "/selectionsort")
    public String selectionSortView(ModelMap model) {
        return "sortview";
    }
}
