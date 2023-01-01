package org.aiokleo.appUser;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller // Giving the Access/Sending Request of/to home.jsp FILE
public class UserController {
    @Autowired
    UserRepository userRepository;
    // Getting The Data from End User/ Front-End
    @RequestMapping(path = "home", method = RequestMethod.GET) // Which Request I want to Deal With.
    public String home(){
        return "home";
    }
    @RequestMapping(value = "submit", method = RequestMethod.POST)
    public String submit(Model model, String firstName, String middleName, String lastName){

        model.addAttribute("firstName", firstName);
        model.addAttribute("middleName", middleName);
        model.addAttribute("lastName", lastName);

        return "user_submitted";
    }


//    For Fetching Object
    @GetMapping(path = "object")
    public ModelAndView homeTwo(AllNames allNames) { // Getting the User Request.
        // I am Excepting a Request @RequestParam("name") named {name}
        // Advantage of ModelAndView is You can Hold multiple Values.

        ModelAndView mv = new ModelAndView();
        // Storing the request them in a Variable
//        String name = request.getParameter("name"); // Storing in {name} parameter And value will be found in key named {name}

        // Fetching the Data
        // If I don't SEND anything the name will store "null"
        mv.addObject("allNames", allNames); // First the Key and then the Value
        mv.setViewName("object");
        return mv;
    }
//
    // Saving Data into DB from End Usr
   @RequestMapping(value = "admins") // Viewing the Form
    public String admin(){
        return "admins";
   }

   @RequestMapping(value = "addAdmins") // This will response to {action="addAdmins"}
    public String addToDB(Admins admins){
       userRepository.save(admins);
       return "thanks";
    }


    // Fetch by ID Data from DB
    @RequestMapping(value = "fetchData")
    public String fetchData(){
        return "fetchData";
    }

    @RequestMapping(value = "adminsData")
    public ModelAndView getAdmins(@RequestParam Long id){
        ModelAndView mv = new ModelAndView();
        Admins admins = userRepository.findById(id).orElse(new Admins());
        System.out.println(admins.getClass());
        mv.addObject(admins);
        mv.setViewName("adminsData");
        return mv;
    }

    // Find by Names
    @RequestMapping(value = "fetchByName")
    public ModelAndView getAdminsByName(@RequestParam String name){
        ModelAndView mv = new ModelAndView();
        List<Admins> adminsByNames = userRepository.findByName(name);
        System.out.println(adminsByNames.getClass());
        System.out.println(adminsByNames);
        mv.addObject(adminsByNames);
        mv.setViewName("adminsData");
        return mv;
    }

    // Fetch by Roll
    @RequestMapping(value = "fetchByRoll")
    public ModelAndView getAdminsRoll(@RequestParam String roll){
        ModelAndView mv = new ModelAndView();
        List<Admins> adminsByRoll = userRepository.findByRoll(roll);
        System.out.println(adminsByRoll.getClass());
        System.out.println(adminsByRoll);
        mv.addObject(adminsByRoll);
        mv.setViewName("adminsData");
        return mv;
    }


    // Deleting Data From DB
    @RequestMapping(value = "deleteData")
    public String deleteData(){
        return "delete_Data";
    }
    @RequestMapping(value = "deleteById")
    public ModelAndView deleteById(@RequestParam Long id){
        ModelAndView mv = new ModelAndView();
        Admins deletedAdmin = userRepository.findById(id).orElse(new Admins());
        mv.addObject(deletedAdmin);
        mv.setViewName("userDeleted");
        userRepository.deleteById(id);
        return mv;
    }

}
