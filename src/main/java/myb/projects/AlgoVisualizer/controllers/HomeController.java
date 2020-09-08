package myb.projects.AlgoVisualizer.controllers;

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

        return "home";
    }
}
