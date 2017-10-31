package demo.meng.web;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import demo.meng.model.User;
import demo.meng.service.MengUserInterface;

@Controller
@RequestMapping("/user")
public class UserController {

	//@Resource
    //private MengUserInterfaceImplement service;
	@Autowired
	@Qualifier(value="userService")
	private MengUserInterface service;
	
	@RequestMapping("/showUser")
    public String toIndex(HttpServletRequest request, Model model) {
        int userId = Integer.parseInt(request.getParameter("id"));
        User user = service.getUserById(userId);
        System.out.println(user.getUserName()+"////");
        model.addAttribute("user", user);
        return "meng";
    }
	
}
