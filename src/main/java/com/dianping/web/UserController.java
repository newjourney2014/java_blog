package com.dianping.web;

import com.dianping.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by chenchen on 14-10-28.
 */
@Controller
public class UserController {
    private UserService userService;

    @Autowired(required = true)
    public void setUserService(UserService userService){
        this.userService = userService;
    }

    @RequestMapping("/edit/{id}")
    public String editPerson(@PathVariable("id") int id, Model model){
        model.addAttribute("person", userService.getUserById(id));
        return "person";
    }
}
