package com.softuni.mobilele.web;

import com.softuni.mobilele.services.roles.UserRoleService;
import com.softuni.mobilele.view.UserRoleViewModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/users")
public class UserController extends BaseController {
    private final UserRoleService userRoleService;


    @Autowired
    public UserController(UserRoleService userRoleService) {
        this.userRoleService = userRoleService;
    }


    @GetMapping("/register")
    public ModelAndView getRegister(ModelAndView modelAndView) {
        List<UserRoleViewModel> roleServiceAll = this.userRoleService.getAll();

        modelAndView.addObject("roles", roleServiceAll);

        return super.view("auth-register", modelAndView);
    }

    @PostMapping("/register")
    public ModelAndView postRegister() {
        return super.redirect("auth-login");
    }
}
