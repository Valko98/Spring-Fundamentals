package example.springbootmobilele.web;

import example.springbootmobilele.model.dtos.UserRegisterDTO;
import example.springbootmobilele.services.UserService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserRegistrationController {

    private final UserService userService;

    public UserRegistrationController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/users/register")
    public String register() {
        return "auth-register";
    }

    @PostMapping
    public String register(@Valid UserRegisterDTO userRegisterDTO, BindingResult bindingResult) {
        if(bindingResult.hasErrors()) {
            return "redirect:/users/register";
        }
        return "redirect:/";
    }

}
