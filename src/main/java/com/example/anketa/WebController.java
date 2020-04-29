package com.example.anketa;

import com.example.anketa.model.Anketa;
import com.example.anketa.repos.AnketaDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WebController {

    @Autowired
    private AnketaDAO anketaDAO;

    @RequestMapping("/")
    public String index(){
        return "index";
    }
    @RequestMapping(value = "/anket", method = RequestMethod.POST)
    public String result(@RequestParam String name, @RequestParam String surname,
                         @RequestParam String phone, Model model){
        Anketa anketa = new Anketa(name, surname, phone);
        anketaDAO.save(anketa);
        return "redirect:/results";
    }
    @RequestMapping("/results")
    public String allResults(Model model){
        model.addAttribute("anketas", anketaDAO.findAll());
        return "result";
    }
}
