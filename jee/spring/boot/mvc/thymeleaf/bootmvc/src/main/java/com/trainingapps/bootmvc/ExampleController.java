package com.trainingapps.bootmvc;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Controller
public class ExampleController {


    private Map<Long,User>store=new HashMap<>();

    private long generatedId;

    public long generateId(){
        return ++generatedId;
    }

    public ExampleController(){
         }

    @GetMapping("/greet")
    public ModelAndView greet() {
        String message = "welcome to spring webmvc";
        ModelAndView modelAndView = new ModelAndView("welcome", "msg", message);
        return modelAndView;
    }

    //     localhost:8585/getuser?id=5
    @GetMapping("/displayuser")
    public ModelAndView getUser(@RequestParam long id) {
        User modelObject = store.get(id);
        ModelAndView modelAndView = new ModelAndView("userprofile", "user", modelObject);
        return modelAndView;
    }

    @GetMapping("/getuser")
    public ModelAndView getUserForm(){
        return new ModelAndView("getuserform");
    }

    @GetMapping("/listusers")
    public ModelAndView listUsers(){
        Collection<User> users= store.values();
        ModelAndView modelAndView=new ModelAndView("listusers","users",users);
        return modelAndView;
    }

    @GetMapping("/adduser")
    public ModelAndView addUserPage(){
        return new ModelAndView("adduser");
    }

    @GetMapping("/processAddUser")
   public RedirectView addUserInStore(@RequestParam String name, @RequestParam int age){
        long id=generateId();
        User user=new User(id,name,age);
        store.put(id, user);
        String url="/displayuser?id="+id;
        RedirectView redirectView=new RedirectView(url);
        return redirectView;
   }

}
