package org.launchcode.controllers;

import org.launchcode.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("user")
public class UserController {

    public String userName=""; //temporary data storage
    public String email=""; //temporary data storage


    @RequestMapping(value = "")
    public String index (Model model,  @ModelAttribute User user){
        model.addAttribute("name", userName);

        return "user/index";
    }


    @RequestMapping(value = "add", method = RequestMethod.GET)
    public String add (Model model){
        return "user/add";
    }

    @RequestMapping(value = "add", method = RequestMethod.POST)
    public String add(Model model, @ModelAttribute User user, String verify){


        userName = user.getUsername();
        email = user.getEmail();

        model.addAttribute("name", userName);
        model.addAttribute("email", email);

        if(user.getPassword().equals(verify)){
            System.out.println("MATCH!");
            return "redirect:/user";
        }else{
            System.out.println("NO NO NO MATCH...");
            model.addAttribute("matchingPW", "passwords dont match");
            return "user/add";
        }

    }
}
