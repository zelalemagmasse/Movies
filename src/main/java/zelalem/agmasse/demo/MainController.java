package zelalem.agmasse.demo;

import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.xml.stream.util.StreamReaderDelegate;

@Controller
public class MainController {
    @RequestMapping("/addmovie")
    public String homePage(Model model){
        model.addAttribute("aMovie",new Movies());
        return "index";
    }
    @GetMapping("/addmovie")
    public String loadMoviePage(Model model){
        model.addAttribute("aMovie",new Movies());
        return "movieform";
    }
    @PostMapping("/addmovie")
    public String saveMovie(@ModelAttribute("aMovie") Movies theMovie, Model model){
        model.addAttribute("aMovie",theMovie);
        return "confirmmovie";
    }
}
