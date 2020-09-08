package myb.projects.AlgoVisualizer.controllers;

import myb.projects.AlgoVisualizer.models.Table;
import myb.projects.AlgoVisualizer.services.InsertionSort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String home(ModelMap modelMap){
        return "home";
    }

    @RequestMapping("/insertionsort")
    public String insertionSortView(ModelMap model) {
        Table arr = new Table(10);
        InsertionSort insertionSort = new InsertionSort();
        insertionSort.sort(arr);
        return "home";
    }
}
