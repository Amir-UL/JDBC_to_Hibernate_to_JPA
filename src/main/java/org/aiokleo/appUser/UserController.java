package org.aiokleo.appUser;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller // Giving the Access/Sending Request of/to home.jsp FILE
public class UserController {
    @RequestMapping(path = "home") // Which Request I want to Deal With.
    public String home(String name, HttpSession session){ // Getting the User Request.

        // Storing the request them in a Variable
//        String name = request.getParameter("name"); // Storing in {name} parameter And value will be found in key named {name}

        // Fetching the Data
        // If I don't SEND anything the name will store "null"
        session.setAttribute("name", name); // First the Key and then the Value
        System.out.println("Yes! " + name); // The Second I hit  @RequestMapping(path = "/") this end point The console prints "Yes!"
        return "home";
    }
}
