package org.aiokleo.appUser;

import org.aiokleo.appUser.AllNames;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller // Giving the Access/Sending Request of/to home.jsp FILE
public class UserController {
    @RequestMapping(path = "home", method = RequestMethod.GET) // Which Request I want to Deal With.
    public String home(){
        return "home";
    }

//    For Fetching Object
//    @GetMapping(path = "home")
//    public ModelAndView homeTwo(AllNames allNames) { // Getting the User Request.
//        // I am Excepting a Request @RequestParam("name") named {name}
//        // Advantage of ModelAndView is You can Hold multiple Values.
//
//        ModelAndView mv = new ModelAndView();
//        // Storing the request them in a Variable
////        String name = request.getParameter("name"); // Storing in {name} parameter And value will be found in key named {name}
//
//        // Fetching the Data
//        // If I don't SEND anything the name will store "null"
//        mv.addObject("allNames", allNames); // First the Key and then the Value
//        mv.setViewName("home");
//        return mv;
//    }

    @RequestMapping(value = "submit", method = RequestMethod.POST)
    public String submit(Model model, String firstName, String middleName, String lastName){

        model.addAttribute("f", firstName);
        model.addAttribute("m", middleName);
        model.addAttribute("l", lastName);

        return "user_submitted";
    }
}
